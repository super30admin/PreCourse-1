// Time Complexity :
// push(int x); pop(); peek(); isEmpty() = O(1)
// Space Complexity :O(MAX)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : did not find the exact same problem on leetcode
#include <bits/stdc++.h>
using namespace std;
#define MAX 1000

class Stack
{
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    int top;
    // top will keep track of the first element of stack
    // before insert in stack top++ then insert
public:
    int a[MAX]; // Maximum size of Stack

    Stack()
    {
        top = -1; // Constructor here
    }
    bool push(int x);
    int pop();
    int peek();
    bool isEmpty();
};

bool Stack::push(int x)
{
    if (top == MAX - 1)
    {
        cout << " Stack Underflow" << endl;
        return false;
    }
    a[++top] = x;
    return true;
}
// will be returning 0 if stack empty
int Stack::pop()
{
    if (top == -1)
    {
        cout << " Stack Underflow" << endl;
        return 0;
    }
    return a[top--];
}
int Stack::peek()
{
    if (top == -1)
    {
        cout << " Stack Underflow" << endl;
        return 0;
    }
    return a[top];
}
// will be returning 0 if stack empty
bool Stack::isEmpty()
{
    return (top == -1);
}

// Driver program to test above functions
int main()
{
    Stack s;
    s.push(10);
    s.push(20);
    s.push(30);
    cout << s.pop() << " Popped from stack\n";
    return 0;
}