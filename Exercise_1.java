// Time Complexity : 
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if (top < 0) {
            return true; 
        } 
        else return false;  
    } 

    Stack() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
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
