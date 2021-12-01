/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author shakil
 */
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //reversing the order of elements using queue and stack
         Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements");
        n=input.nextInt();
        Queue<Integer> q=new LinkedList<Integer>();
        //as queue is an abstract we should define it like the above
        int m;
        //m variable is used to get the elements from user
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            m=input.nextInt();
            q.add(m);
        }
        Stack s=new Stack();
        for(int j=0;j<n;j++){
            s.push(q.remove());
        }
        System.out.println("Elemnts in reverse order:");
        for(int k=0;k<n;k++){
            System.out.println(s.pop());
        }
        
    }
    
}
