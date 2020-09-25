package com.company;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 1000");
        int userInput = scanner.nextInt();
        if (userInput > 1000) {
            System.out.println("Чел введи меньше");
            return;
        } else if (userInput < 1) {
            System.out.println("Введите число больше");
            return;
        }
        for (int i = 0; i != userInput; i++) {
            if ((i % 3 == 0) && (i % 5 ==0)) {
                System.out.println("LoveFizz");
            } else if (i % 3 == 0) {
                System.out.println("Love");
            } else if (i % 5 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
