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
	public void append(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = new Node(data);
			return;
		}
		newNode.next = null;
		
		Node last = head;
		while(last.next != null)
			last = last.next;
		last.next = newNode;
		return;
	}
	
	public void insert(Node prevNode,int data) {
		
		if (prevNode == null) {
			System.out.print("The previous node cannot be null");
			return;
		}
		Node newNode = new Node(data);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
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
		
		list.append(56);
	    list.append(70);
	    list.insert(list.head,30);
	    
		
		list.printList();
		
	}
}
