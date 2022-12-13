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
public class LinkList {

    
    
    public static Node create_list_on_Begin()
            {
            int []arr={1,4,2,5,4,6,5};
            Node<Integer> list=null;
            
                for (int i = 0; i < arr.length; i++) {
                    {
                        Node n= new Node(arr[i]);
                        if(list==null)// עכשו מוסיפים את האיבר הראשון       
                            list=n;
                        else
                        {
                            n.setNext(list);
                            list.setPrev(n);
                            list=n;
                        }
                    }
                }
            
            
            
            return list;
            }
    
    public static Node create_list_on_End()
            {
            int []arr={1,4,2,5,4,6,5};
            Node<Integer> list=null;
            Node<Integer> last=null;
            
                for (int i = 0; i < arr.length; i++) {
                    {
                        Node n= new Node(arr[i]);
                        if(list==null)// עכשו מוסיפים את האיבר הראשון       
                        {
                            list=n;
                            last=n;
                        }
                        
                        else
                        {
                            last.setNext(n);
                            n.setPrev(last);
                            last=n;
                        }
                    }
                }
            
            
            
            return list;
            }
    
    public static SimpleNode<Integer> createSimpleList()
    {
    
            int []arr={1,4,2,5,4,6,5};
            SimpleNode<Integer> list=null;
            SimpleNode<Integer> last=null;
            
                for (int i = 0; i < arr.length; i++) {
                    {
                        SimpleNode n= new SimpleNode(arr[i]);
                        if(list==null)// עכשו מוסיפים את האיבר הראשון       
                        {
                            list=n;
                            list.setNext(list);
                            last=n;
                        }
                        
                        else
                        {
                           //איך מוסיפים בסוף 
                            
                            last.setNext(n);
                            n.setNext(list);
                            last=n;
                        }
                           
                        }
                    }
    return list;
    }
    
    public static void print(SimpleNode list)
    {            int []arr={1,4,2,5,4,6,5};
    
        SimpleNode n=list;
        while (n.getNext()!=list)
        {
            System.out.print(n.getInfo()+",");
            n=n.getNext();
        }
        System.out.println(n.getInfo());
            
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Node list=create_list_on_Begin();
        Node list2=create_list_on_End();
        
        SimpleNode l=createSimpleList();
        print(l);
        
    }
    
}
