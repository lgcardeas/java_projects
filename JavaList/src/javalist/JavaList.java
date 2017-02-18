/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class JavaList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numQueries;
        String query;
        int element, pos;
        String cad;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> List = new ArrayList(n);
        for(int i = 0 ; i < n ; i ++){
            List.add(sc.nextInt());
        }
        numQueries = sc.nextInt();
        while(numQueries > 0){
            cad = sc.next();
            switch (cad) {
            case "Insert":
                pos = sc.nextInt();
                element = sc.nextInt();
                List.add(pos, element);
                break;
            case "Delete":
                pos = sc.nextInt();
                List.remove(pos);
                break;
                    
        }
            numQueries--;
        }
        if (List.size()>0)
            System.out.print(""+List.get(0));
        for(int i = 1 ; i < List.size() ;i++){
            System.out.print(" "+List.get(i));
        }
        
        
    }
    
}
