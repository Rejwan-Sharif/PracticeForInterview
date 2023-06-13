/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolving;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PrimeNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
//        
//        int number =  input.nextInt();
//        int temp =0;
//       
//        if(number ==  0 ||  number == 1){
//            System.out.println("Prime number starts with  2");
//        }else{
//            for (int i = 2; i < number; i++) {
//                if(number%i == 0){
//                    temp++;
//                    break;
//                }
//            }
//        }
//        if(temp == 0){
//            System.out.println(number+" is prime number");
//        }else{
//            System.out.println(number+" is not prime  number");
//        }


//    fromm n to m nuumber check is prime or not

        System.out.print("Enter a n number : ");        
        int n = input.nextInt();
        System.out.print("Enter a m number : ");   
        int m = input.nextInt();
       
        int temp =0;
        int primeCount=0;
        
        for (int i = n; i < m; i++) {
            for (int j = 2; j <= i-1; j++) {
                if(i%j  == 0){
                    temp++;
                    break;
                }
            }
            if(temp==0){
                System.out.println(i);
                primeCount ++;
            }
            temp=0;
        }
        System.out.println("Total prime  number =  "+primeCount);
      
    }
    
    
    
}
