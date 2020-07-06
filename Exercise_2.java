public class Exercise_2 {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        {
            this.data=data;
        }
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root==null){
            return true;
        }
        else{
            return false;
        }
    }
  
    public void push(int data) 
    {
        StackNode temp = new StackNode(data);
        if(root==null){
            root = temp;
        }else{
            StackNode temp1 = root;
            while(temp1.next!=null){
                temp1=temp1.next;
            }
            temp1.next=temp;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        StackNode temp = root;
        if(temp!=null && temp.next!=null){
            while(temp.next.next!=null){
                temp = temp.next;
            }
            StackNode popInt = temp.next;
            temp.next = null;
            return popInt.data;
        }else if(temp!=null && temp.next==null){
           int result = root.data;
           root=null;
           return result;
        }else {
            System.out.println("Stack Underflow");
            return 0;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root!=null) {
            StackNode temp1 = root;
            while (temp1.next != null) {
                temp1 = temp1.next;
            }
            return temp1.data;
        }
        else return 0;
    } 

    public void show(){
        StackNode temp = root;
        while (temp != null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
	//Driver code
    public static void main(String[] args) 
    {

        Exercise_2 sll = new Exercise_2();
  
        sll.push(10);
        sll.push(20); 
        sll.push(30);
        sll.show();
        sll.pop();
        sll.pop();
        sll.pop();

        System.out.println(sll.pop() + " empty from stack");
  
        System.out.println("Top element is " + sll.peek());
    } 
} 
