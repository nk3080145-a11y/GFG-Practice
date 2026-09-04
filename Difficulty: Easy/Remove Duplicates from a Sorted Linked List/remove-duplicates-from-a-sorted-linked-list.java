/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // code here
        Node fast = head;
        Node slow = head;
        while(fast!=null){
            if(slow.data == fast.data) fast = fast.next;
            else{
                slow.next = fast;
                slow = fast;
            }
        }
        slow.next = fast;
        slow = fast;
        return head;
    }
}