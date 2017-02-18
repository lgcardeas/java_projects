/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroductionstring;

import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class JavaIntroductionString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(""+(A.length()+B.length()));
        if (B.compareTo(A) >= 0)
            System.out.println("No");
        else
            System.out.println("Yes");
        A = A.substring(0, 1).toUpperCase() + A.substring(1, A.length());
        B = B.substring(0, 1).toUpperCase() + B.substring(1, B.length());
        System.out.println(A+" "+B);
        
    }
    
}
