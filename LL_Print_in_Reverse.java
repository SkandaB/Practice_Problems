/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

void ReversePrint(Node head) {          // Want to use a Stack. So used recurision (in-built stack)
    if(head==null) return;              // Base case. If current node is null, then go back
    else {
        ReversePrint(head.next);        // Calling the same function until last node is reached
        System.out.println(head.data);  // Print the data of nodes from last to first (Stack  pop operation)
    }

}
