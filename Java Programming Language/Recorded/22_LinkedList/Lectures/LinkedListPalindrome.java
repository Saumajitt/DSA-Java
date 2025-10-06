
public class LinkedListPalindrome {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        // ll.addLast(1);

        ll.print();
        System.out.println(ll.checkPalindrome());
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

    //slow -fast approach
    public Node findMidNode(Node head){
        Node slow = head;
        Node fast = head;


        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }

        return slow;
    }


    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //step 1 find mid
        Node midNode = findMidNode(head);
        //step 2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //step 3 check left half and right half
        Node right = prev;
        Node left = head;

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

}
