/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halloecho;

import java.util.Scanner;

/**
 *
 * @author micha
 */
public class Echo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Eingabe:");
        String str = scan.nextLine();
       str = str.replace(" ", "");
        Echo_BL obj = new Echo_BL(str);
        
        Thread c1 = new Thread(obj);
        
        c1.start();
    }
    
}
