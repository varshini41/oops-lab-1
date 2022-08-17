/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereint n, x, flag = 0, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        int i;
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the element you want to find:");
        int x = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                int flag = 1;
                break;
            }
            else
            {
                int flag = 0;
            }
        }
        int flag = 0;
        if(flag == 1)
        {
            System.out.println("Element found at position:"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
    
