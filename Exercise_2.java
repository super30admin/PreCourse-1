
/*Time Complexity :
  All the functions will take constant amount of time O(1).
  Space complexity will be size of the stack 0(N);

*/
public class StackAsLinkedList {   
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data; 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root == null) {
        	return true;
        }
        return false;
    } 
  
  /*
  1.First will check if root is null or not . if its null create new node and make it as a root 
  2.If root is not null then i am creating a new node and adding its next to root and change root to the new node
   */
    public void push(int data) 
    { 
        //to push data to the stack. 
    	StackNode node = new StackNode(data);
    	if(root == null) {
    		root = node;
    	}
    	node.next= root;
    	root = node;
    } 

    /*
     if root is null then i am returning 0 
     or 
     return root.value and and pointing root to its next; 
   */
  
    public int pop() 
    { 	
        if(root == null) {
        	return 0;
        }
    	int result = root.data;
    	root = root.next;
    	return result;
    } 
  
  // return the topmost element without removing it.
  /*
    Return the root.value 
   */
    public int peek() 
    { 
        if(root == null) {
        	return 0;
        }
        return root.data;
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

