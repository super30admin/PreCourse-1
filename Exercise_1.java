// Time Complexity : all operations are O(1)
// Space Complexity : O(1)

// Implemented as a static array. Push and pop operations are done at the end of the array.

class StackImpl { 
    static final int MAX = 1000; // Maximum size of Stack 
    int top; 
    int a[];
    int length;
  
    boolean isEmpty() 
    { 
        if(length==0)
            return true;
        return false;
    } 

    StackImpl() 
    { 
        this.length = 0;
        this.a = new int[MAX];
        this.top=-1;
    } 
  
    boolean push(int x) 
    { 
        if(length==MAX) //Check for stack Overflow
        {
            System.out.println("Stack Overflow"); 
            return false;
        }
        else
        {
            length++;
            a[length-1] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        if(this.length==0) //Check for stack Underflow
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        else
        {
            int temp = a[length-1];
            a[length-1] = 0;
            length--;
            return temp;
        }
        
    } 
  
    int peek() 
    { 
        if(length==0)
            return -1;
        return a[length-1];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        StackImpl s = new StackImpl(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
        
    } 
}