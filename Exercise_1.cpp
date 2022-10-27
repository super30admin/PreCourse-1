/*
Time Complexities:
push, pop, peek, isEmpty : O(1)
*/

#include <iostream>
#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { //Constructor here 
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
    if(top+1 == MAX)    return false;   //Check Stack overflow as well
    top++;
    a[top] = x;
    return true;
} 
  
int Stack::pop() 
{ 
    //Your code here
    if(top-1 < -1)   return -1;  //Check Stack Underflow as well 
    top--;
    return a[top+1];
} 
int Stack::peek() 
{ 
    //Your code here
    if(top < 0)   return -1;//Check empty condition too
    return a[top];
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
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
