class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == -1;
    } 

    Stack() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
		if(top < 1000){
			a[++top] = x;
			return true;
		}else{
			return false;
		}

    } 
  
    int pop() 
    { 
    	if(top <0) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}else{
			return a[top--];
    	}
    } 
  
    int peek() 
    { 
        if(top >=0) {
			return a[top];
        }else {
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
        s.push(0); 
        System.out.println(s.peek() + " peek from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        s.push(100); 
        System.out.println(s.peek() + " peek from stack");
    } 
}
