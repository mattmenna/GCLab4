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
        System.out.println("Enter an integer");
        int uInput = scnr.nextInt();
        System.out.println(factorial(uInput));
    }

    private static long factorial(int uInput){
        int numFact = 1;
        for (int i =1; i <=uInput; i++){
            numFact *= i;
        }
        return numFact;
    }
}
