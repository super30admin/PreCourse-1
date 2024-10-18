#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top =-1; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { //Constructor here } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    //Your code here
    //Check Stack overflow as well
    if(top>=(MAX-1)) return false;
    else{
        top++;
        a[top] = x;
        return true;
    }
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    if(top==-1) return -1; //stack overflow
    else {
        
        return a[top--];
    }
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if(top<0) return -1;  //stack empty
    else return a[top];
} 
  
bool Stack::isEmpty() 
{ 
    if(top<1) return true;
    else return false;
    //Your code here 
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