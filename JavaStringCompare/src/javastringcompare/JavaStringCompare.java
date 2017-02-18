/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastringcompare;

import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class JavaStringCompare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cad = sc.next();
        int k = sc.nextInt();
        String maxLex = cad.substring(0, k);
        String minLex = cad.substring(0, k);
        for (int i = 1; i < cad.length()-k+1; i++){
            if (maxLex.compareTo(cad.substring(i,i+k)) >= 0){
                maxLex = cad.substring(i,i+k);
            }
            if (cad.substring(i,i+k).compareTo(minLex) >= 0){
                minLex = cad.substring(i,i+k);
            }
        }
        System.out.println(""+maxLex);
        System.out.println(""+minLex);
    }
    
}
