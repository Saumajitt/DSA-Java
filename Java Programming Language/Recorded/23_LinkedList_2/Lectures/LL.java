
public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void print() {
        if(head==null){
        System.out.println("The LinkedList is empty!");
        return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void createCycle(int position){
        if(head == null){
            return;
        }

        Node temp = head;
        Node cycleNode = null;
        int count = 0;


        while(temp.next != null){
            if(count == position){
                cycleNode = temp;
            }
            temp = temp.next;
            count++;
        }

        if(cycleNode != null){
            temp.next = cycleNode;  //create the cycle
        }
    }

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) { // nomral linked list
            slow = slow.next; // +1
            fast = fast.next.next; // +2

            if (slow == fast) {
                return true; // cycle exists
            }

        }
        return false; // no cycle

    }


    public void removeCycle(){
        // detect the cycle
        Node slow = head;
        Node fast = head;
        boolean cycleExists = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycleExists = true;
                break;
            }
        }

        if(cycleExists == false){
            return;
        }
        // find the meeting point
        slow = head;
        Node prev = null;
        while(slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        //remove the cycle by making the previous node pointing to the starting node of the cycle that exists to null
        // make the prev.next = null
        prev.next = null;

    }


    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2){
        Node mergedLinkedList = new Node(-1);
        Node temp = mergedLinkedList;
        while(head1 != null && head2 != null){
            if(head1.value <= head2.value){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;

        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;

        }
        
        return mergedLinkedList.next;
    }

    public Node mergeSort(Node head){
        //base case
        if(head == null || head.next == null){
            return head;
        }
        //find mid node
        Node mid = getMid(head);

        
        //right half
        Node rightHead = mid.next;
        //left half
        mid.next = null;
        // call mergeSort on left and right halves recursively
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        //merge 
        return merge(newLeft, newRight);
    }


    public void mergeSort() {
        head = mergeSort(head);
    }


    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node midNode = slow;

        //reverse the 2nd half
        Node curr = midNode.next;
        midNode.next = null;

        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node leftHead = head;
        Node rightHead = prev;
        Node nextL,nextR;

        //alternate merge -- zigzag merge
        while(leftHead != null && rightHead != null){
            nextL = leftHead.next;
            leftHead.next = rightHead;
            nextR = rightHead.next;
            rightHead.next = nextL;

            leftHead = nextL;
            rightHead = nextR;
        }
    }











    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
