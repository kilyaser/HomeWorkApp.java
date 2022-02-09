package ru.geekbrains.lesson6;

public class Dog extends Animal {
    private final int runLimit = 500;
    private final int swimLimit = 10;
    private static int counter = 0;

    public Dog(String name) {
       super(name);
       counter++;
    }

    @Override
    public void swimDistance(int distance) {
        if(getSwimLimit() > distance){
            System.out.printf("%s проплыл %d м\n", getName(), distance);
        } else {
            System.out.printf("%s не может проплыть больше %d м\n", getName(), getSwimLimit());
        }
    }

    @Override
    public void runDistance(int distance) {
        if(getRunLimit() > distance){
            System.out.printf("%s пробежал %d м\n", getName(), distance);
        } else {
            System.out.printf("%s не может пробежать больше %d м\n", getName(), getRunLimit());
        }
    }


    @Override
    public int getRunLimit() {
        return runLimit;
    }

    @Override
    public int getSwimLimit() {
        return swimLimit;
    }
    public static int getCounter(){
        return counter;
    }
}
