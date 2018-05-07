package treeNode;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.awt.geom.AreaOp;

import javax.sound.midi.Soundbank;

public class TreeNode {
	public int i;
	public int value;
	public TreeNode left;
	public TreeNode right;
	public TreeNode point;
	public TreeNode root;
	
	public TreeNode() {
		
	}
	
	public TreeNode(int i, int value, TreeNode point) {
		this.i =i;
		this.value = value;
		this.point = point;
	}
	
	TreeNode search(TreeNode node, int i) {
		if (node == null || node.i == i) 
			return node;
		if (i < node.i) 
			return search(node.left, i);
		else 
			return search(node.right, i);
	}
	
	public TreeNode search(int i) {
		return search (root, i);
	}
	
	TreeNode insert(TreeNode node, TreeNode point, int i, int value) {
		if (node == null) {
			node = new TreeNode(i, value, point );
		}
		else {
			if (i<node.i) {
			node.left = insert(node.left, node, i, value );
		}
			else {
				node.right = insert(node.right, node, i, value);
			}
		}
		return node;
	}
	
	public void insert(int i, int value) {
		root = insert(root, null, i, value);
	}
	
	void replace(TreeNode a, TreeNode b) {
		if (a.point == null) {
			root = b;
		}
		else {
			if (a == a.point.left) {
				a.point.left = b;
			}
			if (b != null) {
				b.point = a.point;
			}
		}
	}
	
	
	void remove(TreeNode node, int i) {
		if (node == null) {
			return;
		}
		if (i<node.i) {
			remove(node.left, i);
		}
		else {
			if (i>node.i) {
				remove(node.right, i);
			}
			else {
				if (node.left != node.right && node.right != null) {
					TreeNode temp = node.right;
					while (temp.left != null) {
						temp = temp.left;
						node.i = temp.i;
						node.value = temp.value;
						replace(temp, temp.right);
					}
				}
					else {
						if (node.left != null) {
							replace(node, node.left);
						}
						else {
							if (node.right != null) {
								replace (node, node.right);
							}
							else {
								replace(node, null);
							}
						}
					}
				}
			}
		
		}
	public void remove(int i) {
		remove(root, i);
	}
	
	void print(TreeNode node) {
		if (node != null) {
			print(node.left);
			System.out.print(node.i + ":" + node.value + " ");
			print(node.right);
		}
	}
	
	public void print() {
		print(root);
		System.out.println();
	}
	
	
		

}
