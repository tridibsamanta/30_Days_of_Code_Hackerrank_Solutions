/**
 * Title   : Day_16_Solution.java
 * Author  : Tridib Samanta
 * Created : 08-01-2020
 * Link    : https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem
 **/

import java.util.Scanner;

public class Day_16_Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();
        try {
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
