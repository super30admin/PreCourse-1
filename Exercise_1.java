class Stack { 
//Time Complexity: O(1)
//Space complexity: O(n)

	static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
		return top==-1;
    } 

    Stack() 
    { 
        //Initialize your constructor
		this.top=-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
		if(top==999){
            return false;
        }else{
            top++;
            a[top]=x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
		if(isEmpty()){
			System.out.println("Stack Underflow");
            return 0;
        }
        int r=a[top];
        top--;
        return r;
    } 
  
    int peek() 
    { 
        //Write your code here
		if(isEmpty())
            return -1;	
        return a[top];
	} 
  
// Driver code 

    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
		System.out.println(s.peek());
        System.out.println(s.pop());
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
		System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.push(40));
        System.out.println(s.push(50));
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
    } 
}
