/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

// This is a "method-only" submission. 
// You only need to complete this method. 

int GetNode_from_Tail(Node head,int n) {
    
    int total_count = -1;
    Node dummy = head;
    while(dummy!=null) {
        dummy = dummy.next;
        total_count++;
    }
    
    dummy=head;
    for(int i=0; i<total_count-n; i++) {
        dummy=dummy.next;
    }

return dummy.data;
}
