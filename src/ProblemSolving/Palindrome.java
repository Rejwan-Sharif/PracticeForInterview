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
public class Palindrome {
    
    public static void main(String[] args) {
        
        
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
   
       
        if(isPalindrome(num)){
            System.out.println(num+" is palindrome");
        }else{
            System.out.println(num+ " is not palindrome");
        }
    }
    
     static boolean isPalindrome( int num){
         int d = num;
        int sum =0;
          while(num > 0){
              int  x = num%10;
              sum =sum*10+x;
              num /=10;
              
          }
         
         return  d==sum;
      }
     
     
     
     
    
}
