class Intersect
{
	int intersectPoint(Node headA, Node headB) {
	    while(headA != null) {
	        headA.data = -(headA.data + 1);
	        headA = headA.next;
	    }
	    while(headB != null) {
	        if(headB.data < 0)
	            return -headB.data - 1;
            headB = headB.next;
	    }
	    return -1;
	}
}
