//Implementation of tree
package Trees;
//node class is a must for all trees
class node 
{
	//definition of tree
	node leftNode, rightNode; 
	int data;
	node(int value)
	{
		data = value;
		leftNode = rightNode = null;
	}
}
class height_of_tree 
{
	node rootNode;
	//method:
	int maxHeight(node node)
	{
		if (node == null)
		{
			return 0;
		}
		else {
			int leftHeight = maxHeight(node.leftNode);
			int rightHeight = maxHeight(node.rightNode);

			if (leftHeight>rightHeight) 
			{
				return (leftHeight+1);
			}
			else 
				{
				return (rightHeight+1);
				}
		}
	}
public static void main(String[] args)
{
	height_of_tree tree= new height_of_tree();
	tree.rootNode= new node(2);
	tree.rootNode.leftNode=new node(3);
	tree.rootNode.rightNode=new node(7);
	tree.rootNode.leftNode.leftNode=new node(4);
	tree.rootNode.leftNode.rightNode=new node(5);
	tree.rootNode.rightNode.leftNode=new node(6);
	tree.rootNode.rightNode.rightNode=new node(8);
	tree.rootNode.leftNode.rightNode.leftNode=new node(10);
	tree.rootNode.leftNode.rightNode.rightNode=new node(9);
	tree.rootNode.leftNode.rightNode.leftNode.leftNode=new node(13);


	System.out.println("Max height of tree is: "+tree.maxHeight(tree.rootNode));
	
}}
