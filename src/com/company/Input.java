package com.company;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число от 1 до 1000");
        int x = s.nextInt();
        int y = 0;
        while(x > 1001){
            System.out.println("Введите число меньше 1001");
                break;
        }
        while (x<1){
            System.out.println("Введите больше 1");
                break;
        }


    }
}
