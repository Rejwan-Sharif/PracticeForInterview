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
public class Sumofseries {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SumofSeries(n));
    }
    
    static int SumofSeries(int n){
        int sum  =0;
        for (int i = 1; i <=n; i++) {
            sum+=i;
        }
        return sum;
    }
    
}
