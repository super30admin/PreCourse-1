/*===== Submission Details ======
Student Name: Pavan Kumar K. N.
Email       : pavan1011@gmail.com
S30 SlackID : RN32MAY2021
=================================
*/
#include <bits/stdc++.h>
using namespace std; 
  
#define MAX 1000

//Int value to return in case of stack underflow or peeking while empty
#define EMPTY_STACK std::numeric_limits<int>::min(); 
  
class Stack { 
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() 
    { 
        top = -1; // counter to the top of the stack
    }    
	
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{
    //Implementation of push(): 
    //Adds an element to the top of the stack

        if(top >= MAX-1)
        {
            cout << "Stack Overflow! Cannot push " << x <<" into stack.";
            return false;
        }
        else
        {
            a[++top] = x; 
            cout << "Pushed " << x << " into stack\n";
            return true;
        }
} 

int Stack::pop() 
{ 
    //Implementation of pop(): 
    //Removes and returns the element at the top of the stack (LIFO order)

    //Checking Stack Underflow
    if(top < 0)
    {   
        cout << "Stack Underflow! Cannot pop from stack.\n";
        return EMPTY_STACK; //Can return different value or perform exception handling
    }
    else
    {
        return a[top--]; // Normal execution
    }
} 

int Stack::peek() 
{ 
    //Implementation of peek(): 
    //Returns element at the top of the stack
    
    //Checking empty stack condition
    if(top < 0)
    {
        cout <<  "Stack is empty. Nothing to see here...\n";
        return EMPTY_STACK; //Can return different value or perform exception handling.

    }
    else
    {
        return a[top]; //Normal execution

    }
    
} 
  
bool Stack::isEmpty() 
{ 
    return(top < 0); 
} 
  
// Driver program to test above functions 
int main() 
{ 
    class Stack s; 
    s.push(10); 
    s.push(20); 
    s.push(30); 
    cout << s.pop() << " Popped from stack\n"; 


    // cout << "Top of the stack:" << s.peek() << endl;
    // s.push(10);
    // cout << "Top of the stack:" << s.peek() << endl;
    // s.push(20); 
    // cout << "Top of the stack:" << s.peek() << endl;
    // cout << s.pop() << " Popped from stack\n";
    // cout << "Top of the stack:" << s.peek() << endl; ;
    // cout << s.pop() << " Popped from stack\n";
    // cout << "Top of the stack:" << s.peek() << endl;;
    // cout << s.pop() << " Popped from stack\n";
    // cout << "Top of the stack:" << s.peek() << endl;


    // cout << s.pop() << " Popped from stack\n";
    // cout << "Top of the stack:" << s.peek() << endl;

    // cout << s.pop() << " Popped from stack\n";
    // cout << "Top of the stack:" << s.peek() << endl;



    return 0; 
} 