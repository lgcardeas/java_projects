/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprimatilytest;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class JavaPrimatilyTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        if (n.isProbablePrime(1)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }

}
