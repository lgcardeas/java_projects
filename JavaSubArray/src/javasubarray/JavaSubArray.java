/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasubarray;

import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class JavaSubArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n ; i++){
            a[i] = sc.nextInt();
        }
        
        int sum = 0;
        int totalSumNeg = 0;
        int index = 0;
        int k = 0;
        for (int i = 0; i < n ; i++){
            for (int j = 0; j < n - i ; j++){
                k = 0;
                sum = 0;
                index = j;
                while ((k) <= i){
                    sum+=a[index++];
                    k++;
                }
                if (sum<0){
                    totalSumNeg++;
                }
            }
        }
        System.out.println("sumT "+totalSumNeg);
        
    }
    
}
