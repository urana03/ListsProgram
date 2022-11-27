package com.bridgelabz.linkedlist;

public class SimpleList {

	 static Node head;
	
	 static class Node{
		
		int data;
		Node next;
		
		Node(int data){
			
			this.data = data;
			this.next =  null;
		}
		
	}
	public void addFront(int data) {
		
		Node newNode = new Node(data);
		
		newNode.next = head;
		head = newNode;
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
		
		list.addFront(70);
		list.addFront(30);
		list.addFront(56);
		
		list.printList();
		
	}
}
