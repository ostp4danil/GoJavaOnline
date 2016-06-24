package com.goit.gojavaonline.module04.first;

import java.util.Scanner;

/**
 * Created by Danil-MAC on 22.06.16.
 */
public abstract class Runner {
    public static void main(String[] args) {

      /*  Circle newCircle = new Circle((short)5);
        Rectangle newRectangle = new Rectangle((short) 4, (short) 5);
        Triangle newTriangle = new Triangle((short) 3, (short) 4, (short) 5);
        System.out.println("Circle: " + newCircle.calculateArea());
        System.out.println("Triangle: " + newTriangle.calculateArea());
        System.out.println("Rectangle: " + newRectangle.calculateArea());
        */
        Area[] figures = new Area [5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<5; i++){
            System.out.println("What figure you want to add?");
            String choice = scanner.next();
            switch (choice) {
                case "Triangle":
                    figures[i] = new Triangle(4.5, 2.5, 4.0);
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
