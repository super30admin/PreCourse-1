#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack { 
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
    int idx;
  
    Stack() { 
        idx = 0;
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
    if (idx > MAX){
        cout << "stack overflow" << endl;
        return false;
    }
    a[idx++] = x;
    return true;
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    if (idx == 0){
        cout << "stack Underflow" << endl;
        return -1;
    }
    return a[--idx];
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if (Stack::isEmpty() == true) {
        cout << "stack is empty" << endl;
        return -1;
    }
    else{
        return a[idx - 1];
    }
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
    if (idx == 0) return true;
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
