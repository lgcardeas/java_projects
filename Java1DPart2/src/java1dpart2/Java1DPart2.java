/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1dpart2;

import com.sun.xml.internal.stream.Entity;
import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class Java1DPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int totalCase = sc.nextInt();
        int lenghtArray, jump, i;
        int arr[];
        boolean win;
        while (totalCase > 0) {
            lenghtArray = sc.nextInt();
            jump = sc.nextInt();
            arr = new int[lenghtArray];

            i = 0;
            while (i < lenghtArray) {
                arr[i] = sc.nextInt();
                i++;
            }

            i = 0;
            win = isSolvable(jump, arr, i);

            //Execute Game;
            if (win) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            totalCase--;
        }
    }

    private static boolean isSolvable(int m, int[] arr, int i) {
        if (i < 0 || arr[i] == 1) {
            return false;
        }
        if ((i == arr.length - 1) || i + m > arr.length - 1) {
            return true;
        }

        arr[i] = 1;
        return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
    }

}
