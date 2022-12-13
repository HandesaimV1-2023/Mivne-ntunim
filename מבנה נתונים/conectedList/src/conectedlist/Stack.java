/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectedlist;

/**
 *
 * @author ברייש חנה
 */
public class Stack<T> {
    public Node<T> head;

    public Stack() {
        this.head=null;
    }
    
    public void push(T x)
    {
        Node<T> temp=new Node<T>(x);
        temp.setNext(head);
        head=temp;
    }
    
    public T pop()
    {
        T temp=head.getValue();
        head=head.getNext();
        return temp;
    }
    
    public T top()
    {
        T temp=head.getValue();
        return temp;
    }
    
    public boolean isEmpty()
    {
        if(head.getValue()==null)
            return true;
        return false;
    }
}