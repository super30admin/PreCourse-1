// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No

#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    // Initializing top variable in constructor
    Stack() { top = -1; } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    // Checking Stack overflow before pushing
    if(top != MAX - 1) {
        a[++top] = x;
        return true;
    }
    else {
        top = -1;
        return false;
    }
} 
  
int Stack::pop() 
{ 
    // Checking Stack Underflow before poping
    // Return -1 for error
    if(top != -1) return a[top--];
    else return -1;
} 

int Stack::peek() 
{ 
    // Returning the top value if not empty
    // Return -1 for error
    if(top != -1) return a[top];
    else return -1;
} 
  
bool Stack::isEmpty() 
{
    return (top == -1);
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
