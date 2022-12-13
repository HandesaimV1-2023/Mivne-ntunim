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
public class BinNode<T> {
    private T value;
    private BinNode<T> left;
    private BinNode<T> right;

    public BinNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public BinNode(T value, BinNode<T> left, BinNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public BinNode<T> getLeft() {
        return left;
    }

    public BinNode<T> getRight() {
        return right;
    }
    
    public boolean hasLeft()
    {
        if(left!=null)
            return true;
        return false;
    }
    
    public boolean hasRight()
    {
        if(right!=null)
            return true;
        return false;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setLeft(BinNode<T> left) {
        this.left = left;
    }

    public void setRight(BinNode<T> right) {
        this.right = right;
    }
    
}
