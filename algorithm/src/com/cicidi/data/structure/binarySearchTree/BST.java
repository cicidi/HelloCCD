package com.cicidi.data.structure.binarySearchTree;

public class BST {
	public static void main(String[] args) {
		Node node_8 = new Node(8);
		Node node_3 = new Node(3);
		Node node_10 = new Node(10);
		Node node_1 = new Node(1);

		Node node_6 = new Node(6);
		Node node_4 = new Node(4);
		Node node_7 = new Node(7);
		Node node_14 = new Node(14);
		Node node_13 = new Node(13);

		node_8.left = node_3;
		node_8.right = node_10;
		node_3.left = node_1;
		node_3.right = node_6;
		node_6.left = node_4;
		node_6.right = node_7;
		node_10.right = node_14;
		node_14.left = node_13;
		System.out.println(NodeUtil.isBST(node_8));

	}

}
