/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void Binary_Tree_inOrder(Node root) {
    if(root == null)
        return;
    else {
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
}
