/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        Node pre = null;
        Node t1 = head;
        Node t2 = head.next;
        while(t2!=null){
            t1.next = pre;
            pre = t1;
            t1 = t2;
            t2 = t2.next;
        }
        t1.next = pre;
        return t1;
    }
}