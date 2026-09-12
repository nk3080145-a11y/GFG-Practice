class Solution {
    public Node reverseCircular(Node head) {
        if(head.next==null) return head;
        Node tail = head;
        while(tail.next!=head){
            tail = tail.next;
        }
        tail.next = null;
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
        head.next = tail;
        return tail;
    }
}