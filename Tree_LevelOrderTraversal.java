   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void Tree_LevelOrderTraversal(Node root)
    {
       if(root == null) return;
       Queue<Node> node_Q = new LinkedList<Node>();
       node_Q.add(root);
       while(!node_Q.isEmpty()) {
           Node curr = node_Q.remove();
           System.out.print(curr.data+" ");
           if(curr.left!=null) node_Q.add(curr.left);
           if(curr.right!=null) node_Q.add(curr.right);
       }

    }
