/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolving;

/**
 *
 * @author user
 */
public class TwoSumofArray {
    
    public static int [] twoSum(int [] num, int target){
        for (int i = 0; i < num.length-1; i++) {
            for (int j = i+1; j < num.length; j++) {
                if(target == num[i]+num[j]){
                    return new int []{i,j};
                }
            }
        }
        return new int[]{};
    }
    
    
    public static void main(String[] args) {
       int num [] = {2,8,7,9,10};
        int target = 10;
      
        for(int x : twoSum(num,target)){
            System.out.println(" "+x);
        }
        
            
        for (int i = 0; i < num.length-1; i++) {
            if(target == num[i]+num[i+1] ){
                System.out.println("The Targetd number found in "+num[i] + " and "+num[i+1]);
            }
        }
        
        
        
    }
}
