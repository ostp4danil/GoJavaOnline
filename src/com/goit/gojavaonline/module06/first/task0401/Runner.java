package com.goit.gojavaonline.module06.first.task0401;

import java.util.Scanner;


abstract class Runner {

    public static void main(String[] args) {

        Area[] figures = new Area[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < figures.length; i++) {
            System.out.println("What figure you want to add?");
            String choice = scanner.next();
            try {
                switch (choice) {
                    case "Triangle":
                        figures[i] = new Triangle(4.5, 2.5, 4.0);
                        break;
                    case "Rectangle":
                        figures[i] = new Rectangle(3.2, 4.5);
                        break;
                    case "Circle":
                        figures[i] = new Circle(-5);
                        break;
                    default:
                        i--;
                        throw new WrongFigureException(choice);
                }
            } catch (WrongFigureException e) {
                i--;
                System.out.println("Error!: Entered name is: " + e.getFigureName() + "\nThere no figures find");
            } catch (IllegalArgumentException e) {
                i--;
                System.out.println(e.getMessage());
            }

        }
        double allArea = 0;
        for (int i = 0; i < figures.length; i++) {
            allArea = allArea + figures[i].calculateArea();
        }
        System.out.println("Summary area =  " + allArea);
    }
}
