package ru.geekbrains.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumber();

    }
    //2
    public static void printThreeWords(){
        System.out.println("Orange \nBanana \nApple");
    }
    //3
    public static void checkSumSign(){
        int a = 1;
        int b = -2;
        if (a + b >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    //4
    public static void printColor(){
        int value = 1;
        if(value <= 0){
            System.out.println("Красный");
        } else if(value <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    //5
    public static void compareNumber(){
        int a = 1, b = 2;
        if(a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
