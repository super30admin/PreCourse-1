// Time Complexity : O(1)
// Space Complexity : O(n)

class Stack { 
   
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX];
  
    boolean isEmpty() 
    { 
        return top < 0;
    } 
    
    /*
     *  Initialized current array with maximum size and setup top as index of array
     *  to -1  in constructor to track current element on top of stack
     */
    
    Stack() 
    { 
        this.a = new int[MAX];
        this.top = -1;
    } 
    
    /*
     *  checking if (top +1) index is less than MAX than we can add new element into stack on newly 
     *  top index , and if it is already more than MAX than it stack is overflow
     */
  
    boolean push(int x) 
    { 
        if(top+1 < MAX){
        	this.top = top +1;
            a[top] = x;
            return true;
        } else{
            System.out.println("Stack Overflow");
            return false;
        }
    } 
  
    /*
     * while removing top element from stack we check if stack is already empty or not if it is then we print error
     * if we have atleast one element in stack we get that element with help of TOP index and then return that value 
     * and we decrease TOP value by 1
     */
    
    int pop() 
    { 
       
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;  
        } else {
            int x= a[top];
            a[top] = 0;
            this.top = top -1;
            return x;
        }
    } 
    
    /*
     * in stack peek is to get first top element from stack where top index represents
     * top of stack in array. we juts get that element from array of a at index top.
     */
  
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
        System.out.println(s.peek() + " Peeked from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek() + " Peeked from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
