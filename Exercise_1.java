// time comlexity O(1), space complexity O(n)
//Basic stack operations using array: top considered as topmost elements in stack. top is intialized to -1 indicates underflow.
//push operation - top is checked wheather its equals maxSize it means overflow. If not increment the top and assign the x to ar[top]. true indicates succesfull push.
//pop operation - checked for underflow condition. If not get the ar[top] and decrement the top.
//peek operation - returns the topmost element
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
       return top == -1;

    } 

    Stack() 
    { 
        //Initialize your constructor 
        this.top = -1;
       this.a = new int[MAX];
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if (top == MAX-1){
            System.out.println("Stack Overflow");
            return false;
        }
        
        a[++top] = x;
        return true;

        //Write your code here
    } 
  
    int pop() 
    { 
       
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        //Write your code here
        int res = a[top--];
       
        return res;
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return a[top];
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
