/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastaticinitializerblock;

import java.util.Scanner;

/**
 *
 * @author lgcardenas91
 */
public class JavaStaticInitializerBlock {
    static boolean flag = true;
    static int H = 2, B = 3;
    int jeniffer;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
    }
    
}
