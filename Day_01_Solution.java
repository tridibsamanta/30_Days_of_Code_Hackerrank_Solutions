/**
 * Title   : Day_01_Solution.java
 * Author  : Tridib Samanta
 * Created : 21-12-2019
 * Link    : https://www.hackerrank.com/challenges/30-data-types/problem
 **/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day_01_Solution {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int myInt;
        double myDouble;
        String myString;
        myInt = scan.nextInt();
        myDouble = scan.nextDouble();
        scan.nextLine();
        myString = scan.nextLine();
        System.out.println(i + myInt);
        System.out.println(d + myDouble);
        System.out.println(s + myString);
        scan.close();
    }
}
