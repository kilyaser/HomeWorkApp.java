package ru.geekbrains.lesson3;

import java.util.Arrays;

public class HomeWorkApp_three {
    public static void main(String[] args) {
        //to check decision 1
        int[] input = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(booleanNegateArray(input)));

        //to check decision 2
        int[] massive = fillUpArray(100);
        System.out.println(Arrays.toString(massive));

        // to check decision 3
        int[] m = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(doubleIfLess(m)));

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

}
