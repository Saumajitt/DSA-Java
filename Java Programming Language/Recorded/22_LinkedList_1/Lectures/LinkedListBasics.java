public class LinkedListBasics {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addLast(4);
        // ll.print();
        // ll.addLast(5);
        // ll.print();
        // ll.add(2, 3);
        // ll.print();
        // // System.out.println(ll.size);
        // System.out.println(ll.removeFirst());
        // ll.print();
        // System.out.println(ll.removeLast());
        // ll.print();
        // System.out.println(ll.size);

        ll.print();
        ll.addFirst(4);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();

        System.out.println(ll.recursiveSearch(3));
        System.out.println(ll.recursiveSearch(10));
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

        // step 3 ---> head will be pointing to the new node that was inserted in the front
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

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i<index-1){
            temp = temp.next;
            i++;
        }

        //i == index-1 --> temp ->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if(size == 0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


    public int removeLast(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        // prev node should be reached when i = size-2
        
        Node prev = head; 
        for(int i = 0; i<size-2; i++){
           prev = prev.next; 
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    public int iterativeSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if(temp.data == key){
                return i; //key found
            }else{
                temp = temp.next;
                i++;
            }  
        }
        return -1; //key not found

    }

    public int helper(Node head, int key){
       if(head == null){
            return -1; 
       } 

       if(head.data == key){
            return 0;
       }
       int idx = helper(head.next, key);
       if(idx == -1){
            return -1;
       }
       return idx + 1;
    }

    public int recursiveSearch(int key){
        return helper(head,key);
    }
}
