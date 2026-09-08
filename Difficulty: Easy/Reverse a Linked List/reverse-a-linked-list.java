class Solution {
    Node reverseList(Node head) {
        // if(head.next == null) return head;
        // Node pre = null;
        // Node t1 = head;
        // Node t2 = head.next;
        // while(t2!=null){
        //     t1.next = pre;
        //     pre = t1;
        //     t1 = t2;
        //     t2 = t2.next;
        // }
        // t1.next = pre;
        // return t1;
        if(head.next==null) return head;
        Node a = head.next;
        head.next = null;
        Node b = reverseList(a);
        a.next = head;
        return b;
    }
}