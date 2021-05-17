#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack { 
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { //Constructor here
        top=0;
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
    bool stat = false;
    if(top < MAX) {
        a[top] = x;
        top++;
        stat = true;
    }
    return stat;

} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    int retVal = -1; //Assumption is that -1 will be returned incase of underflow
    if(top != 0) {
        top--;
        retVal = a[top];
    }
    return retVal;
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    int retVal = -1; //Assumption is that -1 will be returned incase of empty stack
    if(top != -1) {
        retVal = a[top - 1];
    }
    return retVal;
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
    return (top == 0) ? true : false;
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