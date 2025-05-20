// Time Complexity : O(1) for all
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : -
// Any problem you faced while coding this : -


// Your code here along with comments explaining your approach
#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { top = -1;} 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    //Your code here
    //Check Stack overflow as well
    if(top >= (MAX-1)){
        cout<<"Stack Overflow"<<endl;
        return false;
    } 
    a[++top] = x; // if not overflow put in the next space
    return true;
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    if(top < 0){ // if the top pointer is less than 0
        cout<<"Stack underflow"<<endl;
        return -1;
    }
    return a[top--]; // if not underflow reduce the top and return the poped value
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if(top < 0){ // if the top pointer is less than 0
        cout<<"Stack is empty"<<endl;
        return -1;
    }
    return a[top]; // return the 
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
    if(top < 0){
        return true;
    }
    else return false;
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
