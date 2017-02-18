/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastringreverse;

import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class JavaStringReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String cad = sc.next();
        boolean palindrome = true;
        int i = 0;
        while(palindrome && i < (cad.length()/2)){
            if (cad.charAt(i) != cad.charAt(cad.length()-i-1)){
                palindrome = false;
            }
            i++;
        }
        if (palindrome){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}
