/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GreeksforGreek;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PrintNumberWithoutLoop {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        nums(n);
    }
    
    static void nums(int n){
        if(n >= 1){
            nums(n-1);
            System.out.println(n);
        }
    }
    
}
