package com.goit.gojavaonline.module06.example;

import java.util.Scanner;

public class ExeptionExampleRunner {
    public static void main(String[] args) {
        System.out.printf("Hello! Please enter your age:");
        final Scanner scanner = new Scanner(System.in);

        final String userinput = scanner.next();

        //final int age = Integer.parseInt(userinput);

        try {
            final int age = Integer.parseInt(userinput);
            if (age < 0) {
                throw new NegativeAgeException(age);
            }
            System.out.println("Your afe is: " + age);
        } catch (NumberFormatException ex) {
            System.out.printf("Error: Age should be an integer number");
        } catch (NegativeAgeException e) {
            System.out.println("Error!: Entered age is: " + e.getAgeValue() + "Age should be >=0");
        }
    }
}
