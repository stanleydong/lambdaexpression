package com.stanley;

import com.stanley.utils.ArrayUtils;

import java.util.Arrays;
import java.util.Comparator;
public class Main {

    public static void main(String[] args) {

        Comparator<String> comparatorTraditional = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        };

        // we could also reduce the type on the parameters
        //Comparator<String> comparatorLamda = (String o1, String o2) -> (Integer.compare(o1.length(),o2.length()));
        Comparator<String> comparatorLamda = (o1, o2) -> (Integer.compare(o1.length(),o2.length()));

        String[] testingArray = {"Stanley", "Bella", "Unknow"};

        Arrays.sort(testingArray,comparatorTraditional);

        System.out.println("Sorted by length array using traditional comparator: ");

        ArrayUtils.arrayPrintlnUsingForLoop(testingArray);

        System.out.println("Sorted by length array using lambda comparator: ");

        Arrays.sort(testingArray,comparatorLamda);
        ArrayUtils.arrayPrintlnUsingForLoop(testingArray);

    }
}
