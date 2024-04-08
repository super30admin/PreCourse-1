class Stack { 
   //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
  //Time=O(1)
  //Space=O(1)
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
		if (top==-1)
			return true;
		else
			return false;
    } 

    Stack() 
    { 
		top=-1;
    } 
  
    boolean push(int x) 
    { 
		top++;
		if(top!=1000) {
			a[top]=x;
			return true;
		}
		return false;
		
    } 
  
    int pop() 
    { 
		if(top==-1)
		{	
			System.out.println("Stack Underflow");
			return 0;
		}
		int value=a[top];
		top--;
		return value;
    } 
  
    int peek() 
    { 	
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
