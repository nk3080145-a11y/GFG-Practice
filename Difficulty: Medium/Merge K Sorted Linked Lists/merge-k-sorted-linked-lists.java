class Solution {
    public static Node merge(Node h1 , Node h2){
        Node t1 = h1;
        Node t2 = h2;
        Node dummy = new Node(-1);
        Node temp = dummy;
        while(t1!=null && t2!=null){
            if(t1.data<t2.data){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }
            else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if(t1==null){
            temp.next = t2;
        }
        else{
            temp.next = t1;
        }
        return dummy.next;
    }
    Node mergeKLists(Node[] arr) {
        if(arr.length==0) return null;
        ArrayList<Node> list = new ArrayList<>();
        for(Node node : arr){
            list.add(node);
        }
        while(list.size()>1){
            int n = list.size();
            Node h1 = list.get(n-1);
            Node h2 = list.get(n-2);
            list.remove(n-1);
            list.remove(n-2);
            list.add(merge(h1,h2));
        }
        return list.get(0);
    }
}