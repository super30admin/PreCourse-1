// Time Complexity : O(1) for all operations
// Space Complexity : O(N) for storing data
// Did this code successfully run on Leetcode : NA
// Any problem you faced while coding this : None


#include <bits/stdc++.h>  
using namespace std; 
  
#define MAX 1000 
  
class Stack 
{
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack();

    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 

Stack::Stack()
{
    top = -1;
}
  
bool Stack::push(int x) 
{ 
    if (a[top] == a[MAX])
        return 0;
    a[++top] = x;
    return 1;
    
} 
  
int Stack::pop() 
{ 
    if (!isEmpty())
        return a[top--];
       
    return -1;
} 
int Stack::peek() 
{ 
    if (!isEmpty())
        return a[top];

    return -1;
} 
  
bool Stack::isEmpty() 
{ 
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
