class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return top < 0;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top+1 == MAX){
            System.out.println(" Stack Overflow");
          return false;
        }
        else {
          a[top+1] = x;
          top++;
          return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
          System.out.print(" Stack Underflow "); 
          return 0;
        }
        else {
          top--;
          return a[top+1];
        }

    } 
  
    int peek() 
    { 
        //Write your code here      
        if(!isEmpty())
            return a[top];
        else{
            System.out.println(" Stack is Empty ");
            return 0;
        }
        
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
     /*    System.out.println(s.isEmpty()+" isEmpty"); 
        System.out.println(s.peek()+" Peeked from stack ");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek()+" Peeked from stack "); 
        System.out.println(s.pop() + " Popped from stack");
        
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Popped from stack");

        for(int i=0;i<1010;i++){
            s.push(100);
        } */
        
    } 
}
