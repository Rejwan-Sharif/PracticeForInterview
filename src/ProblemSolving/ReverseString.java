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
public class ReverseString {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print(" Enter a  String For reverse : ");
        String string = input.nextLine();
        
        
       String temp ="";
        for(int i =string.length()-1;i>=0;i--){
           temp+=string.charAt(i);
        }
        System.out.println(temp);
        }
}
