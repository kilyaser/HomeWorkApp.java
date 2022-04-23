package ru.geekbrains.lesson6;

public class Solution {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsic");
        Cat cat1 = new Cat("Murka");
        Cat cat2 = new Cat("Vaska");

        Dog dog = new Dog("Muhtar");
        Dog dog1 = new Dog("Jack");

        System.out.println("Максимальная дистанция бега кошки: " + cat.getRunLimit());
        System.out.println("Максимальная дистанция проплыва кошки: " + cat.getSwimLimit());
        cat.swimDistance(100);
        cat.runDistance(100);
        cat.runDistance(1000);

        System.out.println("Максимальная дистанция бега собаки: " + dog.getRunLimit());
        System.out.println("Максимальная дистанция проплыва кошки: " + dog.getSwimLimit());
        dog.swimDistance(150);
        dog.runDistance(1000);
        dog.runDistance(200);
        dog.swimDistance(9);

        System.out.printf("Всего создано %d собак\n", Dog.getCounter());
        System.out.printf("Всего создано %d котов\n", Cat.getCounter());
        System.out.printf("Всего создано %d животных\n", Animal.getCounter());
    }
}
