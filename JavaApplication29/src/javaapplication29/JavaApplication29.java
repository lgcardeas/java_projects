/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String result = "";
        int tmp, acarreo = 0, sum;
        int longA = a.length(), longB = b.length();
        int min = Math.min(longA, longB);
        int max = Math.max(longA, longB);
        int start = max - (max - min);
        
        for (int i = max - 1; i >= 0; i--) {
            tmp = Integer.parseInt("" + a.charAt(i)) + Integer.parseInt("" + b.charAt(i));
            sum = tmp % 10 + acarreo;
            acarreo = tmp / 10;
            result = sum + result;
        }
        if (acarreo > 0)
            result = acarreo+result;
        System.out.println(""+result);
    }

}
