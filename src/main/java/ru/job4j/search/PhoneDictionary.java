package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> checkName = person -> person.getName().contains(key);
        Predicate<Person> checkSurname = person -> person.getSurname().contains(key);
        Predicate<Person> checkAddress = person -> person.getAddress().contains(key);
        Predicate<Person> checkPhone = person -> person.getPhone().contains(key);
        var combine = checkName.or(checkSurname.or(checkAddress.or(checkPhone)));
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}