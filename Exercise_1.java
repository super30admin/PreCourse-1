// Time Complexity : O(1)
// Space Complexity : O(n)

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;                   
    int top;                                       
    int a[] = new int[MAX]; // Maximum size of Stack  
  
    boolean isEmpty()        
    { 
        //Write your code here
        return top==-1;   // the stack is empty if top is -1             
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;   // initially the stack is empty                   
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow

        //Write your code here
        if(top==MAX-1){                    // verifying if the Stack is full              
            System.out.println("Stack Overflow!!!!");    
            return false;
        } else {                                         
            a[++top] = x;                  // inserting element into the stack
            System.out.println("Element "+ x +" pushed to Stack");
            return true;
        }

    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"

        //Write your code here
        if(isEmpty()){                                    
            System.out.println("Stack Underflow!!!!");
            return 0;  // return 0 if there are no elements in the stack
        }
        
        return a[top--];                            // returns the element being removed from the stack     
    
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty()){                              // verify if stack is empty and if true, return -1     
            return -1;
        }

        int resElem = a[top];
        return resElem;                                  // return the top most element in the stack
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
