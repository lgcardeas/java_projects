/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

/**
 *
 * @author lgcardenas91
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "ad";
        System.out.println(""+check(str));
        
        
    }

    public static  boolean check(String str){
        
        int len = str.length();
        for (int i = 0; i < str.length()/2; i++){
            if (str.charAt(i) == str.charAt(len-i-1))
                continue;
            else
                return false;
        }
        return true;
    }
}
