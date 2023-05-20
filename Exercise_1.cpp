#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top = 0; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { /*Constructor here*/ } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
    // Push an element from the stack
    // Time complexity: O(1)
    // Space complexity: O(1)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No
bool Stack::push(int x) 
{ 
    //Your code here
    //Check Stack overflow as well
    
       if(top>=MAX-1)
       return false;
       else {
           top++;
           a[top]=x;
           cout<<"Digit Added:"<<a[top]<<endl;
       }
       return true;
} 

    // Pop an element from the stack
    // Time complexity: O(1)
    // Space complexity: O(1)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No 
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    
       if(top<=-1)
        {
            cout<<"Stack Underflow"<<endl;
            return -1;
        }
        else {
        return a[top];
        top--;
        
        }
} 
    // Return top element in stack
    // Time complexity: O(1)
    // Space complexity: O(1)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No
int Stack::peek() 
{ 
        return a[top];
} 

    // return whether stack is empty or not
    // Time complexity: O(1)
    // Space complexity: O(1)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No
bool Stack::isEmpty() 
{ 
       if(top<=-1)
        return true;
        else
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
