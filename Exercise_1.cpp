#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack { 
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
    if(top < MAX-1)
    {
        a[++top] = x;
        return true;
    }
    cout << "Max stack limit reached, failed to add" << endl;
    return false;
} 
  
int Stack::pop() 
{ 
    int ret = 0;
    if(!Stack::isEmpty())
    { 
        ret = a[top];
        top--;
    }
    return ret;
}

int Stack::peek() 
{ 
    if(!Stack::isEmpty()){
        return a[top];
    }
    return 0;
} 
  
bool Stack::isEmpty() 
{ 
  return (top < 0);
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