package ru.geekbrains.lesson7;

public class MainClass {

    public static void main(String[] args) {
        // создаем массив котов
        Cat[] cats = new Cat[10];
        for (int i = 0; i < cats.length; i++){
            cats[i] = new Cat("Cat-" + (i + 1), 5);
        }
        Plate plate = new Plate(30);

        // кормим котов
        for (Cat cat: cats) {
              cat.eat(plate);
        }

        // ищем голодного кот для кормления
        for (Cat cat: cats){
            if(!cat.isFedUp()){
                cat.eat(plate);
            }
        }
        plate.info();
    }
}
