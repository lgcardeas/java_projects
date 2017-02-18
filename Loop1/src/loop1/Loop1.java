/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop1;

import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class Loop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println("2 x "+i+" = "+(i*N));
        }
    }
    
}
