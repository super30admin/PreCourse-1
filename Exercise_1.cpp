
// Time Complexity : O(1) as there are no loops
// Space Complexity : O(1000) as MAX is 1000
// Did this code successfully run on Leetcode : I did not find this question in Leet Code
// Any problem you faced while coding this : No I just followed few youtube videos for understadning


// Your code here along with comments explaining your approach

#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack { 
    int top;  // sets the top element index
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack()
     { 
        top=-1;  // initial stage
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
    //Checked Stack overflow as well
} 
  
int Stack::pop() 
{ 
    if(top < 0)   //underflow condition
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
     
    //Checked Stack Underflow as well 
} 


int Stack::peek() 
{ 
    if (top < 0) //empty condition
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
     
    //Checked empty condition too
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