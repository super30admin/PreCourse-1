#include <iostream>
#include <stdio.h>
#include <vector>
  
using namespace std; 
  
#define MAX 1 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { 
        top=-1;
    } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
};

bool Stack::push(int x) 
{ 
    if(top == MAX-1) {
        cout << "Stack Overflow" << endl;
        return false;
    }
    else {
        a[++top] = x;
        cout<<"Pushed "<<x<<" into stack at position : "<<top<<endl;
        return true;
    }
}

  
int Stack::pop() 
{ 
    if (top < 0) {
        cout << "Stack Underflow" << endl;
        return 0;
    }
    else {
        int x = a[top--];
        return x;
    }
} 

int Stack::peek() 
{ 
    if (top < 0) {
        cout << "Stack is Empty" << endl;
        return 0;
    }
    else {
        int x = a[top];
        return x;
    }
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
    cout<<s.peek()<<" Peeked from stack"<<endl;
    cout<<s.pop()<<" Popped from stack\n"; 
    s.pop();
    if(s.isEmpty())
        cout<<"Stack is empty"<<endl;
    else
        cout<<"Stack is not empty"<<endl;
    return 0; 
}
