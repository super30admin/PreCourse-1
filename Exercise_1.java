class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[];
    int index=0; 
    
    //constructor
    Stack() 
    { 
        this.top=top;
        a=new int[MAX];
    } 
    
    boolean isEmpty()
    {
        if(index==0)
        {
            return true;
        }
        return false;
    }
    
    boolean isFull()
    {
        if(index==MAX)
        {
            return true;
        }
        return false;
    }
    boolean push(int x) 
    {
        if(isFull())
        {
            return false;
        }
        a[index]=x;
        index++;
        return true;
    } 
  
    int pop() 
    { 
        if(isEmpty())
        {
           return 0;
        }
        return a[--index];
    } 
  
    int peek() 
    { 
        return a[index];
    } 
} 
  
// Driver code 
public class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
