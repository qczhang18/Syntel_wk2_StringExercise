package com.digitalcrafts.syntel;

import java.util.ArrayList;
import java.util.Arrays;

public class StringExercise {

    public void findMe(String searchString, String[] stringArray) {
        int index = Arrays.asList(stringArray).indexOf(searchString);
        if (index >= 0){
            System.out.println("FOUND at index " + index);
        }
        else {
            System.out.println("NOT IN LIST");
        }
    }

    public void ceasarCipher(String string){
        char[] toCharArray = string.toCharArray();
        StringBuilder builder = new StringBuilder();

        for(Character character : toCharArray) {
            int tempASCII = (int)(character);
            if (tempASCII >= 97) {
                int rotatedASCII = tempASCII + 13;
                if (rotatedASCII > 122) {
                    rotatedASCII = 97 + rotatedASCII - 123;
                }
                builder.append((char) ((int) rotatedASCII));
            }
            else {
                builder.append((char)tempASCII);
            }
        }
        System.out.println(builder);
    }


}
