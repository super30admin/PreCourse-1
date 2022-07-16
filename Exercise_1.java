//Exercise_1 : Implement Stack using Array.

// Time Complexity : O(1) since we have not used any loop to traverse the array

// Space Complexity : O(n)

// Your code here along with comments explaining your approach
//Stack operating as LIFO(last in first out), so set a pointer top to -1 to know the array index, 
//add the elements of the stack by incrementing the variable top while pushing the element to stack
//store the element to pop in a new variable and decrement the top while popping the element from stack
//to check is empty if the top is less than 0 then stack is empty
//for peek return the top most / last element of the array

class Exercise_1 { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
    	if (top == -1) {
            return true;
        }
        else
            return false;
    } 

    Exercise_1() 
    { 
        //Initialize your constructor 
    	top =-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(top>=MAX-1) {
    		return false;
    	}
    	
    	top++;
		a[top]=x;
		return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(top!=-1) {
    		int res = a[top];
    		top--;
    	return res;
    	
    	}
    	return 0;
    } 
  
    int peek() 
    { 
        //Write your code here
    	if(top!=-1) {
    	return a[top];
    	}
    	return 0;
    } 

  
// Driver code 

    public static void main(String args[]) 
    { 
    	Exercise_1 s = new Exercise_1(); 
        s.push(10);
        s.push(20); 
        //s.push(30); 
     //  s.peek();
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
