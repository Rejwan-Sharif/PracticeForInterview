/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GreeksforGreek;

/**
 *
 * @author user
 */
public class SumofArrayElement {
    
    public static void main(String[] args) {
        
        int arr[] = {2,4,3,1,7,3};
        
        System.out.println(sumOfArray(arr));
        
    }
    
    static int sumOfArray(int [] arr){
        int sum =0;
        
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    
}
