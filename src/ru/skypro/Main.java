package ru.skypro;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        Task 1

        int[] arr = new int[31];
        Random rnd = new Random();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " Рублей");

//        Task 2

        int min = arr[0];
        int max = -1;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Максимальная сумма трат за месяц составила " + max + " Рублей");
        System.out.println("Минимальная сумма трат за месяц составила " + min + " Рублей");

//        Task 3

        double averageValue = sum * 1.0 / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " Рублей");

//        Task 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
