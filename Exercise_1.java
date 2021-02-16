class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(root==null){
            return true;
        }else {
            return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        StackNode newtop =new StackNode(data);
        if(top==null){
            root = newtop;
            top=root;
        }
        else
        {
            top.next=newtop;
            top=newtop;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            StackNode temp=this.root;

            while(temp.next!=top){
                temp=temp.next;
            }
            int val =temp.next.data;
            temp.next = null;
            top=temp;
            return val;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        return top.data;
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
