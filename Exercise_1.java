class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
     if(a.length == 0) { return false;}
        else { return true;}

        //Write your code here 
    } 

    Stack() 
    { 
         top=0;
         for(int i=0;i<MAX;i++)
         {
           a[i]=0;
         }

        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
	if(top<MAX) { a[top]=x;
        //System.out.print(a[top]);
        top++;
        return true;
        }
        else { return false;}

        //Check for stack Overflow
        //Write your code here
    } 
  
    int pop() 
    { 
        if(a.length==0) { System.out.print("Stack Overflow");
         return 0;
        }
        return a[--top];
        

        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    { 
      return a[top];
        //Write your code here
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
