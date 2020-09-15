/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.testing_project;

import java.lang.Math;
import com.calculator.calculator.Calculator;

/**
 *
 * @author lgcardenas91
 */
public class Testing_Project {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Testing_Project testing = new Testing_Project();
        testing.start_testing();
    }
    
    public void start_testing(){
        Calculator crystal_1 = new Calculator("Crystal 1");
        Calculator crystal_2 = new Calculator("Crystal 2");
        
        
        
        double rate_c1 = process(crystal_1);
        double rate_c2 = process(crystal_2);
        
        System.out.println(String.format("%s Success rate: %.1f", crystal_1.getName(), rate_c1));
        System.out.println(String.format("%s Success rate: %.1f", crystal_2.getName(), rate_c2));
        
        String better = (rate_c1 > rate_c2)? crystal_1.getName() : crystal_2.getName();
        System.out.println(better + " is better");
        
       
    }
    
    public double process(Calculator calc){
        int count = 0;
        System.out.println(String.format("%s %s:", "Calculator", calc.getName()));
        for (int i = 0; i < 20; i++){
            double random_1 = Math.random();
            double random_2 = Math.random();
            double result = calc.add(random_1, random_2);
            
            String output = random_1 + " + " + random_2 + " = " + result;
            String message = "";
            if ((random_1 + random_2 != result)){
                message = "(error)";
            } else {
                message = "(correct)";
                count++;
            }
            
            System.out.println(String.format("%-70s%s", output,message));
        }
        
        return count/20.0;
    }
    
}
