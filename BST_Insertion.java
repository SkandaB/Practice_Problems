 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node BST_Insertion(Node root,int value) {
    if (root == null) {
        root = new Node();
        root.data = value;
        root.right = root.left = null;
        return root;
    }
    else if(value < root.data) {
        root.left = Insert(root.left, value);
    }
    else {
        root.right = Insert(root.right, value);
    }
    return root;
}
