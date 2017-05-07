/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void HuffmanDecoding(String S ,Node root) {
    Node orig_root = root;
    StringBuilder sb = new StringBuilder();
    int current_char = 0;
    while(current_char < S.length()) {
        while(root.data=='\0') {                    // While current node does not have a valid character value
            
            if(S.charAt(current_char) == '0') {
                root=root.left;                     // traverse left if input character in string is a 0
            } else if(S.charAt(current_char)=='1') {
                root=root.right;                     // traverse right if input character in string is a 1
            } 
            if(root.left!=null || root.right!=null) {
                current_char++;                     // if not a leaf node, then increment character position and continue while loop
            }
        }
        sb.append(root.data);                       // Attach the character found at leaf node
        root = orig_root;                           // Set root to original root after decoding a character
        current_char++;
    }
    System.out.println(sb);
}
