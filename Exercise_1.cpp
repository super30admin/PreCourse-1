#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack { 
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() : top(-1) {} 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
    bool isFull();
}; 
  
bool Stack::push(int x) 
{ 
    if ((MAX - 1) == top) {
        return false;
    }
 
    a[++top] = x;
    return true;
}
  
int Stack::pop() 
{ 
    if (-1 == top) {
        return -1;
    }

    return a[top--];
} 

int Stack::peek() 
{
    if (-1 == top) {
        return -1;
    }

    return a[top];
}
  
bool Stack::isEmpty() 
{
    if (-1 == top) {
        return true;
    }

    return false;
} 

bool Stack::isFull() 
{
    if ((MAX - 1) == top) {
        return true;
    }

    return false;
} 
 
// Driver program to test above functions 
int main() 
{ 
    class Stack s; 
    s.push(30); 
    s.push(10); 
    s.push(20); 
    s.push(30); 
    cout << s.pop() << " Popped from stack\n"; 
  
    return 0; 
} 
