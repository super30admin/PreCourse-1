// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {

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
    if (top++ < 1000)
    {
        a[top] = x;
        return true;
    }
    else return false;
} 
  
int Stack::pop() 
{ 
    int temp = -1;
    if (top >= 0)
    {
        temp = a[top];
        top--;
    }
    return temp;

} 
int Stack::peek() 
{ 
    if (top >= 0)
    {
        return a[top];
    }
    else return -1;
} 
  
bool Stack::isEmpty() 
{ 
  if (top < 0)  return true;
  else return false;
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
