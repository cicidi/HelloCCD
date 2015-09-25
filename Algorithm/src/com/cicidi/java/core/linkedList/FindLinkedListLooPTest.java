package com.cicidi.java.core.linkedList;

public class FindLinkedListLooPTest {
	Node head;

	public FindLinkedListLooPTest() {
		this.head = new Node("abc");
	}

	public void appendNodeToTail(Node last) {
		Node current = head;

		while (current.next != null) {
			current = current.next;
		}
		current.next = last;

	}

	public boolean isCircle() {
		Node slow = head;
		Node fast = head;

		while (slow.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {

				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		String test = "Hello World";
		// System.out.println(reverseMultiple(test));
		FindLinkedListLooPTest fLoop = new FindLinkedListLooPTest();
		fLoop.appendNodeToTail(new Node("201"));
		Node loopNode = new Node("loop");
		fLoop.appendNodeToTail(loopNode);
		fLoop.appendNodeToTail(new Node("202"));
		fLoop.appendNodeToTail(new Node("203"));
		fLoop.appendNodeToTail(new Node("204"));
//		fLoop.appendNodeToTail(loopNode);
		System.out.println(fLoop.isCircle());

	}

	public static class Node {
		public Node next;
		public String data;

		public Node(String data) {
			this.data = data;
		}

	}

}