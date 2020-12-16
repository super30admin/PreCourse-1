#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack { 
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack()
     { 
        top=-1; 
     } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    if (top >= (MAX - 1))//Its Max - 1 because we are counting from 0.
    {
        cout << "Stack Overflow Case\n";
        return false;
    }
    else 
    {
        top= top+1;
        a[top] = x;
        cout << x << " is pushed element \n";
        return true;
    }
    //Check Stack overflow as well
} 
  
int Stack::pop() 
{ 
    if(top < 0)
    {
        cout<< "Stack underflow Case \n" ; 
        return 0;
    }
    else
    {
        int x=a[top];
        top= top-1;
        cout << x << " is popped element \n" ;
        return x;
        
    }
     
    //Check Stack Underflow as well 
} 


int Stack::peek() 
{ 
    if (top < 0)
    {
        cout<< "Empty Stack";
        return 0;
    }
    else
    {
        int x = a[top];
        cout << x << "is peeped element";
        return x;
    }
     //Your code here
    //Check empty condition too
} 
  
bool Stack::isEmpty() 
{ 
    if (top <0)
    {
        return true;
    } 
    else
    {
        return false;
    }
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