class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
       return top==-1;
    } 

    Stack() 
    { 
        top =-1;
    } 
  
    boolean push(int x) 
    { 
         if(top == MAX-1) {
        	System.out.println("Stack is full");
        	return false;
        }else {
        	a[++top] = x;
        	return true;
        }
    } 
  
    int pop() 
    { 
         if(isEmpty()) {
        	System.out.println("Stack is Empty");
        	return -1;
        }else {
        	return a[top--];
        }
    } 
  
    int peek() 
    { 
        if(isEmpty()) {
        	System.out.println("Stack is Empty");
        	return -1;
        }else {
        	return a[top];
        }
    }

    @Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<top+1; i++) {
			sb.append(a[i]+ " ");
		}
		return sb.toString();
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
        s.pop();
        s.push(40);
        System.out.println(s.pop() + " Popped from stack"); 
        s.push(50);
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.toString());
    } 
}
