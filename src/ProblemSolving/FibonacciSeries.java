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
public class FibonacciSeries {
    
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        
        int n = input.nextInt();
        
        int a = 0, b = 1, fibo;
        
        for (int i = 2; i < n; i++) {
            fibo =  a+b;
            System.out.println(fibo);
            a = b;
            b =  fibo;
        }
        
      
        
        
    }
    
}
