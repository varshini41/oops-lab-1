/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = in.nextLine();
        System.out.print("Enter Purchase Amount: ");
        double amt = in.nextInt();
        int d = 0;
        
        if (amt <= 100)
            d = 10;
        else if (amt <= 200)
            d = 10;
        else
            d = 0;
            
        double discAmt = amt * d / 100.0;
        double finalAmt = amt - discAmt;
        
        System.out.println("unit price + price);
        String quantity;
        String price = null;
System.out.println("after discount: " + price);
        System.out.println("F: " + finalAmt);
    }
    
}
