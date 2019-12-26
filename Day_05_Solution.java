/**
 * Title   : Day_05_Solution.java
 * Author  : Tridib Samanta
 * Created : 26-12-2019
 * Link    : https://www.hackerrank.com/challenges/30-loops/problem
 **/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day_05_Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        for(int i=1;i<=10;i++) {
            System.out.format("%d x %d = %d%n", n, i, i * n);
        }
    }
}
