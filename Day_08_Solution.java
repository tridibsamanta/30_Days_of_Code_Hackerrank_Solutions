/**
 * Title   : Day_08_Solution.java
 * Author  : Tridib Samanta
 * Created : 30-12-2019
 * Link    : https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
 **/

import java.util.Scanner;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<String, Integer> map = new HashMap();
        for (int i = 0; i < n; i++) {
            String name = scan.next();
            int phone   = scan.nextInt();
            map.put(name, phone);
        }
        while (scan.hasNext()) {
            String str = scan.next();
            if (map.containsKey(str)) {
                System.out.println(str + "=" + map.get(str));
            } else {
                System.out.println("Not found");
            }
        }
        scan.close();
    }
}