/**
 * @author Deepak J
 *
 */
class Stack
{
	static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 

	boolean isEmpty()
	{
		return (top < 0);
	}

	Stack()
	{
		top = -1;
	}

	boolean push(int x)
	{
		boolean isPushed = false;
		if (top >= (MAX - 1))
		{
			System.out.println("Stack Overflow! Can not push " + x
					+ " in stack");
		}
		else
		{
			top++;
			a[top] = x;
			isPushed = true;
			System.out.println(x + " pushed in stack!");
		}
		return isPushed;
	}

	int pop()
	{
		int poppedElement = 0;
		if (isEmpty())
		{
			System.out.println("Stack Underflow!");
		}
		else
		{
			poppedElement = a[top];
			top--;
		}
		return poppedElement;
	}

	int peek()
	{
		return a[top];
	}
}

// Driver code
class Main
{
	public static void main(String args[])
	{
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + " Popped from stack");
	}
}
