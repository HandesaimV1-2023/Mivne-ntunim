/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuep;

/**
 *
 * @author ברייש חנה
 */
public class Queue <T>{
      private Node<T> front;
    private Node<T> rear ;

        
    public Queue(){
        front = null;
        rear = null;
    }
    
    public boolean isEmpty(){
        return front == null;
    }
    
    public void insert(T x){
        Node<T> temp = new Node<T>(x);
        if(front == null){
            rear=temp;
            front =rear; 
        }   
        else
        {
            rear.setNext(temp);
            rear = temp;
        }
    }
    
    public T remove(){
        T value = front.getValue();
        front = front.getNext();
        if(front == null)
            rear =null;
        return  value;
    }
    
    public Node<T> head(){
        return front;
    }
}