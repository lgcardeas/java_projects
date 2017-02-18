/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gene_search_app;

import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class Gene_Search_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberCase = sc.nextInt();
        String genome, pattern;
        while(numberCase > 0){
            genome = sc.next();
            pattern = sc.next();
            gene_search(genome, pattern);
            numberCase--;
        }
        
    }
    
    public static boolean gene_search(String genome, String pattern){
        for (int i = 0; i < genome.length() - pattern.length(); i++){
            if (genome.charAt(i) == pattern.charAt(0)){
                int j = 1;
                while(j < pattern.length() && (genome.charAt(j+i) == pattern.charAt(j))){
                    j++;
                }if (j == pattern.length()){
                    System.out.println("gene_search(\""+genome+"\", \""+pattern+"\") # => True");
                    return true;
                }else{
                    i = j + i-1;
                }
            }
        }
        System.out.println("gene_search(\""+genome+"\", \""+pattern+"\") # => False");
        return false;
    }
    
}
