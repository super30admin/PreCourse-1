public class StackUsingLinkedList {
	StackNode top;

	static class StackNode {
		int data;
		StackNode next;
		StackNode(int data) {
		this.data = data;
		}
	}
	public boolean isEmpty() {
		if (top == null) {
			System.out.println("Stack is Empty!");
			return true;
		} else
			return false;
	}

	public void push(int data) {
		StackNode node = new StackNode(data);
		node.next = top;
		top = node;
		}
	
	public int pop() {
		if (top == null){
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int temp = top.data;
			top = top.next;
			return temp;
		}
	}

	public int peek() {
		if(!isEmpty()) {
			return top.data;
		}
		else return 0;
	}

}
  
	//Driver code
    public class MainStackUsingLinkedList {

        public static void main(String[] args) {
                StackUsingLinkedList sll = new StackUsingLinkedList();
                sll.push(10); 
                sll.push(20); 
                sll.push(30); 
                sll.push(40);
                sll.push(50);
                sll.pop();
                sll.pop();
               System.out.println(sll.pop() + " popped from stack"); 
          
                System.out.println("Top element is " + sll.peek()); 
        }
    }
    