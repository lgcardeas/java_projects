/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closestnumbers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class ClosestNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n]; 
        for (int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
        }
        closestNumbers(arr);
    }
    
    
    static void closestNumbers(int[] numbers) {
        int count = 0;
        int minAbs = Math.abs(numbers[0] - numbers[1]);
        int minTmp = 0;
        ArrayList<Integer> pairFirst = new ArrayList<>();
        ArrayList<Integer> pairSecound = new ArrayList<>();
        if (numbers[0] > numbers[1]){
            pairFirst.add(numbers[1]);
            pairSecound.add(numbers[0]);
        }else{
            pairFirst.add(numbers[0]);
            pairSecound.add(numbers[1]);
        }
        
        for (int i = 0 ; i < numbers.length - 1; i++){
            for (int j = i+1 ; j < numbers.length; j++){
                minTmp = Math.abs(numbers[i] - numbers[j]);
                System.out.println(minAbs+" min "+minTmp);
                count++;
                if (minAbs > minTmp){
                    
                    minAbs = minTmp;
                    pairFirst = new ArrayList<>();
                    pairSecound = new ArrayList<>();
                    if (numbers[i] > numbers[j]){
                          pairFirst.add(numbers[j]);
                          pairSecound.add(numbers[i]);
                      }else{
                            pairFirst.add(numbers[i]);
                            pairSecound.add(numbers[j]);
                     }
                }else{
                  System.out.println("size par" + pairFirst.size());
                    System.out.println("i+ "+i);
                    System.out.println("j+ "+j);
                    if (numbers[i] > numbers[j]){
                          pairFirst.add(numbers[j]);
                          pairSecound.add(numbers[i]);
                      }else{
                            pairFirst.add(numbers[i]);
                            pairSecound.add(numbers[j]);
                     }
                }
            }
        }
        System.out.println("Count "+count);
        for(int i = pairFirst.size() -1 ; i >= 0; i--){
            System.out.println(""+pairFirst.get(i)+" "+pairSecound.get(i));
        }

    }
}
