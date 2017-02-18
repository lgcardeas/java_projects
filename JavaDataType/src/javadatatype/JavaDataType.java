/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadatatype;

import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class JavaDataType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCase = sc.nextInt();
        String number = "";
        while (numCase > 0) {
            number = sc.next();
            try {
                Byte.parseByte(number);
                System.out.println("" + number + " can be fitted in:");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");

            } catch (Exception b) {
                try {
                    Short.parseShort(number);
                    System.out.println("" + number + " can be fitted in:");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } catch (Exception s) {
                    try {
                        Integer.parseInt(number);
                        System.out.println("" + number + " can be fitted in:");
                        System.out.println("* int");
                        System.out.println("* long");
                    } catch (Exception i) {
                        try {
                            Long.parseLong(number);
                            System.out.println("" + number + " can be fitted in:");
                            System.out.println("* long");
                        } catch (Exception l) {
                               System.out.println(""+number+" can't be fitted anywhere.");
                        }
                    }
                }
            }
            numCase--;
        }
    }

}
