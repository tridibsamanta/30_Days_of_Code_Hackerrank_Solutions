/**
 * Title   : Day_21_Solution.java
 * Author  : Tridib Samanta
 * Created : 17-01-2020
 * Link    : https://www.hackerrank.com/challenges/30-generics/problem
 **/

import java.util.*;

class Printer <T> {
    public void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }
}

public class Day_21_Solution {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    }
}
