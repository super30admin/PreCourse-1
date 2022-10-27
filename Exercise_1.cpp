// Time Complexity : 
//      push, pop, isEmpty, peek: O(1)
// Space Complexity : 
//      push, pop, isEmpty, peek: O(1)

// Did this code successfully run on Leetcode : Yes

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
        top = -1; //contructor
    } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    top++;
    //checking for stack overflow 
    if (top==MAX){
        return(false);
    }
    //adding element
    a[top] = x;
    return(true);
} 
  
int Stack::pop() 
{ 
    //checking for Stack Underflow 
    if (top == -1){
        return (-1);
    }
    //removing top element and decrementing top
    return(a[top--]);
    
} 
int Stack::peek() 
{ 
    //Checking for empty stack 
    if(top==-1)
        return (-1);
    return(a[top]);
} 
  
bool Stack::isEmpty() 
{ 
    //returning true if top == -1 when empty
    return (top == -1);
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
