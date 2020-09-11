package ru.job4j.bank;

import ru.job4j.bank.Account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User foundUser = findByPassport(passport);
        if (foundUser != null) {
            List accounts = users.get(foundUser);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        return users.keySet().stream().
                filter(user -> user.getPassport().equals(passport)).
                findAny().
                orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        User foundUser = findByPassport(passport);
        if (foundUser != null) {
            return users.get(foundUser).stream().
                    filter(account -> account.getRequisite().equals(requisite)).
                    findAny().
                    orElse(null);
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite,
                                 double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account dstAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && dstAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            dstAccount.setBalance(dstAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
