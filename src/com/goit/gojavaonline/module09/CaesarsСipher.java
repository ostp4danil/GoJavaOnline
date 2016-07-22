package com.goit.gojavaonline.module09;

/**
 * Created by Danil-MAC on 7/17/16.
 */
public class CaesarsСipher {

    private StringBuilder cipher = new StringBuilder();
    private int shift;
    private final int firstLetterCode = 'a';
    private final int lastLetterCode = 'z';
    private final int igoreSymbolCode = ' ';

    public CaesarsСipher(String text, int shift) {
        cipher.append(text);
        this.shift = shift;
    }

    public StringBuilder encode() {
        int alphabetSize = lastLetterCode - firstLetterCode + 1;
        char[] encoding = new char[cipher.length()];
        cipher.getChars(0, cipher.length(), encoding, 0);
        cipher.delete(0, cipher.length());
        for (int i = 0; i < encoding.length; i++) {
            if ((int) encoding[i] != igoreSymbolCode) {
                int newLetterIndex = (int) encoding[i] + (shift % alphabetSize);
                encoding[i] = (char) newLetterIndex;
            }
            cipher.append(encoding[i]);
        }
        return cipher;
    }

    public StringBuilder decode() {
        shift = -shift;
        return encode();
    }

    public StringBuilder getCipher() {
        return cipher;
    }
}
