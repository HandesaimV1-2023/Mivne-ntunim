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
public class List <T> {
    //ראש הרשימה
    private Node<T> head;
    //סוף הרשימה
    private Node<T> tail;
    
    public List() {
        head = null;
        tail = null;
    }
    
    //הוספת צומת לאמצע הרשימה
    public void insertAfter(Node<T> n,T value){
        Node <T> temp=new Node <T> (value);
        temp.setNext(n.getNext());
        n.setNext(temp);
        if(temp.getNext()==null)
            this.tail= temp;
    }
    
    //הוספה לסוף הרשימה
     public void insert(T value){
        Node<T> temp = new Node<T>(value);
        if(head==null)
            head=tail=temp;
        else
        {
            tail.setNext(temp);
             tail= temp;
        }
    } 
     
    public void delete(Node<T> n){
        if(n==head)
            head=n.getNext();
        else{
            n.setNext(n.getNext().getNext());
            if(n.getNext()==null)
                tail=n;
        }
    }

    public Node<T> getList() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }
    
}
