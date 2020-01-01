/**
 * Title   : Day_10_Solution.java
 * Author  : Tridib Samanta
 * Created : 01-01-2020
 * Link    : https://www.hackerrank.com/challenges/30-binary-numbers/problem
 **/

import java.util.Scanner;

public class Day_10_Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println(consecutiveOnes(n));
    }

    public static int consecutiveOnes(int n) {
        int count = 0;
        int max   = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
            n = n >> 1;
        }
        return max;
    }
}
