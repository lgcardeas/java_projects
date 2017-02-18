/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacurrencyformatter;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class JavaCurrencyFormatter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        //Declarations
        DecimalFormat df = new DecimalFormat("#0.00");
        NumberFormat nf;
        Currency c;
        String us, india, china, france;
        
        //US
        nf = NumberFormat.getCurrencyInstance(Locale.US);
        us = nf.format(Double.valueOf(df.format(payment)));

        //INDIA
        nf = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        india = nf.format(Double.valueOf(df.format(payment)));
        
        //CHINA
        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        china = nf.format(Double.valueOf(df.format(payment)));
        
        
        //FRANCE
        nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        c = Currency.getInstance(Locale.FRANCE);
        france = nf.format(Double.valueOf(df.format(payment))) ;
        
        
        
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
    
}
