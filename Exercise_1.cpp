#include <bits/stdc++.h> 
  //Time Complexity: O(n)
  //Space Complexity: O(n)
  //There was an issue with the compilation when trying to define the functions outside the class definition. 
using namespace std; 
  
#define MAX 1000 
  
class Stack {
    
    int top = -1; //Since array indices start from 0, stack top is initialized to -1

public:
    int a[MAX]; // Maximum size of Stack 

    Stack() { //Constructor here 
        bool push(int x);
        int pop();
        int peek();
        bool isEmpty();
    }

    bool push(int x)
    {
        if (top != MAX - 1)
        {
            a[++top] = x;
            cout << x << " was succesfully pushed onto the stack." << "\n";
            return true;
        }
        else
        {
            cout << "Stack Limit reached. Cannot push any more data." << "\n";
            return false;
        }
    }

    int pop()
    {
        if (top != -1)  //Underflow Check
        {
            return a[top--];
        }

        else
        {
            cout << "Stack is empty. Cannot pop any more data." << "\n";
            return -1;
        }
    }
    int peek()
    {
        if (top != -1)  //Empty Check
        {
            return a[top];
        }

        else
        {
            cout << "Stack is empty." << "\n";
            return -1;
        }
    }

    bool isEmpty()
    {
        if (top != -1)  //Empty Check
        {
            cout << "Stack is not empty." << "\n";
            return true;
        }

        else
        {
            cout << "Stack is empty." << "\n";
            return false;
        }
    }
};
  
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
