/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaanagrams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class JavaAnagrams {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
        if(hasPermutation(inputString))
            System.out.println("YES");
        else
            System.out.println("NO");

        myScan.close();
    }
    
    public static boolean hasPermutation(String str){
        int lenStr = str.length();
        int cantOdd = 0;
        Map<Character, Integer> cont = new Hashtable<Character, Integer>();
        Character character;
        for (int i  = 0 ; i < lenStr; i++){
            character = str.charAt(i);
            if (cont.containsKey(character)){
                cont.put(character, cont.get(character)+1);
            }else{
                cont.put(character, 1);
            }
            
        }
        Iterator it = cont.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Character, Integer> next;
            next = (Map.Entry)it.next();
            if ( isOdd(next.getValue()))
                cantOdd++;
            if (cantOdd > 1)
                return false;
            it.remove(); // avoids a ConcurrentModificationException
    }
        return true;
    }
    
    public static boolean isOdd(int number){
        if (number%2 != 0)
            return true;
        return false;
    }
    
    /*
    public static boolean hasAnagram(String str){
        int lenInputString = str.length();
        for (int i = 0; i < lenInputString; i++){
            for (int j = i + 1 ; j < lenInputString; j++){
                if (isAnagram(str.substring(i, j+1))){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean isAnagram(String anagram){
        int lengAnagram = anagram.length();
        for (int i = 0; i < lengAnagram/2 ; i++){
            if (anagram.charAt(i) != anagram.charAt(lengAnagram-i-1))
                return false;
        }
        return true;
    }
    */
}




