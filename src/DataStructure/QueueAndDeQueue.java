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
public class QueueAndDeQueue {
    
    public static void main(String[] args) {
        
        Queue<String>que = new LinkedList();
        
        
        que.add("Hasan");
        que.add("Jamil");
        que.add("Rahman");
        que.add("Mannan");
        que.add("Jahan");
        
        que.forEach((list)->{
            System.out.println(list);
        });
        
    }
    
}
