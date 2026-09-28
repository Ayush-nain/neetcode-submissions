/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) 
    {
        Node temp=head;
        Node copy;
        while(temp!=null)
        {
            copy=new Node(temp.val);
            copy.next=temp.next;
            temp.next=copy;
            temp=temp.next.next;
        }        
        temp=head;
        while(temp!=null)
        {
            copy=temp.next;
            if (temp.random != null) 
            {
                copy.random = temp.random.next;
            }
            temp = copy.next;
        }
        Node dNode=new Node(-1);
        Node res=dNode;
        temp=head;
        while(temp!=null)
        {
            copy = temp.next;

            res.next = copy;
            res = res.next;

            temp.next = copy.next;
            temp = temp.next;
        }
        return dNode.next;
    }
}
