#include <iostream> 

// Time Complexity : all opertations are O(1) 
// Space Complexity : O(1)



// Your code here along with comments explaining your approach
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { top=0;  } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
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
