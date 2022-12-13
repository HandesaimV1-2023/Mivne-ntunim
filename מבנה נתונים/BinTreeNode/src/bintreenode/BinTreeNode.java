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
public class BinTreeNode {
    
    public static void printLevel(BinNode<Integer> t)
    {
        if(t==null)
            return;
        Queue<BinNode<Integer>> q=new Queue<BinNode<Integer>>();
        BinNode<Integer> temp;
        q.insert(t);
        while (!q.isEmpty()) {
            q.insert(t);
            while(!q.isEmpty())
            {
                temp=q.remove();
                System.out.println(temp.getValue());
                if(temp.getLeft()!=null)
                    q.insert(temp.getLeft());
                if(temp.getRight()!=null)
                    q.insert(temp.getRight());
            }
            
        }
    }

    //הדפסה תחילית
    public static void preOrder(BinNode<Integer> bt)
    {
        if(bt==null)
            return;
        System.out.println(bt.getValue());
        preOrder(bt.getLeft());
        preOrder(bt.getRight());
    }
    
    //הדפסה תוכית
     public static void inOrder(BinNode<Integer> bt)
    {
        if(bt==null)
            return;
        
        inOrder(bt.getLeft());
        System.out.println(bt.getValue());
        inOrder(bt.getRight());
    }
     
     //הדפסה סופית
      public static void postOrder(BinNode<Integer> bt)
    {
        if(bt==null)
            return;
        
        postOrder(bt.getLeft());
        postOrder(bt.getRight());
        System.out.println(bt.getValue());
    }
      
      public static BinNode<Integer> buildTree()
      {
          BinNode<Integer> tree, t1, t2, bt1, bt2;
          t1=new BinNode<Integer>(5);
          t2=new BinNode<Integer>(7);
          t2.setLeft(new BinNode<Integer>(9,null,new BinNode<Integer>(10)));
          
          bt1=new BinNode<Integer>(1, t1,t2);
          bt2=new BinNode<Integer>(2, null,bt1);
          
          t1=new BinNode<Integer>(3);
          t2=new BinNode<Integer>(4);
          t2.setLeft(new BinNode<Integer>(11));
          t2.setRight(new BinNode<Integer>(12,new BinNode<Integer>(13),null));
          
          bt1=new BinNode<Integer>(8, t1,t2);
          
          tree=new BinNode<Integer>(6, bt2,bt1);
          
          return tree;
      }
 
    public static void main(String[] args) {
     
    }
    
}
