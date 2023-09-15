/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructure;
import java.util.*;
/**
 *
 * @author user
 */
public class StackImplementation {
    
    public static void main(String[] args) {
        
           Stack<String>stk = new Stack();
           
           stk.push("Riaz");
           stk.push("Mahbub");
           stk.push("Habib");
           stk.push("rayhan");
           stk.push("Rijwan");
      
           System.out.println(stk.pop());
           System.out.println("");
        
           stk.forEach((name)->{
               System.out.println(name);
           });
        
    }
    
}
