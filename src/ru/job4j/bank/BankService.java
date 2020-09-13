package ru.job4j.bank;

import ru.job4j.bank.Account;

import java.util.*;
import java.util.stream.Collectors;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> foundUser = findByPassport(passport);
        if (foundUser.isPresent()) {
            List<Account> accounts = users.get(foundUser.get());
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream().
                filter(user -> user.getPassport().equals(passport)).
                findAny();
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> foundUser = findByPassport(passport);
        return foundUser.flatMap(user -> users.get(user).stream().
                filter(account -> account.getRequisite().equals(requisite)).
                findAny());
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite,
                                 double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> dstAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && dstAccount.isPresent() && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            dstAccount.get().setBalance(dstAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
