package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        int i;
        int j;
        int k;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you number:");
        int l = scanner.nextInt();
        for (i = 1; i <=l; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(" ");

            for (k = 1; k <= l - i + 1; k++)
                System.out.print("*");


            System.out.println();
        }
    }
}
