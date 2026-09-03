/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        int length = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        if(k>length) return -1;
        temp = head;
        for(int i=1;i<(length-k+1);i++){
            temp = temp.next;
        }
        return temp.data;
    }
}