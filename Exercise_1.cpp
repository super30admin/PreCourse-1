#include<bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack { 
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { //Constructor here
    top =-1;
    
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
    if(top==MAX-1){
        cout<<"Overflow encountered";
        return false;
    }

    top +=1;
    a[top] = x;
    return true;

} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    if (top== -1){
        return -1;
    }
    int ele = a[top];
    top -= 1;
    return ele;
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
   if (top== -1){
        return -1;
    } 
    return a[top];
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here
    if (top== -1){
        return true;
    } 
    return false; 
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