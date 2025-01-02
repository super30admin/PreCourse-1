#include <iostream> 
#include<bits/stdc++.h>
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { 
        top = -1;
    } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    top++;
    a[top]=x;
    return true;
} 
  
int Stack::pop() 
{ 
    if(top==-1){
        std::cout<<"Stack Underflow";
        return 0;
    }
    int topElement=a[top];
    top--;
    return topElement;
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if(top==-1){
        cout<<"Stack is empty";
        return 0;
    }
    return a[top];
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
    return top==-1;
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
