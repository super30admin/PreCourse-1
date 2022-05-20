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
    top = -1;} 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
  //Time complexity - O(1)
bool Stack::push(int x) 
{ 
    //Your code here
    //Check Stack overflow as well
    if (top >= (MAX - 1)) {
        cout << "Stack Overflow";
        return false;
    }
    else {
        a[++top] = x;
        cout << x << " is pushed into the stack\n";
        return true;
    }
} 
  
  //Time complexity - O(1)
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    if (top < 0) {
        cout << "Stack Underflow";
        return 0;
    }
    else {
        int x = a[top--];
        return x;
    }
} 

//Time complexity - O(1)
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if (top < 0) {
        cout << "Stack is Empty";
        return 0;
    }
    else {
        int x = a[top];
        return x;
    }
} 
  
  //Time complexity - O(1)
bool Stack::isEmpty() 
{ 
    //Your code here 
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
