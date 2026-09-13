class Solution {
    public int length(Node head){
        if(head==null) return 0;
        Node temp = head;
        int count = 0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public Node rotateDLL(Node head, int k) {
        int n = length(head);
        if(k==n || head.next == null) return head;
        k = k%n;
        Node fast = head;
        Node slow = head;
        for(int i=1;i<k;i++){
            slow = slow.next;
        }
        Node a = slow.next;
        Node t = a;
        slow.next = null;
        a.prev = null;
        while(t.next!=null){
            t = t.next;
        }
        t.next = head;
        head.prev = t;
        return a;
    }
}