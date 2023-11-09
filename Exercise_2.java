// Time Complexity : O(n)
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
        //Write your code here for the condition if stack is empty.
        if(root == null){
            return true;
        }else{
            return false;
        }
    } 
  
    public void push(int data) 
    {
        StackNode newNode = new StackNode(data);
        if(isEmpty()){
            root = newNode;
        }else{
            StackNode tempNode = root;
            while ( tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
    } 
  
    public int pop() 
    {
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            if( root.next == null){
                StackNode tempNode = root;
                root = null;
                return  tempNode.data;
            }else{
                StackNode tempNode = root;
                while ( tempNode.next.next != null){
                    tempNode = tempNode.next;
                }
                StackNode deletedNode = tempNode.next;
                tempNode.next = null;
                return  deletedNode.data;
            }
        }
    } 
  
    public int peek() 
    {
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            StackNode tempNode = root;
            while ( tempNode.next != null){
                tempNode = tempNode.next;
            }
            return  tempNode.data;
        }
    } 
  

}

// Driver code
public class Exercise_2 {

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
