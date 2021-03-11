/*Time Complexity: The overall time complexity is O(1) for all he operations
push() operation : inserting the item into the top of the stack(i.e at the head of linkedlist) takes O(1) time.
pop() operation : Checking for underflow and returning the poped item from stack(i.e at the head of linkedlist) takes O(1) time.
peek() operation :  looking and getting the top element from stack(i.e at the head of linkedlist) takes O(1) time.
hemce the overall time complexity is O(1).
Space Complexity :  LinkedList is used to represent the items in the stack and if there are n items that needs to be processed(push,pop or peek) in the
stack then at maximum all n items will be either pushed, poped or peeked. Hence, the space complexity is O(n).

Did this code successfully run on Leetcode :
I could'nt find this problem in leetcode hence I executed in an IDE. At first when I ran this code I got error class for main not declared,
then I include the public specifier for the constructor after which it successfully executed.

Any problem you faced while coding this :
I had difficulity in figuring out that all the items should be inserted and deleted at the head but was inserting and deleting at the tail which could
cause O(n) complexity.
*/
//Your code here along with comments explaining your approach
public class StackAsLinkedList {
    StackNode root;
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data = data;
        } 
    }  

    public boolean isEmpty() 
    {
        //Write your code here for the condition if stack is empty.
        if(root == null)
            return true;
        else
            return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        else{
            StackNode cur = root;
            int popped_item = cur.data;
            root = cur.next;
            //Also return the popped element
            return popped_item;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.print("Stack is empty");
            return 0;
        }
        return root.data;
    } 
  
	//Driver code
    class Main {
        public static void main(String[] args) {

            StackAsLinkedList sll = new StackAsLinkedList();

            sll.push(10);
            sll.push(20);
            sll.push(30);

            System.out.println(sll.pop() + " popped from stack");

            System.out.println("Top element is " + sll.peek());
        }
    }
} 
