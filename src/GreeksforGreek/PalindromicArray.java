/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GreeksforGreek;

/**
 *
 * @author user
 */
public class PalindromicArray {
    
    public static void main(String[] args) {
        
        int arr [] = {121,235,545,656};
        
        System.out.println(nums(arr));
        
    }
    
    static int nums(int arr[]){
        
       
        
        for (int i = 0; i < arr.length; i++) {
           
            if(isPalindrom(arr[i])== true);
            else return 0;   
        }
       return 1;
    }
    
    static boolean isPalindrom(int value){
        int temp= value;
        int sum = 0;
        while(value != 0){
                int x = value%10;
                sum = sum*10+x;
                value /= 10;
            }
        
            if(sum == temp) return true;
            else return false;
            
    }
    
}
