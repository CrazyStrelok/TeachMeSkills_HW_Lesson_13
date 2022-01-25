package com.teachmeskills.lesson_13;

import java.util.Scanner;

public class Method<stringIValue, Int> {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число ");
        int a = scanner.nextInt();

        if (a == 1) {
            Interface<String> reverse = (str) -> {
                String result = "";
                for (int i = str.length()-1; i >= 0 ; i--)
                    result += str.charAt(i);
                return result;
            };
            System.out.println("reverse = " + reverse.func(" Student "));
        }

        if (a == 2) {
            Interface<Integer> factorial = (n) -> {
                int result = 1;
                for (int i = 1; i <= n; i++)
                    result = i * result;
                return result;
            };
            System.out.println("factorial " + factorial.func(122));
        }
    }
}