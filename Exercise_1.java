class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    } 

    Stack() 
    { 
        int top = -1;
    } 
  
    boolean push(int x) 
    { 

        if(top == (MAX-1)){     //As max index of array is size-1, taking that as condition for full
            return false;
        }
        else{
            top = top+1;        //incrementing the top index of array and assigning new element to its index.
            a[top] = x;         
            return true;
        }
    } 
  
    int pop() 
    { 
        int x =0;
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }
        else{
            x = a[top];     //storing the topmost elemnt to return  
            top = top-1;    //decrementing the index to pose that stack doesn't contain this element anymore.
        }
        return x;
    } 
  
    int peek() 
    { 
        int x = 0;
        if(!(isEmpty())){
            System.out.println("Stack Underflow");
            x= a[top];  //storing the topmost elemnt to return 
        }
        return x;
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

// Time Complexity : O(1) for all operations.
// Space Complexity : O(MAX)
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : Nothing
