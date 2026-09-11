class Solution {
    Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node pre = null;
        Node current = head;
        Node post = head.next;
        while(post!=null){
            current.next = pre;
            pre = current;
            current = post;
            post = post.next;
        }
        current.next = pre;
        return current;
    }
    Node reverseBetween(int a, int b, Node head) {
        Node dummy = new Node(-1);
        dummy.next = head;
        Node t = dummy;
        for(int i=1;i<a;i++){
            t = t.next;
        }
        Node tail1 = t;
        Node head2 = t.next;
        for(int i=1;i<=(b-a)+1;i++){
            t = t.next;
        }
        Node tail2 = t;
        Node head3 = t.next;
        
        tail1.next = null;
        tail2.next = null;
        
        reverse(head2);
        
        tail1.next = tail2;
        head2.next = head3;
        
        return dummy.next;
        // ArrayList<Node> arr = new ArrayList<>();
        // Node temp = head;
        // while(temp!=null){
        //     arr.add(temp);
        //     temp = temp.next;
        // }
        // int i = a-1 , j = b - 1;
        // while(i<j){
        //     Node t1 = arr.get(i);
        //     Node t2 = arr.get(j);
        //     arr.set(i,t2);
        //     arr.set(j,t1);
        //     i++;
        //     j--;
        // }
        // for(i=0;i<arr.size();i++){
        //     arr.get(i).next = (i==arr.size()-1) ? null : arr.get(i+1);
        // }
        // return arr.get(0);
        
    }
}