/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchtest;

/**
 *
 * @author lgcardenas91
 */
public class SwitchTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cad = "delete";
        switch (cad) {
            case "insert":
                System.out.println("cad");
            case "delete":
                System.out.println("pepe");
            default:
                System.out.println("default");
                    
        }
    }
}