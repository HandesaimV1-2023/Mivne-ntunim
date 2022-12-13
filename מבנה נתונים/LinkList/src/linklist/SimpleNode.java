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
public class SimpleNode<T> {
     // לרשימה רגילה
   private  T  info;
   private SimpleNode next;
   public  SimpleNode (T info)
   {
       
       this.info=info;
       this.next=null;
       
       
   }
    public SimpleNode getNext() {
        return next;
    }

    public void setNext(SimpleNode next) {
        this.next = next;
    }

   
   
    public void setInfo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }
    
}
