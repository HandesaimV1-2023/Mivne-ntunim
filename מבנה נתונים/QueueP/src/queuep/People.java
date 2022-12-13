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
public class People {
    private int num;
    private double time;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public People(int num, double time) {
        this.num = num;
        this.time = time;
    }

    public People() {
    }
    
    
}
