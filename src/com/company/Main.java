package com.company;
/*
Prompt the user to enter an integer from 1 to 10
Display the factorial of the number entered by the user.
Ask if the user wants to continue
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to the factorial calculator");
        Scanner scnr = new Scanner(System.in);
        char cont;
        do {
            System.out.println("Enter an integer that's greater than 0 but less than 10");
            int uInput = scnr.nextInt();
            if (uInput>10 || uInput<0){
                System.out.println("Input is not in range");
                return;
            }

            System.out.println(factorial(uInput));
            System.out.println("Do you want to continue? Please use y or n");
            cont = scnr.next().charAt(0);
        }
        while (cont != 'n');
    }

    private static long factorial(int uInput) {
        int numFact = 1;
        for (int i = 1; i <= uInput; i++) {
            numFact *= i;
        }
        return numFact;
    }
}
