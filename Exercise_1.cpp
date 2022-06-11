// #include <bits/stdc++.h> 
#include <iostream> 
  
using namespace std; 
  
#define MAX 1000 

// Time Complexity : O(1)
// Space Complexity : O(MAX)
// Did this code successfully run on Leetcode : Yes, I ran in VS
// Any problem you faced while coding this : Managing top was a little difficult for me as I was initializing it with 0

class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
public: 
    int a[MAX]; // Maximum size of Stack 

    Stack() { 
        //Constructor here
        // Initializing top with -1 to keep track of the current elements in the stack
        top = -1;
    } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    //Your code here
    //Check Stack overflow as well
    // Size limit reached
    if(top == MAX - 1) {
        cout << "Stack overflow";
        return false;
    }
    // Push at the back
    a[++top] = x;
    return true;
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    // No elements to Pop
    if(top == -1) {
        cout << "Stack underflow";
        return -1;
    }
    // Preserve element beforr popping
    int temp = a[top];
    top--;
    return temp;
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if(top == -1) {
        cout << "Stack underflow";
        return -1;
    }
    return a[top];
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
    return top == -1;
} 
  
// Driver program to test above functions 
int main() 
{ 
    class Stack s; 
    s.push(10); 
    s.push(20); 
    s.push(30); 
    cout << s.pop() << " Popped from stack\n"; 
  
    return 0; 
} 
