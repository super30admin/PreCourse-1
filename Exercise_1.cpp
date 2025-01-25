// Time Complexity : O(1)
// Space Complexity : O(MAX)
// Did this code successfully run on Leetcode : This exact problem was not there on Leetcode
// Any problem you faced while coding this : The <bits/stdc++.h> header is not standard and might not be available on all systems, including my macOS systems. So added all the libraries manually while running the code


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
  
    Stack() { //Constructor here 
        top = -1;
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
    if(top >= MAX - 1){ // max size of stack is 1000 make sure not more than MAX elements are added in the stack
        return false;
    }else{
        a[++top] = x; //increments top assign value x
        return true;
    }
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    if(top < 0){ //check if stack is empty
        return -1;
    }else{
        int x = a[top--]; //retrieves top element decrements top
        return x;
    }

} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if(top < 0){ //check if stack is empty
        return -1;
    }else{
        int x = a[top]; //retrieves top element
        return x;
    }
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here
    return (top<0);
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