//time complexity : push,pop,peek -> O(1)
//space complexity : O(n), n is max size of linkedList
//Approach : I will take an empty singly linkedlist and root pointing to the top of a stack.
//          For push op, i'll insert new element before root and make it as new root. For pop op, i'll remove element pointing at root and increment root to next pointer index
//          for peek op,i'll return data in root

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
        return (root == null);
    } 
  
    public void push(int data) 
    { 
        if(root == null){
            root = new StackNode(data);
        }else{
            StackNode temp = new StackNode(data);
            temp.next = root;
            root = temp;
        }
    } 
  
    public int pop() 
    { 	
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        int poppedElement = root.data;
        root = root.next;
        return poppedElement;
    } 
  
    public int peek() 
    { 
        if(root == null)
            return 0;
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
