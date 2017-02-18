/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isfibo;

import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class IsFibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long number = 0;
        while(n > 0){
            number = sc.nextLong();
            if (isFibo(number)){
                System.out.println("IsFibo");
            }else{
                System.out.println("IsNoFibo");
            }
            n--;
        }
    }
    
    public static boolean isFibo(long number){
        boolean varIsFibo = false;
        long fiboNumber = 1;
        long fiboNumber_1 = 1;
        long fiboNumber_2 = 1;
        while(!varIsFibo){
            if (fiboNumber == number)
                varIsFibo = true;
            fiboNumber = fiboNumber_1 + fiboNumber_2;
            fiboNumber_1 = fiboNumber_2;
            fiboNumber_2 = fiboNumber;
            if (fiboNumber > number)
                break;
        }
        return varIsFibo;
    }
}

//8341170321