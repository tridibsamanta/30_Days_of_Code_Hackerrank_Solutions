/**
 * Title   : Day_03_Solution.java
 * Author  : Tridib Samanta
 * Created : 23-12-2019
 * Link    : https://www.hackerrank.com/challenges/30-conditional-statements/problem
 **/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day_03_Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        } else {
            if (n >= 6 && n <= 20) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }
        }
        System.out.println(ans);
    }
}
