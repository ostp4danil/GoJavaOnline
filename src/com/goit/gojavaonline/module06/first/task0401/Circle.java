package com.goit.gojavaonline.module06.first.task0401;

import javax.xml.bind.ValidationException;
import java.util.IllegalFormatConversionException;

/**
 * Created by Danil-MAC on 22.06.16.
 */
class Circle implements Area {
    private double radius;

    Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Wrong radius: " + radius);
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        return Math.PI * Math.pow(radius, 2);

    }

}
