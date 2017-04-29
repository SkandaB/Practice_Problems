/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

// This is a "method-only" submission. 
// You only need to complete this method 

int CompareLists(Node headA, Node headB) {
    if(headA == null || headB == null) return 0;
    while(headA!=null && headB!=null) {
        if(headA.data == headB.data) {
            headA = headA.next;
            headB = headB.next;
            continue;
        } else {
            return 0;
        }
    }
  if(headA!=null || headB!=null) return 0;
    return 1;
}
