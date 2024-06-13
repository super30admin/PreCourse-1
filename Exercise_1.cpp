// Time Complexity : O(1)
// Space Complexity : O(1) - because the stack has a fixed size of 1000
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Faced some OOP problems like I initialised top in the class itself rather than in the constructor

#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { top = -1; } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
      
}; 
  
bool Stack::push(int x) 
{ 
    //Your code here
    //Check Stack overflow as well
    if(top == MAX-1) {
        return false;
    }
    top++;
    a[top] = x;
    return true;
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well
    if(top == -1) {
        return 0;
    }
    int popElement = a[top];
    top--;
    return popElement;
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if(top == -1) {
        return 0;
    }
    return a[top];
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
    if(top == -1) {
        return true;
    }
    return false;
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
