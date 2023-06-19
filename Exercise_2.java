/*
   Time Complexity
   push() operation -> O(1) Since we are inserting element at the root(head)/top of
                            linked list
   isEmpty() operation->O(1) Since we are checking only one condition there

   Space Complexity
   push() operation->O(n) since we are allocating memory to new node during push,
                          n push operations will need O(n) memory size
   Other operations->O(1) since no extra memory allocation

 */

class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            //assign data to current node object
            this.data=data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        //when head is null, then no element in stack , so check for that condition
        if(root==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        //allocate memory to new node and assign data value to the node
        StackNode newNode=new StackNode(data);

        //if element to insert is first element of stack,then it will be stored at
        // head of linked list/top of stack
        if(root==null)
        {
            root=newNode;
        }
        //since head of Linked list will be top of stack, all elements will be stored
        //after head and new element will be added at root position
        else
        {
            //store root/top in temp node
            StackNode temp=root;
            //assign new node to top/root
            root=newNode;
            //make top point to second most element from top
            root.next=temp;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(this.isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        else
        {
            //store root node in temp node
            StackNode temp=root;
            //move root pointer forward by one position.previous index will be lost
            root=root.next;
            //return the data stored in temp as popped element
            return temp.data;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        //no top element
       if(root==null)
       {
           return 0;
       }
       //return top node
       else
       {
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
