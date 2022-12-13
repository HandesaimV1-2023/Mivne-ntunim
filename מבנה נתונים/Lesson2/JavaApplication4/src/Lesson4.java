/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ברלין שולמית
 */




public class Lesson4 {

    private class node
    {
        int info;
        node next;
        // לא עשיתי כאן פונקציות get ו set
    }
    private class list
    {
        node head=null;
        
        public node newNode(int x)
        {
            node n=new node();
            n.info=x;
            n.next =null;
            return n;
        }
        
      // להפעיל בטבלת מעקב כל אחד מהמקרים הבאים
      
        //א.    1, 2, 4
        //      1,3, 4,8
  
        // ב. 1,1,1,2,3
        //    1,3,6,6,6,7        
        
        // ג. 
        // 1
        // 2,3
        
        
        // הדפיסי את הערכים המשותפים בשתי רשימת ממוינות שלא חוזרות על עצמן.
        public  void printnodes1(node l1,node l2)
        {
            
            node p1=l1,p2=l2; 
            // כל עוד שניהם לא נל 
            while (p1!=null && p2!=null) 
            {
                if (p1.info== p2.info)
                {
                    System.out.println(p1.info);
                    p1=p1.next;
                    p2=p2.next;
                }
                else if(p1.info>p2.info)
                        p2=p2.next;
                else 
                    p1=p1.next;
            }
            // לא משנה לי מה יש בהמשך הרשימה
            
        }
        // הדפיסי את הערכים הזהים כאשר הרשימות לא ממוינות
        public  void printnodes2(node l1,node l2)
        {
            
           //לעבור על רשימה אחת כל עוד היא קימת ואז עבור כל ערך לחפש אותו בשניה וכשמוצאים להדפיס ולצאת
            
            node p1=l1;
            node p2=null;
            while (p1!=null)
            {
//                p2=l2;
////                while (p2!=null)
////                        if(p2.info==p1.info)
////                        {
////                            System.out.println(p1.info);
////                            p2=null;
////                        }     
//                    
//               while (p2!=null && p2.info!=p1.info)             
//                    p2=p2.next;
               
               
               for(p2=l2;p2!=null && p2.info!=p1.info; p2=p2.next);
               if(p2!=null)  // אם מצאת
                    System.out.println(p2.info);
                
            }
            
        }
            // כתבי פונקציה שתקבל רשימה ותדפיס את כל האיברים  שגדולים משני שכינהם
        public void printnode3(node list)
        {
            node prev,current;
            
            prev=list; current=list.next;
            
            while (current.next!=null)
            {
                if (prev.info < current.info && current.next.info<current.info)
                    System.out.println(current.info);
                
                prev=current;
                current=current.next;
            }
            
            
            
            
        }
        11,22,33,44,5,6,7,8
        3
        
        // כתבי פונקציה שתקבל מספר אן  ותסיר את האיבר  האני 
        public void deleteNode(int x,node list)
        {        
            node p1,nod;
            int i;
            for(  i=1,p1=list; i<x && p1.next!=null; i++,p1=p1.next );
            
           if (p1==null)
                System.out.println("הרשימה קצרה מידי");
           else
           {
               nod=p1.next;  // שמירת הצומת הנוכחית
               p1.next=p1.next.next;// חברנו צומת קודמת להבאה
         //???     delete(nod);  // שחרור הזכרון
            
           }
                        
        ..// כתבי תכנית שתקבל שני מצסים ותוציא מהרשימה את כל הערכים במקומות שבין שני המספרים
            
            
            
            
        }
    
        // כתבי פונקציה שתסיר כל איבר שגדול מקודמו
        
        // כתבי פונקציה שתשתקבל ערך וותמחק את כל המופעים שלו
                
        
        public node insertNode(int x)
        {
            return null;
        }
    
    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
