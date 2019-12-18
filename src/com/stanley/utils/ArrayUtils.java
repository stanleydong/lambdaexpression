package com.stanley.utils;

import java.util.Arrays;

public class ArrayUtils {
    public static void arrayPrintlnUsingForLoop(String[] inputArray) {
        for(int i=0;i< Arrays.asList(inputArray).size(); i++) {
            System.out.println(inputArray[i]);
        }
    }
}
