/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
// This is a "method-only" submission. 
// You only need to complete this method. 

Node InsertNth(Node head, int data, int position) {
    Node new_node = new Node();
    new_node.data = data;
    
    Node pre_head = new Node();
    pre_head.next = head;
    
    if(position==0) {
        new_node.next=head;
        return new_node;
    }
    
    while(position!=0) {
        pre_head = pre_head.next;
        position--;
    }
    
    new_node.next = pre_head.next;
    pre_head.next = new_node;
    return head;
    
}
