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
        
//         System.out.print("Enter a value for a : ");
//        int a = input.nextInt();
//         System.out.print("Enter a value for b : ");
//        int b = input.nextInt();
        
//    with using  third variable

//        int c=0;
//        
//        c = b;
//        b = a;
//        a = c;
//        System.out.println("After swaping the value of a : "+a);
//        System.out.println("After swaping the value of b : "+b);
        
//     without using third variable

         System.out.print("Enter a value for x : ");
        int x = input.nextInt();
         System.out.print("Enter a value for y : ");
        int y = input.nextInt();
        
//        x = x+y;
//        y = y+x;
//        x = y-x;
//        y = y-x-x;
        
        x = x+y;
        y = x-y;
        x = x-y;
        
        
        
        System.out.println("After swaping the value of x :"+x);
        System.out.println("After swaping the value of y :"+y);
        
    }
    
}
