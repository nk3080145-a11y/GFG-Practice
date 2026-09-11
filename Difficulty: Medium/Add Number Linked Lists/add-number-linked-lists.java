class Solution {
    public Node trimzeros(Node head){
        while(head!=null && head.data == 0 && head.next !=null){
            head = head.next;
        }
        return head;
    }
    public Node reverse(Node head){
        if(head==null || head.next == null) return head;
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
    public Node addTwoLists(Node head1, Node head2) {
        head1 = reverse(head1);
        head2 = reverse(head2);
        Node t1 = head1;
        Node t2 = head2;
        int carry = 0;
        Node dummy = new Node(-1);
        Node t = dummy;
        int sum = -1;
        while(t1!=null || t2!=null){
            int val1 = (t1!=null) ? t1.data : 0;
            int val2 = (t2!=null) ? t2.data : 0;
            sum = val1 + val2 + carry;
            carry = sum/10;
            t.next = new Node(sum%10);
            t = t.next;
            if(t1!=null) t1 = t1.next;
            if(t2!=null) t2 = t2.next;
        }
        if(carry>0){
            t.next = new Node(carry);
        }
        dummy = dummy.next;
        return trimzeros(reverse(dummy));
    }
}