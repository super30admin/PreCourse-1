class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 

    // time complexity O(1)
    boolean isEmpty() 
    { 
        //Write your code here 
        if(this.top == -1){
            return true;
        }
        else{
            return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor 
        this.top = -1;
    } 
    // time complexity O(1)
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(this.top+1 == MAX){
            return false;
        }
        else{
            this.top++;
            this.a[this.top] = x;
            return true;
        }
    } 
    // time complexity O(1)
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(this.top == -1){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return this.a[this.top--];
        }
    } 
    // Time complexity O(1)
    int peek() 
    { 
        //Write your code here
        // popping and pushing for peek
        int top_value = this.pop();
        if(top_value == 0){
            return 0;
        }
        this.push(top_value);
        return top_value;
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
