// Time Complexity : O(1)
// Space Complexity : O(n)
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
        StackNode node = new StackNode(data);

        if(root == null) {
            root = node;
        } else {
            StackNode tempNode = root;
            while(tempNode != null && tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = node;
        }
    } 
  
    public int pop() 
    {
        if(root == null) {
            System.out.print("Stack Underflow");
            return 0;
        } else {
            StackNode stackNode = root;
            while(stackNode != null && stackNode.next != null && stackNode.next.next != null) {
                stackNode = stackNode.next;
            }
            if(stackNode.next != null) {
                int currentNode = stackNode.next.data;
                stackNode.next = null;
                return  currentNode;

            }
        }
        return 0;
    }
  
    public int peek() 
    { 
        StackNode stackNode = root;

        int currentdata = 0;
        while(stackNode != null ) {
            currentdata = stackNode.data;
            stackNode = stackNode.next;
        }
        return currentdata;
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
