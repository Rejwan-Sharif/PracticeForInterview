/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;



/**
 *
 * @author Student
 */
public class FactorialRecursion {
    static int factorial(int n){
            
            if(n == 0){
               return 1;
            }
           else return (n*factorial(n-1));
        }
    
    public static void main(String[] args) {
      int fact = 1;
      int number = 5;
      
      fact = factorial(number);
        System.out.println(fact);
        
     }


    
}
