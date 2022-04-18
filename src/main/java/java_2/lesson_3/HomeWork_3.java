package java_2.lesson_3;

import java.util.*;

public class HomeWork_3 {


    public static void main(String[] args) {

    // 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
        String[] String = {"Кошка", "Кошка","Собака", "Попугай", "Черепаха", "Ежик", "Мышь", "Морская свинка", "Кошка", "Хомяк", "Кошка", "Собака"};
        printUniqueString(String);

    // 2.
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иван", 8_911_111_11);
        phoneBook.add("Иван", 8_922_222_22);
        phoneBook.get("Иван");

    }



    public static void printUniqueString(String[] strings){
        Set<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        set.addAll(Arrays.asList(strings));

        for (String s : set) {
            for (String m : strings) {
                if(s.equals(m)){
                    count++;
                }
            }
            map.put(s, count);
            count = 0;
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

}
