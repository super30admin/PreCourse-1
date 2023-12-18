#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { top = 0; } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    if (top >= MAX) {
        cout << "Stack Overflow";
        return false;
    } else {
        a[++top] = x;
        cout << x << " pushed into stack\n";
        return true;
    }
} 
  
int Stack::pop() 
{ 
    if (top <= 0) {
        cout << "Stack Underflow";
        return 0;
    } else {
        int firstElement = a[top--];
        return firstElement;
    }
} 
int Stack::peek() 
{ 
    if (top <= 0) {
        cout << "Stack is Empty";
        return 0;
    } else {
        int topElement = a[top];
        return topElement;
    }
} 
  
bool Stack::isEmpty() 
{ 
    return (top <= 0); 
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
