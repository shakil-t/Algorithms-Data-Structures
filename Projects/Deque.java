/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shakil
 */
public class Deque {
    final int len= 1024;
    public int  front;
    public int  rear;
    private int[] q=new int[len];
    
    public Deque(){
        front=-1;
        rear=-1;
    }
    public boolean isEmpty(){
        return (front == -1);
    }
    public boolean isFull(){
        return ((front==0 && rear==len-1) || front==rear+1);
    }
    public boolean addFirst(int x){
        if(isFull()==true){
            System.out.println("Queue is full!");
            return false;
        }
        if(front==-1){
            front = 0;
            rear = 0;
        }else{
            if(front==0){
                front=len-1;
            }else{
                front--;
            }
        }
            q[front]=x;
            return true;
    }
    public boolean addLast(int x){
        if(isFull()==true){
            System.out.println("Queue is full!");
            return false;
        }
        if(front==-1){
            front=0;
            rear=0;
        }else{
            if(rear==len-1){
                rear=0;
            }else{
                rear++;
            }
        }
        q[rear]=x;
        return true;
    }
    public int removeFirst(){
        if(isEmpty()==true){
            System.out.println("Queue is empty!");
        }
        if(front==rear){
            front=-1;
            rear=-1;
        }else{
            if(front==len-1){
                front = 0;
            }else{
                front++;
            }
    }
        return q[front];
    }
    public int removeLast(){
        if(isEmpty()==true){
            System.out.println("Queue is empty!");
        }
        if(front==rear){
            front=-1;
            rear=-1;
        }else{
            if(rear==0){
            rear=len-1;
            }else{
                rear--;
            }
        }
        return q[rear];
    }
}
