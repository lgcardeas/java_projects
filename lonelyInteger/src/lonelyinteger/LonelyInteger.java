/*
 *HackerRank Problem
 *https://www.hackerrank.com/challenges/lonely-integer?h_r=internal-search
 */
package lonelyinteger;

import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class LonelyInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }

    private static int lonelyInteger(int[] a) {
        boolean found = false;
        for (int i = 0, n = a.length; i < n; i++){
            found = false;
            for (int j = 0; j < n; j++){
                if (a[i] == a[j] && i != j){
                    found = true;
                    break;
                }
            }
            if (!found){
                return a[i];
            }        
        }
        return 0;
    }

}
