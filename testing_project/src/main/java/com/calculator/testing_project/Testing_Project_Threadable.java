/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.testing_project;

import java.lang.Math;
import com.calculator.calculator.Calculator;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lgcardenas91
 */

public class Testing_Project_Threadable {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Threadable_calculator[] threadeble_calculators = new Threadable_calculator[2];
        
        for (int i = 1; i <= 2; i++){
            threadeble_calculators[i-1] = new Threadable_calculator("Crystal "+i);
            Thread testing = new Thread(threadeble_calculators[i-1]);
            testing.start();
            try {
                testing.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Testing_Project_Threadable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        Threadable_calculator better = null;
        for (Threadable_calculator t: threadeble_calculators){
            if (better == null || better.getRate() < t.getRate()) {
                better = t;
            } 
            
            System.out.println(t.calculator.getName() + " Success Rate: " + t.rate);
        }
        
        System.out.println(better.calculator.getName() + " is better");
    }
 
    private static class Threadable_calculator implements Runnable{
    
        private Calculator calculator;
        private double rate;

        public Threadable_calculator(String calculator_name){
            this.calculator = new Calculator(calculator_name);
        }

        @Override
        public void run() {
            this.process(this.calculator);
        }

        private void process(Calculator calc){
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

            this.rate = count/20.0;
        }
        
        public Calculator getCalculator(){
            return this.calculator;
        }
        
        public double getRate(){
            return this.rate;
        }

    }
    
}
