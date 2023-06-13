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
public class DuplicateCharacterInString {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entera String : ");
        String value = input.nextLine();
     
        char[] string =  value.toCharArray();
        int count  =0;
        
        for (int i = 0; i < string.length; i++) {
            for (int j = i+1; j < string.length; j++) {
                if(string[i]  == string[j] && string[i] != ' '){
                   System.out.println("Duplicate character is : "+string[j]);
                    count++;
                    break;
                }
                
                
                
            }
        }
        System.out.println("Total duplicate  number is "+count);
       
    }
    
}
