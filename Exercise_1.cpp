// Time Complexity : 0(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No problem, just making sure edge cases are handled
#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() {
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
    if(top >= MAX) return false;
    top++;
    a[top] = x;
    return true;
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    if(top < 0) return -1;
    top--;
    //since top is decreased, 
    //in order to access the popped element, +1 since it was the element at the top earlier
    return a[top+1];
} 

int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if(top == -1) return -1;
    return a[top];
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
    if(top < 0) return true;
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
