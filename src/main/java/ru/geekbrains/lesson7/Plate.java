package ru.geekbrains.lesson7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if(food > n){
         food -= n;
         return true;
        } else {
            System.out.println("В тарелке недостаточно еды. Кот не поел.");
            addFood(100);
            return false;
        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(int food){
        this.food = food;
        System.out.printf("Добавлено %d единиц еды. Можно кормить кота.\n", food);
    }



}
