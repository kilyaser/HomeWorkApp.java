package java_2.lesson_2.homeWork_lesson_2;

import ru.geekbrains.lesson5.Solution;

public class HomeWork_2 {

    public static int paresIntDoubleMassiveAndSum(String[][] massive) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if(massive.length != 4 || massive[0].length != 4){
            throw new MyArraySizeException();

        }
        int[][] intMassive = new int[massive.length][massive[0].length];
        for (int i = 0; i < intMassive.length; i++){
            for(int j = 0; j < intMassive[i].length; j++){
               try{
                intMassive[i][j] = Integer.parseInt(massive[i][j]);
                sum += intMassive[i][j];

               } catch (Exception e) {
                   throw new MyArrayDataException("MyArrayDataException in massive[" + i + "]" + "[" + j + "]");
               }
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        String[][] strings = new String[4][4];

        //зполнение массива символами.
        strings = HomeWork_2.fillMassive(strings);

        //Проверка чем заполнен массив.
        HomeWork_2.printMassive(strings);

        //Для проверки выбрасывания исключения MyArrayDataException с детализацией в какой именно ячейке лежат неверные данные
        String[][] secondString = new String[4][4];
        secondString = HomeWork_2.fillMassive(secondString);
        secondString[2][3] = "ошибочный символ";

        try {
          //Вывод суммы всех чисел массива
            System.out.println(HomeWork_2.paresIntDoubleMassiveAndSum(strings));

           // вывод ислкючеюния
            System.out.println(HomeWork_2.paresIntDoubleMassiveAndSum(secondString));

        } catch (MyArraySizeException e) {
            System.out.println("Неверный размер массива. Массив должен быть 4 х 4");
        } catch (MyArrayDataException e) {
            //e.printStackTrace();
        }


    }

    public static String[][] fillMassive(String[][] strings){
        for(int i = 0; i < strings.length; i++){
            for (int j = 0; j < strings[i].length; j++){
                strings[i][j] = j + "";
            }
        }
        return strings;
    }
    public static void printMassive(String[][] strings){
        for (String[] a : strings) {
            for (String b : a){
                System.out.print(b + " ");
            }
            System.out.println();

        }
    }
    public static void printMassive(int[][] strings){}


}
