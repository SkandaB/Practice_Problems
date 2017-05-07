/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/
void tree_postOrderTraversal(Node root) {
    if(root == null) 
        return;
    else {
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

}
