//Time complexity:O(1)
//Space complexity:O(n)
class Stack { 
    
  
    static final int MAX = 1000; 
    int top; 
    int a[];  
    
  Stack() 
    { 
       
        this.a = new int[MAX];
        this.top=-1;
    } 
    boolean isEmpty() 
    { 
        //Write your code here 
        return (top==-1);
    } 

    
  
    boolean push(int x) 
    { 
        
       
        if(top!=MAX-1) //Checking for stack Overflow
        {
            top++;
            a[top]=x;
            return true;
        }
        else
        {
            return false;
        }
        
    } 
  
    int pop() 
    { 
        
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int returnedtop= peek();
            
            top--;
            return returnedtop;
            
        }
    } 
  
    int peek() 
    { 
        
        if(!this.isEmpty())
        {
            return a[top];
        }
        else
        {
            System.out.println("Stack is empty");
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
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        
    } 
}