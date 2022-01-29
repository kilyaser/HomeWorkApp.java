package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Random;

public class HomeWorkApp_three {
    public static int[] getRandomMassive(){
        Random random = new Random();
        int[] result = new int[random.nextInt(20)];
        for (int i = 0; i < result.length; i++){
            result[i] = random.nextInt(100);
        }
        return result;
    }
    public static void main(String[] args) {
        //to check decision 1
        int[] input = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задание №1:");
        System.out.println(Arrays.toString(booleanNegateArray(input)));

        //to check decision 2
        int[] massive = fillUpArray(100);
        System.out.println("Задание №2:");
        System.out.println(Arrays.toString(massive));

        // to check decision 3
        int[] m = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание №3:");
        System.out.println(Arrays.toString(doubleIfLess(m)));

        // to check decision 4
        System.out.println("Задание №4:");
         fillDiagonals(5);

        // to check decision 5
        System.out.println("Задание №5:");
        System.out.println(Arrays.toString(fillWithInitialValue(5, 25)));

        // to check decision 6
        System.out.println("Задание №6: ");
        int[] pr = getRandomMassive();
        minMax(pr);

        // to check decision 7
        System.out.println("Задание №7: ");
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(arr));

        // to check decision 8
        System.out.println("Задание №8: ");
        int[] in = {4, 3, 2, 1};
        System.out.println("До сдвига: " + Arrays.toString(in));
        System.out.println("После сдвига: " + Arrays.toString(shiftArray(in, -2)));
    }

    //task 1
    public static int[] booleanNegateArray(final int[] input){
        for (int i = 0; i < input.length; i++){
            if(input[i] == 0){
                input[i] = 1;
            } else if(input[i] == 1){
                input[i] = 0;
            }
        }
        return input;
    }

    //task 2
    public static int[] fillUpArray(final int length){
        int[] result = new int[length];
        for(int i = 1; i <= result.length; i++){
            result[i-1] = i;
        }
        return result;
    }

    //task 3
    public static int[] doubleIfLess(final int[] input){
        for(int i = 0; i < input.length; i++){
            if(input[i] < 6){
                input[i] *= 2;
            }
        }
        return input;
    }
    //task 4
    public  static void fillDiagonals(final int size){
        int[][] squareMass = new int[size][size];
        for(int i = 0; i < squareMass.length; i++){
            squareMass[i][i] = 1;
        }
        for(int i = 0; i < squareMass.length; i++){
            for(int j = squareMass.length -1; j >= 0; j--){
                if((i + j) == squareMass.length - 1)
                squareMass[i][j] = 1;
            }
        }
        for(int i = 0; i < squareMass.length; i++){
            System.out.println(Arrays.toString(squareMass[i]));
        }
    }
    //task 5
    public static int[] fillWithInitialValue(final int len, final int initialValue){
        int[] result = new int[len];
        for (int i = 0; i < result.length; i++)
            result[i] = initialValue;
        return result;
    }
    //task 6
    public static void minMax(final int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i: arr) {
             if( max < i) {
                max = i;
            }
            if(min > i) {
                min = i;
            }
        }
        System.out.println("Элементы массива: " + Arrays.toString(arr));
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);

    }
    //task 7
    public static boolean checkBalance(final int[] arr){
        int leftSum = 0;
        int rightSum = 0;

        for (int i = arr.length - 1; i >= 0; i--){
            rightSum += arr[i];
            for(int j = 0; j < i; j++){
                leftSum += arr[j];
            }
            if(leftSum == rightSum){
                return true;
            }
            leftSum = 0;
        }
        return false;
    }
    //task 8
    public static int[] shiftArray(final int[] input, final int shift){
         if(shift > 0){
                for (int i = 0;  i < shift; i++){
                       int temp = input[input.length -1];

                       for (int j = input.length - 1; j > 0;  j--){
                            input[j] = input[j-1];
                       }
                       input[0] = temp;
               }

            return input;
        } else {
            for (int i = 0;  i > shift; i--){
                int temp = input[0];

                for (int j = 1; j < input.length;  j++){
                    input[j - 1] = input[j];
                }
                input[input.length - 1] = temp;
            }
             return input;
        }

    }



}
