// Online C++ compiler to run C++ program online
// Approach: Stack is LIFO
// Time Complexity : Pop- O(1)
//                   push-O(1)
//                   
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :NO

#include <iostream>
#include <bits/stdc++.h> 
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top = -1; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
    
    
    Stack() { //Constructor here 
        
    } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 

  
bool Stack::push(int x) 
{    
    
    //Add the new elem to array at front
    if(top == MAX-1) {
        cout << "Stack Overflow! Cannot push item." << endl;
        return false;
    }
    top++;
    a[top] = x;
    cout << "Pushed on Stack:: " << x << endl;
    
    return true;
    
} 
  
int Stack::pop() 
{ 
    
    if(top == -1)
       return -1;
    //Your code here
    //Check Stack Underflow as well 
    int ret = a[top--];
    cout << "Pop on Stack:: " << ret << endl;
    
    return ret;
} 

int Stack::peek() 
{ 
     if(top == -1)
       return -1;
    //Your code here
    //Check Stack Underflow as well 
    int ret = a[top];
    cout << "Top of Stack:: " << ret << endl;
    return ret;
    
} 
  
bool Stack::isEmpty() 
{ 
    if(top == 0) return true;
    
    return false;
} 
  
// Driver program to test above functions 
int main() 
{ 
    class Stack s; 
    s.push(10); 
    s.push(20); 
    s.peek();
    s.push(30); 
    s.peek();
    cout << s.pop() << " Popped from stack\n"; 
  
    return 0; 
} 
