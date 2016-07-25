package com.goit.gojavaonline.module11.example;

/**
 * Created by Danil-MAC on 7/25/16.
 */
public class SimpleMath {

    public int add(final int numberA, final int numberB) {
        return numberA + numberB;
    }

    public int sub(final int numberA, final int numberB) {
        return numberA - numberB;
    }

    public int mult(final int numberA, final int numberB) {
        return numberA * numberB;
    }

    public int modulo(final int numberA, final int numberB) {
        int modulo = numberA;

        while (modulo >= numberB) {
            modulo -= numberB;
        }
        return modulo;
    }

    public int div(final int numberA, final int numberB){
        throw new UnsupportedOperationException("This div operation is not implemented yet!");
    }
}
