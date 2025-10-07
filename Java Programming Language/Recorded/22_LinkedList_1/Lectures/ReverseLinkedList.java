
public class ReverseLinkedList {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(5);
        ll.print();
        ll.addFirst(4);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();

        // ll.reverse();
        // ll.print();

        ll.deleteNthfromEnd(3);
        ll.print();


    }
}


class LinkedList {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
}

    private Node head;
    private Node tail;
    public static int size;


    public void addFirst(int data) {
        // step 1 --> create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 ---> newNode next = head
        newNode.next = head;

        // step 3 ---> head will be pointing to the new node in the front
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        // if(head==null){
        // System.out.println("The LinkedList is empty!");
        // return;
        // }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }


    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev; //reverse step
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    public void deleteNthfromEnd(int n){
        //size calculation
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;
            return;
        }

        int i = 1;
        int indexToFind = sz-n;
        Node prev = head;
        while(i<indexToFind){
            prev = prev.next;
            i++;
        }
        //delete n from end
        prev.next = prev.next.next;
        return;




    }

}
