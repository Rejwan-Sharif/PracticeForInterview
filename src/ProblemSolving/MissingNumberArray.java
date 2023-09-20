/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolving;

/**
 *
 * @author user
 */
public class MissingNumberArray {
    
    
    public static void main(String[] args) {
    
        int arr [] = {2,4,3,1,6};
       
        int indx = -1;
           int sum  =0;
            for(int i=1;i<arr.length;i++){
                
                if(arr[i]==0){
                    indx = i;
                }else{
                    sum+=arr[i];
                }
               
            }
            int total = (sum+1)*(sum/2);
            
            System.out.println(total-sum+" found in index number "+indx);
    }
    
   
}
