

public class Runner {
    public static void main(String[] args) {
        Linkedlist<Integer> l=new Linkedlist<>();
        
        l.add(11);
        l.add(22);
        l.add(33);
        l.add(55);
        l.add(66);
        System.out.println("insersion order");
        l.print();
        Linkedlist<Integer> reversed=l.reverse(l.entry);
        System.out.println("reversed order");
        l.printReverse(reversed.entry);
       
        
        
    }
}
