package com.company;


import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array2 = getInfo();
        System.out.println(Arrays.toString(array2));
    }

    public static int[] getInfo() {
        Random random = new Random();
        int size = random.nextInt(10, 15);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 9;
        }
        return array;
    }



    /*
     * Создайте массив целых, размер должен быть случайным в диапазоне от 10 до 15,
     *  создайте метод возвращающий целое число, и с помощью метода заполните ранее
     *  созданный массив, заполните его так, чтобы значения были такими (0, 9, 18, 27 ...)
     * */

//
//        Random random = new Random();
//        int num = random.nextInt(10, 15);
//        int counter = 0;
//        int[] array = new int[num];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = number() + counter;
//            counter += 9;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//
//    }
//
//    public static int number() {
//        return 0;
//    }


}
