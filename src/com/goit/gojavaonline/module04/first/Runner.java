package com.goit.gojavaonline.module04.first;

import java.util.Scanner;

abstract class Runner {

    public static void main(String[] args) {

        Area[] figures = new Area [5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<5; i++){
            System.out.println("What figure you want to add?");
            String choice = scanner.next();
            switch (choice) {

                case "Triangle":
                    figures[i] = new Triangle(3, 4, 5);
                    break;
                case "Rectangle":
                    figures[i] = new Rectangle(3.2, 4.5);
                    break;
                case "Circle":
                    figures[i] = new Circle(7.2);
                    break;
                default:
                    System.out.println("Unknown figure: \" " + choice + " \"");
                    i--;
                    break;

            }

        }


        double allArea=0;
        for (int i=0; i<5; i++){
            allArea = allArea + figures[i].calculateArea();
        }
        System.out.println("Summary area =  " + allArea);
    }
}
