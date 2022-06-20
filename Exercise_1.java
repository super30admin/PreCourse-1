//Time Complexity for every operation is O(1)
//Space Complexity is O(n)
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    boolean isEmpty() 
    { 
       if(top>0){
        return false;
       }else{
        return true;
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
        if(top<MAX){
            a[top] = x;
            top++;
            return true;
        } else{
            return false;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top>0){
            top=top-1;
            return a[top];
        }else{
            System.out.println("Stack Underflow");
            return 0;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top>0){
            return a[0];
        }else{
            return -1;
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
