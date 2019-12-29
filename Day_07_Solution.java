/**
 * Title   : Day_07_Solution.java
 * Author  : Tridib Samanta
 * Created : 29-12-2019
 * Link    : https://www.hackerrank.com/challenges/30-arrays/problem
 **/

import java.util.Scanner;

public class Day_07_Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
