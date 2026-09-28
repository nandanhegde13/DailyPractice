
public class LL {

	Node head;
	public class Node{
		String data;
		Node next;
	
	public Node(String data)
	{
		this.data = data;
		this.next = null;	
	}
	
	}
	
	public void addFirst(String data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
		
	}
	
	public void addLast(String data)
	{
		Node newNode = new Node(data);
	
		if(head==null)
		{
			head=newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next!=null)
		{
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
	}
	
	
	public void printList()
	{
		if(head == null)
		{
			
		}
		
		Node currNode = head;
	while(currNode!=null)
	{
		System.out.print(currNode.data+"->");
		currNode = currNode.next;
	}
	System.out.println("Null");
	
		
	}
	
	
	public Node deleteFirst()
	{
		Node deletedNode;
		if(head==null)
		{
			System.out.println("List is empty");
		}
		
		deletedNode = head;
		head = head.next;
		head.next=null;
		
		return deletedNode;
	}
	
	
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		
		if(head.next==null)
		{
			
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next!=null)
		{
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		lastNode.next=null;
		
	}
	
	public static void main(String args[])
	{
		LL linkedList = new LL();
		linkedList.addFirst("10");
		linkedList.addFirst("20");
		linkedList.printList();
		linkedList.deleteFirst();
		linkedList.printList();
	}
	
}
