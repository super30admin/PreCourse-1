class StackUsingLinkedlist {
	Node top= null;
	
	public class Node {

		int data; 
		Node next; 
	}
	
	
	public void push(int x) 
	{
		Node temp = new Node();
		temp.data = x;
		temp.next = top;
		top = temp;
	}

	
	public boolean isEmpty()
	{
		return top == null;
	}

	
	public int peek()
	{
		if (!isEmpty()) {
			return top.data;
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	
	public void pop() 
	{
		
		if (top == null) {
			System.out.print("\nStack Underflow");
			return;
		}

		top = (top).next;
	}

	public void display()
	{
		
		if (top == null) {
			System.out.printf("\nStack Underflow");
			
		}
		else {
			Node temp = top;
			while (temp != null) {
				System.out.printf("%d->", temp.data);
				temp = temp.next;
			}
		}
	}


	public static void main(String[] args)
	{
		
		StackUsingLinkedlist obj = new StackUsingLinkedlist();
		obj.push(11);
		obj.push(22);
		obj.push(33);
		obj.push(44);
		obj.display();
		System.out.printf("\nTop element is %d\n", obj.peek());
		obj.pop();
		obj.pop();
		System.out.printf("After removing two nodes\n");
		obj.display();
		System.out.printf("\nTop element is %d\n", obj.peek());
	}
}

