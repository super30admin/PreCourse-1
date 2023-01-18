class Stack {
	
	

    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    //Time complexity : O(n)
    //Space complexity : O(n)
    // PRoblem : Complexity analysis


    static final int MAX = 1000;

    int a[] = new int[MAX];
    int top = -1 ;

    boolean isEmpty()
    {
        //Write your code here
        return top == -1 ;
    }

    Stack()
    {
        this.a = new int[MAX] ;
    }
    Stack(int size)
    {
        this.a = new int[size] ;
        //Initialize your constructor
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if(top == a.length -1){
            System.out.println("Stack is full");
            return false ;
        }
        top ++ ;
        a[top] = x ;
        return true ;
    }

    int pop() throws Exception
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            throw new Exception("Stack empty. Can not pop from stack");
        }
            int removedItem = a[top] ;
        top -- ;
        return removedItem ;
    }

    int peek() throws Exception
    {
        //Write your code here
        if(isEmpty()){
            throw new Exception("Stack empty. Can not peek from empty stack");
        }
        return a[top] ;
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
