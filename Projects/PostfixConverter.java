/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author shakil
 */
import java.util.Stack;
public class Test {

    /**
     * @param args the command line arguments
     */
    public static String PostfixConverter(String infix){
        String postfix="";
        Stack s=new Stack();
        for(int i=0;i<infix.length();i++) {
            char c=infix.charAt(i);
            if(c=='('){
                s.push('(');
            }
            if(c==')'){
                Character operator = (Character)s.peek();
                while(!(operator.equals('(')) && !(s.isEmpty())) {
                    postfix+=operator.charValue();
                    s.pop();
                    operator=(Character)s.peek();
                }
                s.pop();
            }
            if(c=='+' || c=='-') {
                if(s.isEmpty()){
                    s.push(c);
                }else{
                    Character operator=(Character)s.peek();
                    while(!(s.isEmpty() || operator.equals(new Character('(')) || operator.equals(new Character(')')))) {
                        s.pop();
                        postfix+=operator.charValue();
                    }
                    s.push(c);
                }
                if(c=='*' || c=='/'){
                    if(s.isEmpty()) {
                        s.push(c);
                    }
                }else{
                    Character operator=(Character)s.peek();
                    while(!operator.equals(new Character('+')) && !operator.equals(new Character('-')) && !s.isEmpty()) {
                       s.pop();
                        postfix+=operator.charValue();
                    }
                    s.push(c);
                }
            }else{
                postfix+=c;
            }
        }
        while(!s.isEmpty()){
            Character operator=(Character)s.peek();
            if(!operator.equals(new Character('('))){
                s.pop();
                postfix+=operator.charValue();
            }
        }
        return postfix;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(PostfixConverter("1+2"));
        
    }
    
}
