/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biginteger;

import com.sun.xml.internal.stream.Entity;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class BigIntegerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger aBI = sc.nextBigInteger();
        BigInteger bBI = sc.nextBigInteger();
        BigInteger addBI = bBI.add(aBI);
        BigInteger multBI = bBI.multiply(aBI);
        System.out.println(""+addBI);
        System.out.println(""+multBI);
    }
    
}
