/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoutputformatting;

import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class JavaOutputFormatting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.print(s1);
                int space = 15 - s1.length();
                while(space > 0){
                    System.out.print(" ");
                    space--;
                }
                if (x < 100){
                    System.out.print("0");
                    if (x < 10){
                        System.out.print("0");
                    }
                }
                System.out.println(""+x);
            }
            System.out.println("================================");

    }
    
}
