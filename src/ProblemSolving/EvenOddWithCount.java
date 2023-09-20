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
public class EvenOddWithCount {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

//        int x  =0;
//        int y  =0;
//        for(int i = n; i <=m; i++) {
//            if(check(i)){
//                x++;
//                System.out.println(i+ "is even");
//            }else{
//                y++;
//                System.out.println(i+ "is odd");
//            }
//        }
//        System.out.println("total even count is "+ x);
//        System.out.println("total odd count is "+ y);
        
        
        
        int[] count = evenOdd(n, m);
        int evenCount = count[0];
        int oddCount = count[1];

        evenNums(n, m);
        System.out.println("total even count: " + evenCount);
        oddNums(n, m);
        System.out.println("total odd count: " + oddCount);
        
    }

    static boolean check(int i){
        return i%2 ==0;
    }

    static int[] evenOdd(int n, int m) {
        int even = 0;
        int odd = 0;
        for (int i = n; i <= m; i++) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        int[] count = { even, odd };
        return count;
    }

    static void evenNums(int n, int m) {
        for (int i = n; i <= m; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " even");
            }
        }
    }

    static void oddNums(int n, int m) {
        for (int i = n; i <= m; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " odd");
            }
        }
    }
    
}
