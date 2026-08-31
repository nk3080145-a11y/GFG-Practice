/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        Node temp = head;
        int size = 1;
        while(temp.next!=null){
            temp = temp.next;
            size++;
        }
        temp = head;
        for(int i=0;i<size/2;i++){
            temp = temp.next;
        }
        return temp.data;
    }
}