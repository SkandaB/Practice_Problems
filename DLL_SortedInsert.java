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

Node DLL_SortedInsert(Node head,int data) {

        Node new_node = new Node();
        new_node.data = data;
        new_node.prev = null;
        new_node.next = null;
    
    if(head==null) {
        return new_node;
    }
    
    if(head.data > data) {
        new_node.next = head;
        head = new_node;
        return head;
    } else {
        Node dummy = head;
        while(dummy.next!=null && dummy.next.data <= data) {
            dummy = dummy.next;
        }
        if(dummy.next==null) {
            dummy.next = new_node;
            new_node.prev = dummy;
        } else {
            new_node.next = dummy.next;
            new_node.prev = dummy;
            dummy.next.prev = new_node;
            dummy.next = new_node;
        }
        return head;
    }
}
