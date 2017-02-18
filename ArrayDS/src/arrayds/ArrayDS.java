/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayds;

import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class ArrayDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int maxSumtHG = arr[0][0] + arr[0][1] + arr[0][2] +
                                arr[1][1] +
                        arr[2][0] + arr[2][1] + arr[2][2];
        int maxSumtHGTmp = 0;
        for(int arr_i=0; arr_i < 4; arr_i++){
            for(int arr_j=0; arr_j < 4; arr_j++){
                maxSumtHGTmp = arr[arr_i][arr_j] + arr[arr_i][arr_j+1] + arr[arr_i][arr_j+2] +
                                            arr[arr_i+1][arr_j+1] +
                        arr[arr_i+2][arr_j] + arr[arr_i+2][arr_j+1] + arr[arr_i+2][arr_j+2];
                if (maxSumtHG < maxSumtHGTmp){
                    maxSumtHG = maxSumtHGTmp;
                }
            }
        }
        System.out.println(""+maxSumtHG);
    }
    
}
