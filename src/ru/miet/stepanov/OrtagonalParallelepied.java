package ru.miet.stepanov;

import java.util.Scanner;

/**
 * Created by Саня on 14.04.2016.
 */
public class OrtagonalParallelepied {
    private static double a = 0, b = 0, h = 0;

    public static void go() {
        System.out.print("Введите две стороны основания параллелипипеда через пробел или enter: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.print("Введите высоту параллелипипеда: ");
        sc = new Scanner(System.in);
        h = sc.nextDouble();
        System.out.println("Ваши данные: длина = " + a + ", ширина = " + b + ", высота = " + h);
    }
}