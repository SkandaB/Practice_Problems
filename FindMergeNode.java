/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

// Complete this function
// Do not write the main method. 

int FindMergeNode(Node headA, Node headB) {
    int merging_node=0;
    HashSet<Node> node_hs = new HashSet<>();
    while(headA!=null){
        node_hs.add(headA);
        headA = headA.next;
    }
    while(headB!=null){
        if(node_hs.contains(headB)) {
            merging_node=headB.data;
            break;            
        }
        headB = headB.next;
    }
return merging_node;
}
