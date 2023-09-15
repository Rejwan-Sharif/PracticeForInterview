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
public class Factorial {
    
    public static void main(String[] args) {
        
    
    Scanner sc =  new  Scanner(System.in);
    int a = sc.nextInt();
    int b = 1;
    for(int i = 1;i<=a;i++){
        b *=i;
    }
        System.out.println(b);

    }
    
}
