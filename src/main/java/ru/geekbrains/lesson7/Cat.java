package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFedUp = false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        isFedUp = p.decreaseFood(appetite);
        fedUpInfo();

    }

    public void fedUpInfo() {
        if(isFedUp){
            System.out.printf("%s поел, кот сыт.\n", name);
        } else {
            System.out.printf("%s все еще хочет есть.\n", name);
        }
    }

    public String getName() {
        return name;
    }

    public boolean isFedUp() {
        return isFedUp;
    }
}
