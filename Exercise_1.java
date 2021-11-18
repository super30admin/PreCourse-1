 // Time Complexity : O(1) We aren't iterating over the array and just using the top variable for most of the operations thus it is done in constant time; 

// Space Complexity : O(n) (as we are storing all the stack values in an array)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : I was having trouble understanding what I should add in the construcutor. The only thing that I felt like I should initialize in the constructor was the top variable; 


// Your code here along with comments explaining your approach

 
 
 
 class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top == -1){  /// We are checking if the top is -1 which means there is no element in the stack
            return true;          
        }else{
            return false; 
        }
        
    }
    

    Stack() 
    { 
        //Initialize your constructor
        this.top = -1 ;  
      
    } 
  
    boolean push(int x) 
    {  //Write your code here
         //Check for stack Overflow
         if(top == a.length -1){
             return false;
         }else{
            top++;
             a[top] =x ;
             
             return true;
         }
        
       
     
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0 ; 
        }
        //Write your code here
        else{ 
           int topValue = a[top];
           top--;
           return topValue;
            

        }
       
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top == -1){
            return -1;
        }
        return a[top]; 
       
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(30); 
        s.push(40);
        System.out.println(s.peek());
        System.out.println(s.pop() + " Popped from stack"); 
        //System.out.println(s.peek());
        
    } 
}
