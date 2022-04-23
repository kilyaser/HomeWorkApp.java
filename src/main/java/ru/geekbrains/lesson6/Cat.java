package ru.geekbrains.lesson6;

public class Cat extends Animal {
    private final int runLimit = 200;
    private final int swimLimit = 0;
    private static int counter = 0;

    public Cat(String name) {
        super(name);
        counter++;
    }

    @Override
    public void swimDistance(int distance) {
        System.out.println("Кошки не могут плавать");
    }

    @Override
    public void runDistance(int distance) {
        if(getRunLimit() > distance) {
            System.out.printf("%s пробежал %d м\n", getName(), distance);
        } else {
            System.out.println("Превышен лимит, ограничение для кошек составлет: " + getRunLimit());
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
