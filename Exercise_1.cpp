#include <bits/stdc++.h> 
#include <iostream> 

// Time Complexity : all opertations are O(1) 
// Space Complexity : O(1)



// Your code here along with comments explaining your approach

using namespace std; 

class Stack {
public: 
    int a[MAX]; // Maximum size of Stack 

    Stack() { //Constructor here } 
    Stack() { top=0;  } 
    bool push(int x); 
    int pop(); 
    int peek(); 
 bool Stack::push(int x)
{ 
    //Your code here
    //Check Stack overflow as well
    if(top == MAX)
    {
        return 0;
    }
    else
    {
        a[top]=x;
        top++;
        return 1;
    }
} 

int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
     if (this->top==0)
    {
        return -111;
    }
    else
    {
        int tempRet = this->a[(this->top)-1];
        this->top--;
        return tempRet;
    }
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if (this->top==0)
    {
        return -111;
    }
    else
    {
        return this->a[(this->top)-1];
    }
} 

bool Stack::isEmpty() 
{ 
    //Your code here 
    return (this->top==0);
} 

// Driver program 
