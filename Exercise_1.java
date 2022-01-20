/**
// Time Complexity :
push - O(1)
pop - O(1)
peek - O(1)

// Space Complexity :
Total space complexity = Auxilary space + space used towards input.
O(n) - where n is the length of an array.

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
**/

class Stack { 
    
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    
    Stack() 
    { 
        top = -1;
    } 
  
    boolean isEmpty() 
    { 
        return top == -1;
    } 
    
    boolean isFull()
    {
        return (top+1) == MAX;
    }

    boolean push(int x) 
    { 
        if (isFull())
        {
            System.out.println("Stack is full. Cannnot be inserted further elements.");
            return false;
        }
        
        a[++top] = x;
        return true;
    } 
  
    int pop() 
    { 
        if (isEmpty())
        {
            System.out.println("Stack is empty. No elements found for pop peration.");
            return 0;
        }
        
        return a[top--];
    } 
  
    int peek() 
    { 
        if (isEmpty())
        {
            System.out.println("Stack is empty. No elements found for peek peration.");
            // TODO : Wouldn't it better to return -1 instead of 0. Ideal approach is t throw an exception and 
            // let consumer of peek function to decide the further operation.
            return 0;
        }
        
        return a[top];
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
        s.push(40);
    } 
}