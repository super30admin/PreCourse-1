// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : No, ran successfully on geeksforgeeks ide, ideone and codechef ide
// Any problem you faced while coding this : To check when stack is full (while pushing element)


class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        // To check if stack is empty, check if top element exists  
        // if not, then stack is empty
        if (top < 0) {   
            return true; 
        } 
        else return false;  
    } 

    Stack() 
    {  
        // Initialize class attributes, top value 
        //(top doesn't have any element)
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        // to insert/push element, check if array is full
        // if array is full return Stack is full
        // else, add element on top on stack and update top value
        if (top >= (MAX-1)) {
            System.out.println("Stack is full!");
            return false;            
        }
        else {
            a[++top] = x; 
            System.out.println("Added to stack : " +x);
            return true;
        }
    } 
  
    int pop() 
    { 
        // To pop an element, check is stack is empty, 
        // if yes return stack is empty (underflow)
        // else, return the top element and remove the top element
        if (top < 0) {
            System.out.println("Stack is empty! No element to pop!");
            return 0;
        }
        else {
            int popped = a[top--];
            return popped; 
        }
    } 
  
    int peek() 
    { 
        // To peek the top element, check is stack is empty, 
        // if yes return stack is empty (underflow)
        // else, return the top element
        if (top < 0) 
            {
            System.out.println("Stack is empty! No top element!");
            return 0;
            }
        else 
            {
            int topElement = a[top];
            System.out.println("Top element is : " +topElement);
            return topElement;
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
