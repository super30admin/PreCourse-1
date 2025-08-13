// TC: Push -> O(1), Pop -> O(1), Peek -> O(1), Is Empty -> O(1)
// SC: O(1), since MAX is set to 1000

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
        /* Constructor here */ 
        top = -1; // to keep track of the index of the last added element
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
    if(top >= MAX-1) return false;
    top++;
    a[top] = x;
    return true;
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    if(top < 0) return INT_MIN;
    top--;
    return a[top+1];
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if(top == -1) return INT_MIN;
    return a[top];
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
    return top == -1;
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