//Time Complexity = O(1)
//Space Complexity = O(1)
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return(top == -1);
        //if top == -1 means Stack is empty no elements present in the stack 
    } 

    Stack() 
    { 
        //Initialize your constructor
        this.a = new int[MAX];
        this.top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        //similarly if want to insert the element to stack then need to update the top element 
        //
        if (top >= (MAX - 1)) {
            System.out.println("Stack if full so it Overflow");
            return false;
        }
        else {
            a[++top] = x;//Insert element to top in the stack
            System.out.println("Stack is not full,So Pushed element into the stack"+ x);
            return true;
        }
    }
  int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        //similarly if want to delete the element from the stack then need to update the top element 
        //checking stack if top is empty it should not crash the program
        if(top<0){
            System.out.println("Stack is Empty so it Underflow");
            return 0;
        }else {
            int x = a[top--];//if stack is not empty then it should delete the last element from stack
            //System.out.println("Popped Element from Stack" + x);
            return x;//it should return the deleted element from stack
        }

    } 
  
    int peek() 
    { 
        //Write your code here
        //if stack is empty 
        if(top<0){
            System.out.println("Stack is Empty so it Underflow");
            return 0;
        }else {
            return a[top];//Highest element from the stack it should return
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
    } 
}
