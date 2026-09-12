class Solution {
    Node deleteNode(Node head, int key) {
        Node tail = head;
        while(tail.next!=head) tail = tail.next;
        tail.next = null;
        if(head.data == key){
            head = head.next;
            tail.next = head;
            return head;
        }
        Node t1 = head;
        Node t2 = head.next;
        while(t2!=null){
            if(t2.data == key){
                t1.next = t2.next;
                break;
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        if(tail.data == key){
            t1.next = head;
        }else{
            tail.next = head;
        }
        return head;
    }
}