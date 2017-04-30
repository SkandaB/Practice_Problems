/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    Node slow = head;
    while(slow!=null && slow.next!=null && head.next.next!=null && head.next!=null) {
        slow = slow.next;
        head = head.next.next;
        if(head==slow) return true;
    }
    return false;
}
