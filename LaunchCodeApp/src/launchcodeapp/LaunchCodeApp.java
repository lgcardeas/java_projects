/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launchcodeapp;

import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class LaunchCodeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("" + distributeCandy(arr));
    }

    static int distributeCandy(int[] score) {
        int candies = 0;
        int lastCantCandies = 1;
        int n = score.length;
        for (int i = 0; i < n; i++) {
            if (((i - 1 >= 0) && score[i] > score[i - 1])||((i + 1 < n) && score[i] > score[i + 1])) {
                lastCantCandies++;
            }
            if ((i - 1 >= 0) && score[i] <= score[i - 1]) {
                lastCantCandies = 1;
                if ((i + 1 < n) && score[i] > score[i + 1]) {
                    lastCantCandies++;
                }
            }
            candies += lastCantCandies;
            System.out.print(" " + lastCantCandies);
        }
        return candies;
    }

}
