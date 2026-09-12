class Solution {
    public void printList(Node head) {
        Node temp = head;
        System.out.print(temp.data + " ");
        temp = temp.next;
        while(temp!= head){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}