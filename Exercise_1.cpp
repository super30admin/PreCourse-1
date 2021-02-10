#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack { 
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { 
      //Constructor here 
      top = -1;
    } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 

  if(top >= MAX)
    return false;
  
  top += 1;
  a[top] = x;
  //cout<<"Push called";
  return true;
    //Your code here
    //Check Stack overflow as well
} 
  
int Stack::pop() 
{ 
  if(top < 0)
    return 0;
  
  int popval = a[top];
  top = top-1;
  //cout<<"Pop called";
  return popval;
    //Your code here
    //Check Stack Underflow as well 
} 
int Stack::peek() 
{ 
  if(top < 0) return 0;

  return a[top];
    //Your code here
    //Check empty condition too
} 
  
bool Stack::isEmpty() 
{ 
  if(top < 0) return true;
  else return false;
  

    //Your code here 
} 
  
// Driver program to test above functions 
int main() 
{ 
    class Stack s; 
    s.push(10); 
    s.push(20); 
    s.push(30); 
    cout << s.pop() << " Popped from stack\n"; 
    cout<<s.peek();
    cout << s.pop() << " Popped from stack\n"; 
    cout<<s.peek();
    cout << s.pop() << " Popped from stack\n"; 
    cout<<s.peek();
    return 0; 
} 