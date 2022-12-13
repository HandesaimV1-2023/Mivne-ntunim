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
public class Node<T> {
    private T value;
    private Node<T> next;

     public Node() {
        this.next = null;
    }
    //הוספת צומת לסוף הרשימה
    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    //הוספת צומת לאמצע הרשימה/במחיקה
    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setValue(T value) {
        this.value = value;
    }
    
    
    
}

