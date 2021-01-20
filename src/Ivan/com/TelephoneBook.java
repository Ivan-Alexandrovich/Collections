package Ivan.com;

import java.security.KeyStore;
import java.util.*;

public class TelephoneBook {
    private Map<String,String> telephoneBook; //переменная типа Map, словарь (ключ-значение)

    TelephoneBook() { //конструктор
        telephoneBook = new HashMap<>(); //объект класса ссылается на новый словарь
    }

    public void add(String number, String surname) {
        telephoneBook.put(number, surname); //добавление в словарь номера и фамилии осуществляется методом put
        //здесь ключ - телефон (он уникален), а значение - фамилия (они могут повторяться)
    }

    public void get(String surname) {
        if (telephoneBook.containsValue(surname)) { //если переменная класса(словарь) содержит значение фамилии передаваемой
            //в параметры фамилии
            List phoneBook = new ArrayList(telephoneBook.entrySet()); //то мы в список запишем все пары ключ-значение
            //Метод entrySet() возвращает список всех пар в нашей HashMap, данные в списке phoneBook хранятся в формате
            //[phone1=surname1, phone2=surname2...]. Map.Entry<String, String> - это объект словаря telephoneBook
            //В словаре же данные хранятся в формате {phone1=surname1, phone2=surname2...}
            for (Map.Entry itemInMap : telephoneBook.entrySet()) { //цикл for-each для элементов из списка в который
                //мы переписали все элементы из словаря.  Map.Entry - это каждая пара словаря
                if (itemInMap.getValue().equals(surname)) { //если возвращенное объектом значение равно фамилии
                    System.out.println(itemInMap.getValue() + " : " + itemInMap.getKey()); //выводим это значение и ключ (телефон)
                }
            }
        }
        else {
            System.out.println("There is no such surname in the list: " + surname); //иначе выводим что такой фамилии нет
        }
    }
}
