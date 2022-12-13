/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuep;

import java.util.Scanner;

/**
 *
 * @author ברייש חנה
 */
public class QueueP {
    
    
    
    public static double avg() {
        Scanner input=new Scanner(System.in);
        
        Queue<People> q=new Queue<>();
        People p=new People();
        int numOfWaiters=0;
        
        char code=input.next().charAt(0);
        int num=input.nextInt();
        double time=input.nextDouble();
        
        while(code=='b' || code=='p')
        {
            if(code=='p')
            {
                p.setNum(num);
                p.setTime(time);
                q.insert(p);
                numOfWaiters+=num;
                System.out.println("time: "+time+" ,"+num+" people came "+ numOfWaiters+" peaple are waiting");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


    }
    
}
