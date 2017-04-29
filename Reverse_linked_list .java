/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/

Node Reverse(Node head) {
    if(head == null) return null;                   // If original list is null, return null
    if(head.next==null) return head;                // If it is the only element, return itself
    Node dummy = head.next;                         // Create a new Node to refer to curr.next
    head.next=null;                                 // Set curr_node next to null
    Node new_head = Reverse(dummy);                 // Recursively call reverse on this new 
    dummy.next = head;                              // Link back the dummy node to curr (dummy.next=curr)
    return new_head;                                // Return the new head
}
