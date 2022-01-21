/**
 * Author: Amish Papneja
 * Time Complexity: O(1) for all operations
 * Space Complexity: O(1) because this implementation has a fixed maximum size of the stack
 * Leetcode run: NA
 * Problems Faced: None
 *
 */
class Stack {
    static final int MAX = 1000;
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty(){
        if(this.top == -1) return true;
        else return false;
    } 

    Stack(){
        this.top = -1;
    } 
  
    boolean push(int x){
        if(this.top < MAX){
            a[++this.top] = x;
            return true;
        }
        else return false;
    } 
  
    int pop(){
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return a[this.top--];
        }
    } 
  
    int peek() {
        return a[this.top];
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


        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek());

    } 
}
