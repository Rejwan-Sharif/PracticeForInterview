/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolving;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class Anagram {
    
    
    public static void main(String[] args) {
        
        
        String st = "cape";
        String st1= "race";
        
        if(st.length() ==  st1.length()){
            
            char [] ch1 = st.toCharArray();
            char [] ch2 = st.toCharArray();
            
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            
            boolean re =  ch1.equals(ch2);
            
            if(re){
                System.out.println(st1 +" and "+ st +" are anagram");
            }else{
                System.out.println(st1 +" and "+ st +" are not anagram");
            }
            
        }else{
             System.out.println(st1 +" and "+ st +" are  not anagram");
        }
        
        
    }
    
}
