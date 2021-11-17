import java.io.EOFException;

class Stack { 


    static final int MAX = 1000; 
    int top;
    int a[]; 

     Stack() throws EOFException 
    { 
       
        this(MAX);

    } 
    // Initilaizing the Stack constructor
    Stack(int capacity) throws EOFException 
    { 
       
        if(capacity < 1){
            throw new EOFException("Invalid Capacity");        
        }
        this.a = new int[capacity];
        // Initialize top to -1
        this.top = -1;


    } 
    // TC : O(1)   SC : O(1)
    int size(){
        return top + 1;
    }
    boolean isEmpty() 
    { 
        //Write your code here 
        return this.size() == 0;
    } 

    boolean isFull(){
        return this.size() == this.a.length;

    }
    
    // TC : O(1) Amortized  SC : O(1)
    void push(int x) throws Exception 
    { 
        //Check for stack Overflow
        //Write your code here
        if(isFull()) {
            throw new Exception("Stack Is full");
        }
        this.top++;
        this.a[this.top] = x;

    } 

    // TC : O(1)   SC : O(1)
    int pop() throws Exception 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here

        if(isEmpty()){
            
            throw new Exception("Stack Underflow");
            
        }
        int removedItem = this.a[top];
        a[top] = 0;
        top--;
        return removedItem;

    } 

    // TC : O(1)   SC : O(1)
    int peek() throws Exception 
    { 
        //Write your code here
        if(isEmpty()){
            
            throw new Exception("Stack Underflow");
        }
        int topItem = this.a[top];
        return topItem;
  
    } 
} 

public class Exercise_1{

    // Driver code 
     
        public static void main(String args[]) throws Exception 
        { 
            Stack s = new Stack(); 
            s.push(10); 
            s.push(20); 
            s.push(30); 
            s.push(50);
            
            System.out.println(s.pop() + " Popped from stack"); 
        } 

}
