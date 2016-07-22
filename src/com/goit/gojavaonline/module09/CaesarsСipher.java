package com.goit.gojavaonline.module09;

/**
 * Created by Danil-MAC on 7/17/16.
 */
public class CaesarsСipher {

    private int shift;
    private final char[] alphabet;

    public CaesarsСipher(String alphabet, int shift) {
        this.shift = shift;
        this.alphabet = new char[alphabet.length()];
        alphabet.getChars(0, alphabet.length(), this.alphabet, 0);
    }

    private int getIndexInAlphabet(char c) {
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == c) {
                return i;
            }
        }
        return -1;
    }


    public String encode(String text) {
        StringBuilder cipher = new StringBuilder();
        cipher.append(text);
        char[] encoding = new char[cipher.length()];
        cipher.getChars(0, cipher.length(), encoding, 0);
        cipher.delete(0, cipher.length());
        for (int i = 0; i < encoding.length; i++) {
            int indexInAlphabet = getIndexInAlphabet(encoding[i]);
            if (indexInAlphabet != -1) {
                int newLetterIndex = Math.abs(indexInAlphabet + shift + alphabet.length) % alphabet.length;
                encoding[i] = alphabet[newLetterIndex];

            }
            cipher.append(encoding[i]);
        }
        return cipher.toString();
    }

    public String decode(String text) {
        setShift(-getShift());
        String decoded = encode(text);
        setShift(-getShift());
        return decoded;
    }

    private void setShift(int shift) {
        this.shift = shift;
    }

    private int getShift() {
        return shift;
    }
}
