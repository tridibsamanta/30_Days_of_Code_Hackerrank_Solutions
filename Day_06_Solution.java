/**
 * Title   : Day_06_Solution.java
 * Author  : Tridib Samanta
 * Created : 26-12-2019
 * Link    : https://www.hackerrank.com/challenges/30-review-loop/problem
 **/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day_06_Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            String str = scan.next();
            printEvensOdds(str);
        }
        scan.close();
    }

    public static void printEvensOdds(String str) {
        StringBuffer evens = new StringBuffer();
        StringBuffer odds  = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i % 2 == 0) {
                evens.append(ch);
            } else {
                odds.append(ch);
            }
        }
        System.out.println(evens + " " + odds);
    }
}
