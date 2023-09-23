/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GreeksforGreek;

/**
 *
 * @author user
 */
public class ValueofEqualIndex {
    
    public static void main(String[] args) {
        
        int arr[] ={2,4,1,3,8,9,2};
        
        System.out.println(indxEqualVale(arr));
    }
    
    static int indxEqualVale(int arr[]){
        int found =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== i){
                found = i;
            }
        }
        return found;
    }
    
}
