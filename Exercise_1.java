class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    public boolean isEmpty() 
    { 
       if (top==-1){
         return true;
       } return false;
       //Write your code here 
       } 

     Stack() 
    { 
        //Last in first out
         top = -1;
        
//Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if (top== MAX -1)
            return false;
//Write your code here
        else{ 
            top = top+1;
            a[top]=x;
            return true;
        }
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top==-1){
             System.out.println("Stack Underflow");
            return 0;
           
        }
        else{
            while (top>=0)
            return a[top];
            top--;
             
        }
        return 0;
            
    } 
  
    int peek() 
    { 
        return a[top];//Write your code here
    } 

  
// Driver code 
//class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 

}
//}
