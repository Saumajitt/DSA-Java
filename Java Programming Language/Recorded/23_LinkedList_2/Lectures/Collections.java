import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {
        //create - objects can be stored here so Integer class must be used
        LinkedList<Integer> list1 = new LinkedList<>();
        //add
        list1.addLast(1);
        list1.addLast(2);
        list1.addFirst(0);
        //0->1->2
        System.out.println(list1);
        //remove

        list1.removeLast();
        list1.removeFirst();
        System.out.println(list1);

    }
}
