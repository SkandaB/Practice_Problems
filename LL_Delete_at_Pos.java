/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
    if(position==0) {
        if(head==null || head.next==null) return null;
        return head.next;
    }
    else {
        Node start=head;
        while (position-1!=0 && head.next!=null) {
            head = head.next;
            position--;
        }
        if(head.next==null) head.next=null;
        else head.next=head.next.next;
        return start;
    }

}

