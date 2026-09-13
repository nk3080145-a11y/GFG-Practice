class Solution {
    Node removeDuplicates(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!=null){
            if(slow.data == fast.data) fast = fast.next;
            else{
                slow.next = fast;
                fast.prev = slow;
                slow = fast;
            }
        }
        slow.next = fast;
        return head;
    }
}