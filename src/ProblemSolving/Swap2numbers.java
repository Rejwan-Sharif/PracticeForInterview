/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolving;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Swap2numbers {
    public static void main(String[] args) {
        Scanner input =  new Scanner (System.in);
        
         System.out.print("Enter a value for a : ");
        int a = input.nextInt();
         System.out.print("Enter a value for b : ");
        int b = input.nextInt();
       
        int c=0;
        
        c = b;
        b = a;
        a = c;
        
        
        System.out.println("After swaping the value of a : "+a);
        System.out.println("After swaping the value of b : "+b);
        
        
    }
    
}
