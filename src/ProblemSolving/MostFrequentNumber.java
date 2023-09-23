/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolving;

/**
 *
 * @author user
 */
public class MostFrequentNumber {
    
    public static void main(String[] args) {
        
        int  arr []  = {3,1,2,5,6,1,3,8,3};
        int n=  arr.length;
        
        System.out.println(freqNums(arr, n));
    }
    
    static int freqNums(int arr[],int n){
        
        int maxcount =0;
        int frequntNums =0;
        
        for (int i = 0; i < n; i++) {
            int count =0;
            for (int j = 0; j < n; j++) {
                 if(arr[i] == arr[j]){
                 count++;
            }
            }
            if(count>maxcount){
                maxcount=count;
                frequntNums = arr[i];
            }
        }
        return frequntNums;
    }
}
