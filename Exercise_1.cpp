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
        top =-1;
        }
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    // Time Complexity O(1)
    // Space Complexity O(1)
    if(top + 1 < MAX){
    a[++top] = x;
    return true;
    }
    else
    {
        printf("Stack is full cannot add further");
        return false;
    }

    //Your code here
    //Check Stack overflow as well
} 
  
int Stack::pop() 
{ 
    
    //Your code here
    //Check Stack Underflow as well 
    // Time Complexity O(1)
    // Space Complexity O(1)
    if(isEmpty()){
        cout<< "Stack is Empty.Cannot perform POP" ;
        return -1;
    }
    else {
        return a[top--];
    }
} 
int Stack::peek() 
{ 

    // Time Complexity O(1)
    // Space Complexity O(1) 
    //Your code here
    //Check empty condition too
     if(isEmpty()){ return -1;} 
     else return a[top];
    
} 
  
bool Stack::isEmpty() 
{ 
    
    //Your code here 
    if (top ==-1){
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
