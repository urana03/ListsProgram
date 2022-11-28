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
	static Node addNode(Node headRef,int data) {
		
		Node newNode = new Node(data);	
		newNode.data = data;
		newNode.next = (headRef);
		(headRef) = newNode;
		return headRef;
	
	}
	
	static Node removeFirstNode(Node head) {
		
		if (head == null)
			return null;
		
		Node temp = head;
		head = head.next;
		return head;
	}
	
	public static void main(String args[]) {
	
		Node head = null;
		
		head = addNode(head,70);
		head = addNode(head,30);
		head = addNode(head,56);
		
		head = removeFirstNode(head);
		
		for(Node temp = head; temp != null; temp=temp.next)
			System.out.print(temp.data+" ");
		
		
	}
}
