import StackAsLinkedList.StackNode;

public class StackAsLinkedList
{

	StackNode	root;

	static class StackNode
	{
		int			data;
		StackNode	next;

		StackNode(int data)
		{
			this.data = data;
		}
	}

	public boolean isEmpty()
	{
		return (root == null);
	}

	public void push(int data)
	{
		StackNode newNode = new StackNode(data);
		if (isEmpty())
		{
			root = newNode;
		}
		else
		{
			StackNode tempNode = root;
			root = newNode;
			newNode.next = tempNode;
		}
		System.out.println(data + " pushed in stack!");
	}

	public int pop()
	{
		int poppedElement = 0;
		if (isEmpty())
		{
			System.out.println("Stack Underflow!");
		}
		else
		{
			poppedElement = root.data;
			root = root.next;
		}
		return poppedElement;
	}

	public int peek()
	{
		return isEmpty() ? 0 : root.data;
	}

	// Driver code
	public static void main(String[] args)
	{

		StackAsLinkedList sll = new StackAsLinkedList();

		sll.push(10);
		sll.push(20);
		sll.push(30);

		System.out.println(sll.pop() + " popped from stack");

		System.out.println("Top element is " + sll.peek());
	}
}
