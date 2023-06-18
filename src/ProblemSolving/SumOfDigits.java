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
public class SumOfDigits {
    
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        System.out.print("Enater a  number : ");
        int num = a.nextInt();
        int sum = 0;
        
        System.out.println(addSumDigit(num, sum));
    }
    
    
    
    public static int addSumDigit(int num, int sum) {
        int temp = num;
        while (temp != 0) {
            int x = temp % 10;
            sum += x;
            temp = temp / 10;
        }
        return sum;
    }
    
}
