// Time Complexity : o(1) for push and pop operations.
// Space Complexity :1008 for array of size 1000,top integer 4 bytes,temp integer 4 bytes.
// Did this code successfully run on Leetcode : yes done and got output successfully.
// Any problem you faced while coding this : with the name of the constructor which is already a package.


// Your code here along with comments explaining your approach;- initially top is inizialized to -1 in Stack1 constructor indicating for push ,later respective functions are defined using array operations.
class Stack1{ 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    } 
     Stack1()
    { 
        //Initialize your constructor 
          top=-1;
         
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top<MAX){
            top=top+1;
            a[top]=x;
            return true;
        }
        else{
            return false;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack underflow");
            return 0;
            
        }
        else{
            int temp= peek();
            top=top-1;
            return temp;
        }
        
    } 
  
    int peek() 
    { 
        //Write your code here
        if(!isEmpty()){
            return a[top];
        }
    return 0;
     
    }
}
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack1 s=new Stack1();
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
  