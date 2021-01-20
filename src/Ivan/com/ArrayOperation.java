package Ivan.com;

import java.io.*;
import java.util.*;

public class ArrayOperation { //класс в котором будут находиться операции с массивом
    public static List<String> fillArray(List<String> array) { //метод который заполняет список List<String> array
        array.add("1 string");                                 //и возвращает его же
        array.add("2 string");
        array.add("3 string");
        array.add("1 String");
        array.add("3 String");
        array.add("4 string");
        array.add("5 string");
        array.add("5 String");
        array.add("6 string");
        array.add("7 string");
        return array;
    }
    //метод который будет выводить в консоль сколько раз встретился элемент в списке
    public static void printUniqueWords(List<String> array) {
        Set<String> tempArray = new LinkedHashSet<>(); //временный список интерфейса Set (насоедуется от интерфейса коллекций),
        //представляет набор уникальных элементов, класс HashSet представляет собой хэш-таблицу (структуру, в которой
        //все объекты имеют уникальный ключ (хеш-код)).LinkedHashSet - в этом списке элементы хранятся в порядке добавления
        for (String itemInArray : array) { //цикл for-each (пробегаемся по всем элементам списка array)
            String arrayElement = itemInArray.toLowerCase(); //слова в элементах могут быть одинаковы, но использоваться разный регистр
            //поэтому преобразуем все элементы к строчным буквам
            tempArray.add(arrayElement); //добавили преобразованный элемент в список Сет tempArray
        }
        System.out.println("Unique elements in list: " + tempArray);
        for (String itemInTempArray : tempArray) { //пробегаемся по всем элементам списка tempArray
            int counter = 0; //счетчик количества совпадений элементов в списке, каждую итерацию мы его должны обнулять
            //так как заново будем сравнивать элемент из tempArray со всеми элементами array
            for (String itemInMainArray : array) { //пока элемент из списка tempArray фиксирован, теперь пробегаемся по всем
                // элементам старого массива array
                String s = itemInMainArray.toLowerCase(); //преобразуем элементы array к маленькому регистру
                if (itemInTempArray.equals(s)) {
                    counter++; //увеличиваем счетчик если элемент tempArray совпал с элементом array
                }
            }
            System.out.println(itemInTempArray + " repeated in the list " + counter + " times"); //выводим во внутреннем
            //цикле каждый раз после сравнения очередного элемента tempArray со всеми элементами array
        }
    }
}

