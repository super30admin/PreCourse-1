/*Time Complexity - 
  peek - O(1)
  push -  O(1)
  pop - O(1)

Space Complexity
  peek - O(1)
  push -  O(1)
  pop - O(1)*/
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top ==0){
            return true;
        }
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
      top=0;
     
    } 
  
    boolean push(int x) 
    { 
        if(top < MAX){
            top = top+1;
            a[top] = x;
            return true;
        }else{
            return false;
        }
        //Check for stack Overflow
        //Write your code here
    } 
  
    int pop() 
    { 
        if(top<=0){
            System.out.println("Stack Underflow");
            return 0;
        }
        top=top-1;
        return a[top+1];
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
