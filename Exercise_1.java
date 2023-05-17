class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
  //Time complexity=O(1)  Space complexity=O(n)
  
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
 
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top==-1){
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top=-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        
        if(top==a.length-1){
            System.out.println("Stack overflow");
            return false;
        }
        //Write your code here
        top=top+1;
        a[top]=x;
         System.out.println("element pushed");
         return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        
        //Write your code here
        
        int temp=a[top];
        a[top--]=0;
        return temp;
        
    } 
  
    int peek() 
    { 
        //Write your code here
        int kk;
        kk= a[top];
        return kk;
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
        System.out.println(s.peek() + " peek value"); 

        
    } 
}
