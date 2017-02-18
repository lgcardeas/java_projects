/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class JavaArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int lengthArray;
        int i, x, y;
        int totalQueries;
        ArrayList<int []> listArray = new ArrayList<>();
        int arrTmp[];
        Scanner sc;
        
        sc = new Scanner(System.in);
        n = sc.nextInt();
        /*Process to get all array into the ListArray*/
        while(n > 0){
            lengthArray = sc.nextInt();
            arrTmp = new int[lengthArray];
            i = 0;
            while(i < lengthArray){
                arrTmp[i] = sc.nextInt();
                i++;
            }
            listArray.add(arrTmp);
            n--;
        }
        /*Process to get all queries*/
            totalQueries = sc.nextInt();
            //At the same time that I get query, I execute it
            while(totalQueries > 0){
                x = sc.nextInt();
                y = sc.nextInt();
                if (x > listArray.size() || y > listArray.get(x-1).length){
                   System.out.println("ERROR!");
                }else{
                   System.out.println(""+listArray.get(x-1)[y-1]);
                }
                totalQueries--;
            }
    }
    
}

/*5 
5 41 77 74 22 44
 1 12 
4 37 34 36 52 
0 
3 20 22 33 
5 
1 3 
3 4 
3 1 
4 3 
5 5*/