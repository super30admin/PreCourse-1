public class StackAsLinkedList {

	StackNode root;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int data) { 
			this.data = data;
			next = null;
			}
	}

	public boolean isEmpty()
	{
		if (root == null) {
			return true;
		}
		else
			return false;
	}

	public void push(int data)
	{
		StackNode newNode = new StackNode(data);

		if (root == null) {
			root = newNode;
		}
		else {
			newNode.next = root;
			root = newNode;
		}
		System.out.println(data + " pushed to stack");
	}

	public int pop()
	{
		int tmp = 0;
		if (root == null) {
			System.out.println("Stack is Empty");
			return 0;
		}
		else {
			tmp = root.data;
			root = root.next;
		}
		return tmp;
	}

	public int peek()
	{
		if (root == null) {
			System.out.println("Stack is empty");
			return 0;
		}
		else {
			return root.data;
		}
	}
	//Driver code
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
