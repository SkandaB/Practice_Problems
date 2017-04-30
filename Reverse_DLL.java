/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse_DLL(Node head) {
    if(head==null || head.next==null) return head;
    
    Node curr,dummy;
    dummy = null;
    curr = head;
    
    while(curr!=null) {
        dummy = curr.prev;
        curr.prev = curr.next;
        curr.next = dummy;
        curr = curr.prev;
    }
    
    if(dummy!=null) {
        head = dummy.prev;
    }
    return head;
}
