/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n]; 
        for (int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(lonelyInteger(arr));
    }
    
    static int lonelyInteger(int[] arr) {
        int tmp = 0;
        boolean repeat = false;
        for (int i = 0 ; i < arr.length; i++){
            tmp = arr[i];
            for (int j = 0; j < arr.length; j++){
                 if (i == j)
                    continue;
                if (tmp == arr[j]){
                    repeat = true;
                    break;
                }
            }
            if (repeat == false)
                return tmp;
            repeat = false;
        }
        return tmp;
    }
}
