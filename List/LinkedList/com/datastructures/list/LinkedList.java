/*
This is my first linkedlist program
*/
package com.datastructures.list;

public class LinkedList {

	Node head;

	class Node {

		int data;
		Node next;

		Node(int data) {
			super();
			this.data = data;
			next = null;
		}

	}

	public LinkedList push(int input) {

		Node newNode = new Node(input);

		if (head == null) {
			this.head = newNode;
			return this;
		}

		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;

		return this;
	}

	public LinkedList print() {

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " - >");
			temp = temp.next;

		}
		System.out.print(" null");
		System.out.println();
		return this;
	}

	public LinkedList remove(int d) {

		Node temp = head, prev = null;

		if (head.data == d) {
			head = head.next;
		}

		while (temp != null && temp.data == d) {
			prev = temp;
			temp = temp.next;
		}

		prev.next = temp.next;
		return this;
	}

	public LinkedList removeAtPosition(int d) {

		Node temp = head;

		if (head.data == 0) {
			head = head.next;
		}

		for (int i = 0; i < d - 1 && temp != null; i++) {
			temp = temp.next;
		}

		if (temp.next == null || temp == null)
			return this;

		Node newNext = temp.next.next;

		temp.next = newNext;

		return this;
	}

	public LinkedList reverse() {

		return this;
	}

	public boolean search(int d) {

		Node temp = head;

		while (temp != null) {

			if (temp.data == d) {
				return true;
			}

			temp = temp.next;

		}

		return false;
	}

	public boolean interativeSearch(Node node, int d) {

		Node temp = node;

		if (temp != null) {

			if (temp.data == d) {
				return true;
			} else {
				return interativeSearch(temp.next, d);
			}
		} else {
			return false;
		}

	}

	public LinkedList removeElementPositionFromLast(int d) {
		Node temp = head;
		int counter = 0;

		while (temp != null) {
			counter += 1;
			temp = temp.next;
		}

		removeAtPosition(counter - d + 1);

		return this;
	}



	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();

		linkedList.push(1).push(2).push(9).push(3).push(4).push(1).print();

		System.out.println();

		linkedList.removeAtPosition(2).print();

		System.out.println(linkedList.search(44));

		System.out.println(linkedList.interativeSearch(linkedList.head, 1));

		linkedList.removeElementPositionFromLast(3);

		System.out.println();

		linkedList.print();
		
		

	}
}
