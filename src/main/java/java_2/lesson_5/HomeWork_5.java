package java_2.lesson_5;

import java.util.Arrays;

public class HomeWork_5  extends  Thread{
    static final int size = 10_000_000;
    static final int h = size/2;
// метод 1
    public void singleMas(){
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        long start = System.currentTimeMillis();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long end = System.currentTimeMillis();
        System.out.println("Время работы метода №1 " + (end - start));
    }
// метод 2
    public void secondSingleMas(){
        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        Arrays.fill(arr, 1);
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        long start = System.currentTimeMillis();
        Thread thread1 = new Thread(() -> {
            for(int i = 0; i < a1.length; i++){
                a1[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread thread2 = new Thread(() -> {
            for(int i = 0; i < a2.length; i++){
                a2[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        long end = System.currentTimeMillis();
        System.out.println("Время работы метода №2 " + (end - start));

    }
    public static void main(String[] args) {
        HomeWork_5 homeWork_5 = new HomeWork_5();
        homeWork_5.start();
    }


    @Override
    public void run() {
        singleMas();
        secondSingleMas();
    }
}
