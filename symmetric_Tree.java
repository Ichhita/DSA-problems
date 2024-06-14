package Trees;

class Node {
 int key;
 Node left, right;
 Node(int item)
 {
     key = item;
     left = right = null;
 }
}

class symmetric_Tree {
 Node root;

 boolean isMirror(Node node1, Node node2)
 {
     // if both trees are empty, then they are mirror image
     if (node1 == null && node2 == null)
         return true;

     if (node1 != null && node2 != null
         && node1.key == node2.key)
         return (isMirror(node1.left, node2.right)
                 && isMirror(node1.right, node2.left));
     return false;
 }

 boolean isSymmetric()
 {
     // check if tree is mirror of itself
     return isMirror(root, root);
 }

 public static void main(String args[])
 {
	 symmetric_Tree tree = new symmetric_Tree();
     tree.root = new Node(1);
     tree.root.left = new Node(2);
     tree.root.right = new Node(5);
     tree.root.left.left = new Node(4);
     tree.root.left.right = new Node(4);
     tree.root.right.left = new Node(1);
     tree.root.right.right = new Node(2);
     tree.root.right.right.left= new Node(2);

     boolean output = tree.isSymmetric();
     if (output == true)
         System.out.println("Symmetric");
     else
  

    System.out.println("Not symmetric");
 }
}


