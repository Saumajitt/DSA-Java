public class DoubleLL {

    private Node head;
    private Node tail;
    private int size;

    public DoubleLL(){
        this.size = 0;
    }

    public int getSize() {
        return size;
    }


    public class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
