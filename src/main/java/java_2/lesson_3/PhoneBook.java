package java_2.lesson_3;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
     public HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String lastName, int phoneNumber){
        ArrayList<Integer> list = new ArrayList<>();
        if(!phoneBook.containsKey(lastName)){
           list.add(phoneNumber);
           phoneBook.put(lastName, list);
        } else {
            list = phoneBook.get(lastName);
            list.add(phoneNumber);
            phoneBook.put(lastName, list);
        }
    }

    public void get(String lastName){
        System.out.println(lastName + " : " + phoneBook.get(lastName));
    }

}
