package ru.geekbrains.lesson2;

public class HomeWorkApp_two {
    public static void main(String[] args) {

        System.out.println(getBoolean(10, 11));
        checkNumber(-1);
        System.out.println(checkNumberToGetBoolean(2));
        printString("Задание №4", 5);
        System.out.println(checkYear(2200));

    }
    // 1.
    public static boolean getBoolean(int a, int b){
        int ab = a + b;
        if(ab > 10 && ab <= 20)
            return true;
        else
            return false;
    }
    // 2.
    public static void checkNumber(int a){
        if(a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    //3.
    public static boolean checkNumberToGetBoolean(int a){
        if(a >= 0){
            return false;
        } else {
            return true;
        }
    }
    //4.
    public static void printString(String line, int a){
        for(int i = 0; i < a; i++){
            System.out.println(line);
        }
    }
    //5.
    public static boolean checkYear(int year){
        if(year % 4 == 0 && year % 400 == 0){
            return true;
        } else {
            return false;
        }
    }

}
