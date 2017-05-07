/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void Tree_preOrderTraversal.java(Node root) {
    if(root == null) {
        return;
    }
    else {
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
