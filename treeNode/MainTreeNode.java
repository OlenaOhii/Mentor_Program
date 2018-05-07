package treeNode;

public class MainTreeNode {

	public static void main(String[] args) {
		TreeNode tree = new TreeNode();
		tree.insert(3, 1);
		tree.insert(2, 10);
		tree.insert(2, 2);
		tree.insert(4, 5);
		tree.insert(6, 9);
		tree.print();
		tree.remove(2);
		tree.remove(3);
		tree.print();
		System.out.println(tree.search(4));
		System.out.println();

	}

}
