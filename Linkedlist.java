public class Linkedlist<T>
{
   Node<T> entry;
   Node<T> reverseEntry;
   Linkedlist<T> newList;
   public void add(T t)
   {
       if(entry==null)
       {
           entry=new Node<T>();
           entry.t=t;
           entry.next=null;
       }
       else
       {
           Node<T> temp=entry;
           while(temp.next!=null)
           {
               temp=temp.next;
            
           }
           Node<T> newNode=new Node<>();
           newNode.t=t;
           newNode.next=null;
           temp.next=newNode;}
   } 
   public void print()
   {
       Node<T> temp=entry;
       while(temp.next!=null)
       {
           System.out.println(temp.t);
           temp=temp.next;
          
       }
       System.out.println(temp.t);
   }
   public void reverseLinkedList(Node<T> entry1)
   {
   
      
      if(entry1==null)
      {
          return ;
      }
      
      else{
          
          reverseLinkedList(entry1.next);
      
         
          newList.add(entry1.t);
    }
}
   public Linkedlist<T> reverse(Node<T> entry1)//returns the reversed list
   {
       newList=new Linkedlist<>();
       reverseLinkedList(entry1);//recursive func
       return newList;
   }
   public void printReverse(Node<T> entry)
   {
       Node<T> temp=entry;
       while(temp.next!=null)
       {
           System.out.println(temp.t);
           temp=temp.next;
       }
       System.out.println(temp.t);
   }
}
