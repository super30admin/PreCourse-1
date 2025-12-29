// Time Complexity : o(1)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : N/A it is not a leetcode problem
// Any problem you faced while coding this :No
// Your code here along with comments explaining your approach
// steps to implement stack using array
// 1. create a class stack with max size
// 2. create an array to hold stack elements and a variable top to track the top element index
// 3. implement isEmpty method to check if top is -1
// 4. implement push method to add element to stack and check for overflow
// 5. implement pop method to remove and return top element and check for underflow
// 6. implement peek method to return top element without removing it


class Stack { 
    
    int top; 
    int[] a; 
    private int capacity =1000;// Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top == -1){
            return true;
        }
        return false;
    } 

    public Stack(int capacity) 
    { 
        //Initialize your constructor 
        a = new int[capacity];
        top = -1;
    } 
  
    

    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top == capacity -1){
            return false;
        }
        a[++top] =x;
        System.out.println("Pushed into the stack");
        return true;
    } 
  
    int pop() 
    { 
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return a[top--];
    } 
  
    int peek() 
    { 
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(10000); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
