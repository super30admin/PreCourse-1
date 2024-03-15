/*
 * TimeComplexity:
 * 1. isEmpty() - O(1)
 * 2. push() - O(n) // where n is the size of the linked list
 * 3. pop() - O(n) // where n is the size of the linked list
 * 4. peek() - O(n) // where n is the size of the linked list
 * 
 * Space Compexity: O(n)
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
        if(root == null) return true;
        return false;
    } 
  
    public void push(int data) 
    { 
        if(root == null) {
            root = new StackNode(data);
            System.out.println("Pushed " + data );
        }
        else {
            StackNode newNode = new StackNode(data);
            StackNode cur = root;
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
            System.out.println("Pushed " + data );
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode prev = null;
        StackNode cur = root;
        while(cur.next != null) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = null;
        return cur.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        StackNode cur = root;
        while(cur.next != null) {
            cur = cur.next;
        }
        return cur.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
        System.out.println("isEmpty: " + sll.isEmpty());
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
        System.out.print("isEmpty: " + sll.isEmpty());
    } 
} 
