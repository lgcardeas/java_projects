/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokens;

import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class Tokens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cad = sc.nextLine();
        sc.close();
        String words[];
        int cantWord = 0;

        String delm = "[ !,?._'@]+";
        words = cad.split(delm);
        if (words.length > 0) {
            if (words[0].equals("")) {
                cantWord--;
            }
            cantWord += words.length;
            System.out.println("" + cantWord);
            for (String word : words) {
                if (!word.equals("")) {
                    System.out.println("" + word);
                }
            }
        }else{
            System.out.println("0");
        }
    }
}
