/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoitower;

/**
 *
 * @author shakila Tayefe
 */
import java.util.Scanner;
public class HanoiTower {

    /**
     * @param args the command line arguments
     */
    public static void TowerOfHanoi(int n,char A,char B,char C){
        if(n>0){
            TowerOfHanoi(n-1, A, C, B);
            System.out.println("Move Disk "+n+" from "+A+" to "+C);
            TowerOfHanoi(n-1, B, A, C);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of disks:");
        n=input.nextInt();
        TowerOfHanoi(n, 'A', 'B', 'C');
        System.out.println("");
        //Tower of Hanoi puzzle with n disks can be solved in minimum 2^n-1 steps
        System.out.println("Number of movements: "+(Math.pow(2, n)-1));
        
        
    }
    
}
