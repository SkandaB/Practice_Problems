/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void BinaryTree_TopView(Node root)
{
    Node curr_node = root;
    Stack<Node> node_stack = new Stack<Node>();
    while(curr_node!=null) {
        node_stack.push(curr_node);
        curr_node = curr_node.left;
    }
    
    while(!node_stack.isEmpty()) {
        System.out.print(node_stack.pop().data +" ");
    }
    
    curr_node = root.right;
    while(curr_node!=null) {
        System.out.print(curr_node.data+" ");
        curr_node = curr_node.right;
    }
}
