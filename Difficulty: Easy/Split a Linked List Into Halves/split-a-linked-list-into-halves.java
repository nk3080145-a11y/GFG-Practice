class Solution {
    public Pair<Node, Node> splitList(Node head) {
        Node t = head;
        while(t.next != head){
            t = t.next;
        }
        t.next = null;
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node b = slow.next;
        slow.next = head;
        t.next = b;
        return new Pair<>(head,b);
    }
}