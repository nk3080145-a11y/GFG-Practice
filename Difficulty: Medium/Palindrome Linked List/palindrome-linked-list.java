/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        Node temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(temp!=null){
            arr.add(temp.data);
            temp = temp.next;
        }
        int i = 0 , j = arr.size()-1;
        while(i<j){
            int a = arr.get(i) , b = arr.get(j);
            if(a!=b) return false;
            i++;
            j--;
        }
        return true;
    }
}