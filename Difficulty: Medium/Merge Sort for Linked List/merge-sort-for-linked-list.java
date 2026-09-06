class Solution {
    public Node merge(Node head1 , Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        Node dummy = new Node(-1);
        Node temp = dummy;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            }
            else{
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            }
        }
        if(temp1!=null){
            temp.next = temp1;
        }
        else{
            temp.next = temp2;
        }
        return dummy.next;
    }
    public Node mergeSort(Node head) {
        if(head.next==null) return head;
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        head = mergeSort(head);
        head2 = mergeSort(head2);
        return merge(head , head2);
    }
}