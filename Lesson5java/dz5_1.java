// Написать простой класс Телефонный Справочник (с помощью HashMap), который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.


package Lesson5java;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class dz5_1 {
    public static void main(String[] args) {
        System.out.println("добавьте контакт в телефонную книгу");
        AddNewContact("Иванов", "4444333322221111");
        AddNewContact("Иванов", "1234567890");
        AddNewContact("Петров", "222333344445555");
        ShowEntryContact("Иванов");
        ShowEntryContact("Петров");
        ShowEntryContact("Пушкин");
        System.out.println("Удалить контакт из телефонной книги");
        RemoveContact("Иванов", "4444333322221111");
        RemoveContact("Пушкин", "222333344445555");
        ShowEntryContact("Иванов");
        ShowEntryContact("Петров");
        ShowEntryContact("Пушкин");
    }

    public static Map<String, LinkedList<String>> PhoneBook = new HashMap<>();

    public static void AddNewContact(String name, String phoneNumber) {
        if (PhoneBook.containsKey(name)) {
            PhoneBook.get(name).add(phoneNumber);
        } else {
            LinkedList<String> numbers = new LinkedList<String>();
            numbers.add(phoneNumber);
            PhoneBook.put(name, numbers);
        }
    } 

    public static LinkedList<String> SearchPhoneNumbers(String name) {
        if (!PhoneBook.containsKey(name)) return null;
        return PhoneBook.get(name);
    }

    public static void ShowEntryContact(String name) {
        LinkedList<String> phoneNumbers = SearchPhoneNumbers(name);
        if (phoneNumbers == null) {
            System.out.printf("%s отсутствует в телефонной книге.\n", name);
        } else if (phoneNumbers.size() == 0) {
            System.out.printf("%s нет телефонных номеров.\n", name);
        } else {
            System.out.printf("%s номер есть: %s\n", name, String.join(", ", phoneNumbers));;
        }        
    }

    public static void RemoveContact(String name, String phoneNumber) {
        if (PhoneBook.containsKey(name)) {
            PhoneBook.get(name).remove(phoneNumber);
        }
    }
}
