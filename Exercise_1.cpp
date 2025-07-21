//time complexity : O(1) for all operations 
// space complexity : O(MAX) = O(1000)
#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { top = -1;} 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    if (top>= (MAX-1)){
      cout << "stack overflow\n";
  return false;
} 
a[++top] = x;
return true;
}
int Stack::pop() 
{ 
    if (top < 0) {
      cout << "stack underflow\n";
  return -1;
} 
 return a[top--];
}

int Stack::peek() 
{ 
  if (top<0){
    cout << "stack is empty\n";
  return -1;
} 
  return a[top];  
}

  
bool Stack::isEmpty() 
{ 
    return (top<0);
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