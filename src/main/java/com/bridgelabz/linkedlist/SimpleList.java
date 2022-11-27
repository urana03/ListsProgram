package com.bridgelabz.linkedlist;

public class SimpleList {

	Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int data){
			
			this.data = data;
			this.next =  null;
		}
		
	}
	
	public void printList() {
		
		Node n = head;
		while(n != null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	
	
	public static void main(String args[]) {
	
		SimpleList list = new SimpleList();
		
		list.head = new Node(56);
		Node second = new Node(30);
		Node third = new Node(70);
		
		list.head.next = second;
		second.next = third;
		
		list.printList();
		
	}
}
