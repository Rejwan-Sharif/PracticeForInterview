/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolving;

/**
 *
 * @author user
 */
public class LeargestElementOfArray {
    
    public static void main(String[] args) {
        
        int arr[] = {1,6,9,7,4,12,9,18};
        int large =arr[0];
        for(int i = 0; i<arr.length;i++){
           if(arr[i]>large){
               large  =  arr[i];
           }
          
        }
        System.out.println(large);
        
    }
    
    
    
    
}
