/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class JavaBigDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();//Output
            BigDecimal min;
            String tmp;
        
        for (int i = 0; i < s.length - 3; i++){
            for (int j = 0; j < (s.length - i - 3); j++){
                min = new BigDecimal(s[j]);
                if (min.compareTo(new BigDecimal(s[j+1])) < 0){
                    tmp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = tmp;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}
