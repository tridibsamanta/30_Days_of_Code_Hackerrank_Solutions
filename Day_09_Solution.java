/**
 * Title   : Day_09_Solution.java
 * Author  : Tridib Samanta
 * Created : 31-12-2019
 * Link    : https://www.hackerrank.com/challenges/30-recursion/problem
 **/

import java.util.Scanner;
import java.util.HashMap;

public class Day_09_Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println(factorial(n));
    }

    private static Long factorial (int n) {
        if (n < 0) {
            return null;
        }
        long result = 1;
        while (n > 0) {
            result *= n--;
        }
        return result;
    }
}
