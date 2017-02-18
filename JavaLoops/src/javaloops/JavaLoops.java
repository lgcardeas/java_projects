/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaloops;

import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class JavaLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCase = sc.nextInt(); //Cantidad de Test
        int a;
        int b;
        int n;
        int lastSum;//elemento (n-1) de la serie.(contiene la suma del elemento anterior)
        while (numCase > 0) {//Ejecutar esto para cada Test
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            lastSum = 0;
            lastSum += (int) (a + (b * Math.pow(2, 0)));
            System.out.print(lastSum);
            for (int i = 1; i < n; i++) {
                lastSum += (int) (b * Math.pow(2, i));
                System.out.print(" "+lastSum);
            }
            System.out.println("");
            numCase--;
        }
    }

}
