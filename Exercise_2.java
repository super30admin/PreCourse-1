// Time Complexity : O(n) Push and pop functions needs a traversal from start to end of the linkedlist
// Space Complexity : 0(n) Pushed fixed elements into the stack
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class StackAsLinkedList { 
  
    StackNode root;
    StackNode head;
    StackNode tail;
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;  //creates new StackNode object and assigns data passed in argument to StackNode data.
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return root==null;  //If root is null, then there is no stack. So the comparator returns true if root is null, else false
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data);
        //Write code to push data to the stack. 
        if(root == null){  // when stack is empty, assign StackNode to root
            root = newNode;     
            head = root;  //head and tail points to root initially
            tail = root;
        } else {
            tail.next = newNode;  //When stack has nodes, last element is tail. Assign newNode to tail.next
            tail = newNode;  // newNode becomes tail
            tail.next = null;  // since tail is end fo stack, tail.next points to null
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(root==null){  //If Stack is empty
            System.out.println("Stack underflow");
            return 0;
        } else{
            StackNode peekEle = new StackNode(0);  //Create a new Node called peekEle
            if(root.next == null){  //If stack has only one node, head, tail and root points to that one node
                peekEle = root;  //store the node in peekEle
                head = null;  //Stack becomes empty after removing one node. So point root, head and tail to null 
                tail = null;
                root=null;
                return peekEle.data;  // return the node data
            } else{
            while(head.next!=tail){  //when stack has more than one node, traverse head until you reach last but one node
                head = head.next;
            }
             if(head.next == tail){  // Head is at last but one node
                peekEle = tail;   // store tail into peekEle which has to be returned
                tail = head;       //point tail to head(last but one), since we are removing last node
                tail.next = null;  //point tail.next to null
                head = root;      //move head back to root, we used head just to traverse
            }
            return peekEle.data;  //return peekEle data
            }
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root==null) return 0;  //if stack is empty returns 0
        else{
            return tail.data;  //If stack has nodes, peek is the last element which is tail, return tail.data
        }
    } 
  
	
} 

class Main{
//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
        System.out.println(sll.root);
        sll.push(10); 
        sll.push(20); 
        sll.push(30);
        System.out.println(sll.isEmpty());
        System.out.println(sll.root.data);
        System.out.println(sll.pop() + " popped from stack"); 

        System.out.println("Top element is " + sll.peek()); 
    } 
}
