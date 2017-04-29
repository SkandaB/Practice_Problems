/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
// This is a "method-only" submission. 
// You only need to complete this method. 

Node Insert(Node head,int data) {
    Node original_head = head;
    
    if(head==null) {
        head.data = data;
        head.next=null;
        original_head = head;
    } else {
        while(head.next!=null) head=head.next;
        Node add_node = new Node();
        head.next = add_node;
        add_node.data = data;
        add_node.next = null;
    }
    
    return original_head;
}
