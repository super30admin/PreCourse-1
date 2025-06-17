//Time Complexity: O(1) * n operations {if we consider doing n number of operations }

//Space Complexity: O(n) since the stack has size n=1000
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty()   // TC - O(1)
    { 
        if(a.length == 0) 
            {
            return true;
            }
        else 
            return false; 
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x)     // TC - O(1)
    { 
        //Check for stack Overflow
        /*
        Our stack has a size of 1000, this means for array its from 0 till 999.
        So if top = 999 or more than it would result in stack overflow
        */
        if(top<999){
            top += 1;
            a[top] = x;
            return true;
        }
        else{
            System.out.println("Stack Overflow!");
            return false;
        }  
    } 
  
    int pop() // TC - O(1)
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top<0){
            System.out.println("Stack Underflow");
            top = -1;
            return 0;   //if the stack is already empty we return 0 and print statement.
        }

        else{
        top--;  //instead of emptying the int[] array, I am just decrementing the value of top after every iteration, as new entries would be overwritten in the array.
        return a[top+1];
        }
        
    } 
  
    int peek()  // TC - O(1)
    { 
        if(top < 0)
        {
        System.out.println("Stack is empty!");
        return -1;
        }
        else
        return a[top];
    } 
} 
  
// Driver code 
class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack();
        int i = 0;
        while (i<1000){
            s.push(i);
            i++;
        }
        s.push(4);
        //s.push(20);
        //System.out.println(s.peek()); 
        /*  
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack");
        s.push(30);
        System.out.println(s.peek());*/
    } 
}
