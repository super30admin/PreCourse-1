#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() {
        top= -1;
    } //Constructor here  
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
    
}; 
  
bool Stack::push(int x) 
{ 
    //Your code here
    if(top>=MAX-1){
        cout << "Stack Overflow" << endl;
        return false;
    }
    a[++top]=x;
    return true;
    //Check Stack overflow as well
} 
  
int Stack::pop() 
{ 
    //Your code here
    if(top < 0)//stack Underflow
        return -1;
    int x=a[top--];
    return x;
    //Check Stack Underflow as well 
} 
int Stack::peek() 
{ 
    //Your code here
    if(top<0)
        return -1;
    return a[top];
    //Check empty condition too
} 
  
bool Stack::isEmpty() 
{ 
    return top<0;
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
