package com.cicidi.binarySearchTree;

public class NodeUtil {
	public static boolean isBST(Node root) {
		int min = root.value;
		int max = root.value;
		return isBST(root, -100, 100);
	}

	public static boolean isBST(Node root, int min, int max) {
		if (root == null)
			return true;
		if (root.value <= min || root.value >= max) {
			return false;
		}
		return isBST(root.left, min, Math.min(root.value, max))
				&& isBST(root.right, Math.max(min, root.value), max);
	}

}
