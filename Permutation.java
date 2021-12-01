/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutation;

/**
 *
 * @author shakila tayefe
 */
public class Permutation {

    /**
     * @param args the command line arguments
     */
    public static void Permutation(String s1, String s2){
       //s stands for string
       int n=s2.length();
       if(n==0){
           System.out.println(s1);
       }else{
           for(int i=0;i<n;i++){
               Permutation(s1+s2.charAt(i), s2.substring(0, i)+s2.substring(i+1, n));
           }
       }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Permutation("", "1234");
    }
    
}
