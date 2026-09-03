/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node deleteMid(Node head) {
       if(head.next==null) return null;
       if(head.next.next==null){
           head.next = null;
           return head;
       }
       Node f = head;
       Node s = head;
       while(f.next!=null && f.next.next!=null){
           f = f.next.next;
           s = s.next;
       }
       if(f.next!=null){
           s.next = s.next.next;
           return head;
       }
       Node temp = head;
       while(temp.next!=s){
           temp = temp.next;
       }
       temp.next = s.next;
       return head;
    }
}