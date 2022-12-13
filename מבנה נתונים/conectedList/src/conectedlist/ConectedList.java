/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectedlist;

import java.util.Scanner;

/**
 *
 * @author ברייש חנה
 */
public class ConectedList {
     public static Node<Integer> build() {
        Scanner input=new Scanner(System.in);
        Node <Integer> list=null, last=null, p;
        int x;
        System.out.println("insert number");
        x=input.nextInt();
        while(x!=-1)
        {
            p=new Node<Integer>(x);
            
            if(list==null){
                list=p;
            }
            else
                last.setNext(p);
            
            last=p;
            
            System.out.println("insert number");
            x=input.nextInt();
         
        }
        
        return list;
    }
     
     //פונקציה המקבלת מצביע לראש הרשימה ומוסיפה צומת חדשה עם הערך המתקבל לסוף הרשימה 
     public static void insert(Node<Integer> head,int value){
        Node <Integer> temp=new Node <Integer> (value);
        while(head.getNext()!=null)
            head=head.getNext();
        head.setNext(temp);  
    }
    //פונקציה המקבלת צומת ומוסיפה אחריה צומת חדשה עם הערך המתקבל 
     public static void insertAfter(Node<Integer> n,int value){
        Node <Integer> temp=new Node <Integer> (value);
        temp.setNext(n.getNext());
        n.setNext(temp);  
    }

     //פונקציה המקבלת מצביע לראש הרשימה וערך של צומת שרוצים למחוק
     //ומחזירה מצביע לראש הרשימה
      public static Node<Integer> delete(Node<Integer> head,int value){
        Node <Integer> temp=head;
        if(temp.getValue()==value)
            return temp.getNext();
        while(temp.getNext()!=null)
        {
            if(value==temp.getNext().getValue())
                temp.setNext(temp.getNext().getNext());
            temp=temp.getNext();
        }
        return head;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}
