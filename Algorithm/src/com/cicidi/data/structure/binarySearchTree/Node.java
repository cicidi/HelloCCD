package com.cicidi.data.structure.binarySearchTree;

public class Node {
	int value;
	Node left;
	Node right;

	public Node(int value) {
		this.value = value;
	}
// haha logic is right :)
	public void add(Node node) {

		if (node.value > this.value) {
			if (null == this.right) {
				this.right = node;
			} else {
				this.right.add(node);
			}
		}
		if (node.value < this.value) {
			if (null == this.left) {
				this.left = node;
			} else {
				this.right.add(node);
			}
		}
	}
}
