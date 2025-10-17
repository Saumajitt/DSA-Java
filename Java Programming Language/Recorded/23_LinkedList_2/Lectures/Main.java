
public class Main {
    public static void main(String[] args) {
        LL list1  = new LL();



        list1.insertFirst(5);
        list1.insertFirst(4);
        list1.insertFirst(3);
        list1.insertFirst(2);
        list1.insertFirst(1); 

        // list1.print();
        
        // list1.mergeSort();

        // list1.print();

        System.out.println("Before zigzag:");
        list1.print();

        list1.zigZag();

        System.out.println("After zigzag:");
        list1.print();
       
        
        
        
        // System.out.println(list1.isCycle());
        // list1.createCycle(1);
        // System.out.println(list1.isCycle());
        // list1.removeCycle();
        // System.out.println(list1.isCycle());
        
        // System.out.println("Has cycle (before): " + list1.isCycle());
        // list1.createCycle(2);
        // System.out.println("Has cycle (after): " + list1.isCycle());
    }
}
