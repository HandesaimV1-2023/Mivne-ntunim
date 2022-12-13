/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist;

/**
 *
 * @author ברלין שולמית
 */
public class Node<T>
{
    // לרשימה רגילה
   private  T  info;
   private Node next;
   private Node prev; // הקודם לרשימה דו כיוונית

   
   public  Node (T info)
   {
       
       this.info=info;
       this.next=null;
       this.prev=null;
       
   }
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
   
    public void setInfo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }
    
}
