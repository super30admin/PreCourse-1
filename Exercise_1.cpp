#include <bits/stdc++.h>
  
using namespace std; 
  
#define MAX 1000 

// Time complexity to push: O(1)
// Time complexity to pop: O(1)
// Space complexity: O(MAX)
// tried out the code in vscode

class Stack {
  
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() 
    { 

    //Constructor here
    
    top=-1; //initialising top with -1 since it is zero based indexing
     
    } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    if(top==MAX-1)
    {
        cout<<"Stack Overflow"; // if array reaches capacity then top==Max-1
        return false;
    }

    a[++top]=x; // initially top =-1 therefor top++ for the first element to push
    return true;
} 
  
int Stack::pop() 
{ 
    if(top==-1)
    {
        cout<<"Stack Underflow";
        return -1;
    }

    int temp = a[top];
    top--;
    return temp;
} 
int Stack::peek() 
{ 
    if(top==-1)
    {
        cout<<"Stack Underflow";
        return -1;
    }

    return a[top];
} 
  
bool Stack::isEmpty() 
{ 
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
