/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author hp
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int speed;
      long days, seconds, dist;
      speed = 186000;
      days = 365;
      seconds = days * 24 * 60 * 60;
      dist = speed * seconds;
      System.out.print("Light travels: "+dist + " miles");
    }
    
}
