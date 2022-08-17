/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import static java.time.Clock.system;
import java.util.scanner;

/**
 *
 * @author hp
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        scanner obj=new scanner(system.in);
        System.out.println("how many rows");
        int rows=obj.nexInt();
        System.out.println("here in your pattern");
        for(int i=rows;i>=1;i--)
        {
            for(int j=rows;j>=i;j--)
            {
                System.out.print(j+" ");
            }
       System.out.println();
        }
        
    }
    
}
