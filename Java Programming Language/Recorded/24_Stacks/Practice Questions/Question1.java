import java.util.*;

class Question1{
    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);
        one.next = two;
        two.next = three;
        three.next = four;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;

        boolean ans = isPalindrome(one);
        System.out.println("Palindrome: " + ans);

    }

    static boolean isPalindrome(Node head){
        Node slow = head;
        boolean isPalindrome = true;
        Stack<Integer> s = new Stack<>();

        while(slow != null){
            s.push(slow.data);
            slow = slow.next;
        }


        while(head!=null){
            int top = s.pop();
            if(head.data == top){
                isPalindrome = true;
            }else{
                isPalindrome = true;
                break;
            }
            head = head.next;
        }

        return isPalindrome;
    }




    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
}


}