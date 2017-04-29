/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

// This is a "method-only" submission. 
// You only need to complete this method 

Node MergeLists(Node headA, Node headB) {    
    
    if(headA==null && headB==null) return null;
    if(headA==null) return headB;
    if(headB==null) return headA;
	
	Node start = new Node();
	Node curr = start;
    
    while(headA!=null && headB!=null) {
        if(headA.data < headB.data) {
            curr.next = headA;
            headA = headA.next;
        } else {
            curr.next = headB;
            headB = headB.next;
        }
        curr = curr.next;
    }
    
    if(headB!=null) curr.next=headB;
    if(headA!=null) curr.next=headA;
	return start.next;
}
