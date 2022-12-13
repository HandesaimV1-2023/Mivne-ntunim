/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintreenode;

/**
 *
 * @author ברייש חנה
 */
public class Queue <T>{
      private Node<T> front;
    private Node<T> rear = new Node<T>();

        
    public Queue(){
        front = null;
        rear = new Node<T>();
    }
    
    public boolean isEmpty(){
        return front == null;
    }
    
    public void insert(T x){
        Node<T> temp = new Node<T>(x);
        if(front == null)
            front = rear=temp;
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
            rear = new Node<T>();
        return  value;
    }
    
    public Node<T> head(){
        return front;
    }
}
