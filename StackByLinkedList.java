//Exercise_2

class StackUsingLinkedlist {

	private class Node {
		int data; 
		Node next; 
	}
	Node top;
	StackUsingLinkedlist()
	{
		this.top = null;
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
			System.out.println("Stack Underflow");
			return;
		}

		top = (top).next;
	}

	public void display()
	{
		if (top == null) {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		else {
			Node temp = top;
			while (temp != null) {
				System.out.printf("%d->", temp.data);
				temp = temp.next;
			}
		}
	}
}

public class StackByLinkedList {
	public static void main(String args[]){
		StackUsingLinkedlist st = new StackUsingLinkedlist();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.display();
		System.out.println("\nTop element is "+st.peek());
		st.pop();
		st.display();
		System.out.println("\nTop element is "+st.peek());
	}
}
