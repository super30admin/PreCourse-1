class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int arr[]; 
    // = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if (top == -1){
            return true;
        }
        return false;
       
    } 

    Stack() 
    { 
        //Initialize your constructor
         arr = new int[MAX];
         top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if (top < 999){
            top += 1;
            arr[top] = x;
            return true;
        }
        else{
            System.out.println("Stack Overflow");
            return false;
        }
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int temp = arr[top];
            top -= 1;
            return temp;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        return arr[top];
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
