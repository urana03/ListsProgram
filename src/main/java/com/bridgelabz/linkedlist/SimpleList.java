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
	static void append(int data) {
		
	             Node newNode = new Node(data);
		         
	             newNode.next = head;
	             head = newNode;
	
	}
	
  public boolean search(Node head,int x) {
		
		      Node current = head;
	           while(current != null) {
			    if(current.data == x) 
				   return true;
				   current = current.next ;
			   }
			   return false; 
		}
	
	public void insertAfter(Node prevNode, int data)
	{
	
		if (prevNode == null) {
	      
			System.out.println("The given previous node cannot be null");
	        return;
	      }
		 
		Node newNode = new Node(data);

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
		list.append(30);
		list.append(70);
		
		if(list.search(list.head,30)==true) {
			list.insertAfter(list.head,40);
		}
		else {
			System.out.print("No where to insert");
		}
		
		list.printList();
	}
}
