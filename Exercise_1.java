class Stack { 

    
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; 
  
    //Time Complexity for empty stack: O(1)
    //Space Complexity: O(1)
    boolean isEmpty() 
    {       
        return a.length==0;
    } 

    Stack() 
    { 
        
        top = 0;

    } 
    
    //Time Complexity to push an element: O(1)
    //Space Complexity to push an element: O()
    boolean push(int x) 
    { 
        
        if(top>=MAX)
        {
            return false;
        }
        a[top]=x;
        top++;
        return true;
        


    } 
  
    //Time Complexity to pop an element: O(1)
    //Space Complexity to pop an element: O(1)
    int pop() 
    { 
        
        if(top==0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            top--;
            return a[top];
            
        }
    } 
    
    //Time Complexity to peek an element: O(1)
    //Space Complexity to peek an element: O(1)
    int peek() 
    { 
        
        return a[top];
    } 
} 
  
 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(" Is stack empty? "+ s.isEmpty());
    } 
}
