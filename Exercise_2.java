/* Time Complexity
    push - O(n)
    Pop - O(n)
    Peek - O(n)

    Since we have to traverse till the end of the LinkedList
*/

/* Space Complexity
    O(n) -> Number of elements in the LinkedList
*/

class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    {
        return root == null;
    } 
  
    public void push(int data) 
    {
        StackNode newNode = new StackNode(data);

        if(root == null) {
            root = newNode;
        } else {
            StackNode tempStackNode = root;

            while(tempStackNode.next != null) {
                tempStackNode = tempStackNode.next;
            }

            tempStackNode.next = newNode;
        }
    } 
  
    public int pop() 
    { 	

        if(root == null) {
            System.err.println("Stack Underflow Error: Stack is empty");
            return 0;
        }

        int data;
        StackNode tempStackNode;
        StackNode prevNode = null;

        tempStackNode = root;

        while(tempStackNode.next != null) {
            prevNode = tempStackNode;
            tempStackNode = tempStackNode.next;
        }

        data = tempStackNode.data;

        if (prevNode != null)
            prevNode.next = null;

        return data;
    } 
  
    public int peek() 
    {
        if(root == null) {
            System.err.println("Stack Underflow Error: Stack is empty");
            return 0;
        }

        StackNode tempStackNode = root;

        while(tempStackNode.next != null) {
            tempStackNode = tempStackNode.next;
        }

        return tempStackNode.data;
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
