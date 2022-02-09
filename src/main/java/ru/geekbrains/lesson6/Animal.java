package ru.geekbrains.lesson6;

public class Animal {
    private String name;
    private final int runLimit = 200;
    private final int swimLimit = 500;
    private static int counter = 0;



    public Animal(String name){
        counter++;
        this.name = name;

    }

    public void swimDistance(int distance){
        System.out.printf("Животное, проплыло %d м\n", distance);
    }
    public void runDistance(int distance) {
        System.out.printf("Животное, пробежало %d м\n", distance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getSwimLimit() {
        return swimLimit;
    }
    public static int getCounter() {
        return counter;
    }

}
