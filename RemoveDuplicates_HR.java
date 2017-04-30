/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

// This is a "method-only" submission.
// You only need to complete this method. 

Node RemoveDuplicates_HR(Node head) {
    if(head == null || head.next==null) return head;
    Node dummy = head;
    while(dummy!=null && dummy.next!=null) {
        while(dummy.next!=null && dummy.data == dummy.next.data){
            dummy.next = dummy.next.next;
        }
        dummy = dummy.next;
    }
    return head;
}
