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
        
        int arr[] = {1,6,9,7,4,12};
        var large =0;
        for(int i = 0; i<arr.length;i++){
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    large= arr[j];
                }
            }
            
        }
        System.out.println(large);
        
    }
    
}
