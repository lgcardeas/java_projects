/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wigglearrangearray;

import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class WiggleArrangeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n]; 
        for (int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
        }
        arr = wiggleArrangeArray(arr);
        for (int i = 0 ; i < n ; i++)
            System.out.print(" "+arr[i]);
    }
    
    static int[] wiggleArrangeArray(int[] intArr) {
        intArr = sortArray(intArr);
        int lengthArr = intArr.length;
        int returnArray[] = new int[lengthArr]; 
        int index = 0;
        for (int i = 0 ; i < (lengthArr)/2 ; i++){
            returnArray[index] = intArr[i];
            returnArray[index + 1] = intArr[lengthArr - i - 1];
            index+=2;
        }
        
        if(lengthArr % 2 != 0)
            returnArray[(lengthArr-1)] = intArr[(lengthArr/2)];
        
        return returnArray;
    }
    
    static int[] sortArray(int[] arr){
        int IndexMax = 0;
        int tmp = 0;
        
        for (int i = 0 ; i < arr.length-1; i++){
            IndexMax = i;
            for (int j = i + 1; j < arr.length ; j++){
                if (arr[IndexMax] < arr[j]){
                    IndexMax = j;
                }
            }
            tmp = arr[i];
            arr [i]= arr[IndexMax];
            arr[IndexMax] = tmp; 
        }
        return arr;
    }

}
