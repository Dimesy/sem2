package ru.mirea.lab1;

import java.lang.*;
import java.util.Scanner;
import java.util.Random;

privat class ChapterOne {
    public static void main(String[] args) {


//Задание 1
        int sum = 0;

        int arr1[] = {1, 2, 3, 4, 5};

        for (int x = 0; x < 5; x++){
            sum = sum + arr1[x];
        }

        System.out.println("З_1.Сумма массива = " + sum);
        System.out.println("___________________________");

//Задание 2
        Scanner in = new Scanner(System.in);
        int count;
        System.out.println("Введите размер массива: ");
        count = in.nextInt();

        int arr[] = new int[count];

        for (int x = 0; x < count; x++){
            System.out.print("Введите " + (x+1) + " элемент массива: ");
            arr[x] = in.nextInt();
            System.out.println();
        }

        sum = 0;

        for (int x = 0; x < count; x++){
            sum = sum + arr[x];
        }
        System.out.println("З_2.Сумма массива = " + sum);
        System.out.println("___________________________");

//Задание 3

        System.out.println("Введите размер 3-его массива: ");
        count = in.nextInt();

        Random random = new Random();
        for (int x = 0; x < count; x++){
            arr[x] = random.nextInt();
        }

        for (int x = 0; x < count; x++){
            System.out.println("Arr[" + (x+1) + "] = " + arr[x]);
        }

        for (int x = 0; x < count; x++){
            sum = sum + arr[x];
        }
        System.out.println("З_3.Сумма массива = " + sum);
        System.out.println("___________________________");
//Задание 4

        for (int x = 0; x < count; x++){
            arr[x] = (int) (Math.random() * 100 - Math.random() * 100);
        }

        int cup;

        for (int x = 0; x < count-1; x++){
            if (arr[x] > arr[x+1]){
                cup = arr[x];
                arr[x] = arr[x+1];
                arr[x+1] = cup;
            }
        }
        for (int x = 0; x < count; x++){
            System.out.println("Arr[" + (x+1) + "] = " + arr[x]);
        }

        sum = 0;

        for (int x = 0; x < count; x++){
            sum = sum + arr[x];
        }
        System.out.println("З_4.Сумма массива = " + sum);
        System.out.println("__________________________");
    }
}
