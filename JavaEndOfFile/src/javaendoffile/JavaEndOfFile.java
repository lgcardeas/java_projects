/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaendoffile;

import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class JavaEndOfFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int jump = 1;
        String next = "";
        while (sc.hasNext()) {
            next = sc.nextLine();
            System.out.println(jump+" "+next);
            jump++;
        }
    }

}
