/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author hp
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0, count = 0;
 for (int i = 100; i < 200; i++)
 {
     if (i % 8 == 0)
     {
         sum = sum + i;
         count++;
     }
 }
 System.out.println("The Sum of the number between 100 to 200 which are divisible by 8 is: "+sum);
 System.out.println("Total numbers between 100 to 200 which are divisible by 8 is: "+count);
    }
    
}
