package com.goit.gojavaonline.module09;

/**
 * Created by Danil-MAC on 7/17/16.
 */
public class CaesarsСipher {

    private StringBuilder cipher = new StringBuilder();

    public CaesarsСipher(String text) {
        cipher.append(text);
    }

    public StringBuilder encode(int shiftKey) {
        char[] encoding = new char[cipher.length()];
        cipher.getChars(0, cipher.length(), encoding, 0);
        cipher.delete(0, cipher.length());
        for (int i = 0; i < encoding.length; i++) {
            encoding[i] = (char) ((int) encoding[i] + shiftKey);
            cipher.append(encoding[i]);
        }
        return cipher;
    }

    public StringBuilder decode(int shiftKey) {
        char[] decoding = new char[cipher.length()];
        cipher.getChars(0, cipher.length(), decoding, 0);
        cipher.delete(0, cipher.length());
        for (int i = 0; i < decoding.length; i++) {
            decoding[i] = (char) ((int) decoding[i] - shiftKey);
            cipher.append(decoding[i]);
        }
        return cipher;
    }

    public StringBuilder getCipher() {
        return cipher;
    }
}
