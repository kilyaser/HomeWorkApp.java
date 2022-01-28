package ru.geekbrains.lesson3;

import java.util.Arrays;

public class HomeWorkApp_three {
    public static void main(String[] args) {
        //1
        int[] input = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(booleanNegateArray(input)));

        //2
        int[] massive = fillUpArray(100);
        System.out.print(Arrays.toString(massive));

    }

    //1
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

    //2
    public static int[] fillUpArray(final int length){
        int[] result = new int[length];
        for(int i = 1; i <= result.length; i++){
            result[i-1] = i;
        }
        return result;
    }

}
