package lab8;

public class Tree<T extends Comparable<T>> {
	private TreeNode<T> root;
	public Tree()
	{
		root= null;
	}
	public void insertNode(T insertValue)
	{
		if(root == null)
			root = new TreeNode<T>(insertValue);
		else
			root.insert(insertValue);
	}

}
