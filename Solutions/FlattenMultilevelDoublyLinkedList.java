/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp = head;
        while(temp != null) {
            if(temp.child != null) {
                Node next = temp.next, child = temp.child;
                while(child.next != null)
                    child = child.next;
                child.next = next;
                if(next != null)
                    next.prev = child;
                child = flatten(temp.child);
                temp.next = child;
                child.prev = temp;
                temp.child = null;
            }
            temp = temp.next;
        }
        return head;
    }
}
