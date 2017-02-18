/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myregexapp;

import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class MyRegexApp {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }
    }
    
}

 class myRegex{
        //IP NUMBER   // public String pattern = "(([0]?[0-9]?[0-9])|(([0]|[1])[0-9][0-9])|(([0]|[2])[0-5][0-5])).(([0]?[0-9]?[0-9])|(([0]|[1])[0-9][0-9])|(([0]|[2])[0-5][0-5])).(([0]?[0-9]?[0-9])|(([0]|[1])[0-9][0-9])|(([0]|[2])[0-5][0-5])).(([0]?[0-9]?[0-9])|(([0]|[1])[0-9][0-9])|(([0]|[2])[0-5][0-5]))";
        //CADENAS RARAS    // public String pattern = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";   +@([A-Z])+.[A-Z]{2,4}
        /*CORREO ELECTRONICO*/  public String pattern = "([A-Z0-9_-])+@([A-Z_-])+.([A-Z])+{2,4}";
    }