// Time Complexity :
// push - O(1)
// pop - O(1)
// peek - O(1)
// isEmpty - O(1)
// Space Complexity : O(N)

#include <bits/stdc++.h>

using namespace std;

#define MAX 1000

class Stack
{
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    int top;

public:
    int a[MAX]; // Maximum size of Stack

    Stack()
    {
        // Constructor here
        top = -1;
    };

    bool push(int x);
    int pop();
    int peek();
    bool isEmpty();
};

bool Stack::push(int x)
{
    // Your code here
    // Check Stack overflow as well
    if (top + 1 == MAX)
    {
        cout << "Stack overflow" << endl;
        return false;
    }

    // adding new element to the stack
    a[++top] = x;

    return true;
}

int Stack::pop()
{
    // Your code here
    // Check Stack Underflow as well
    if (isEmpty())
    {
        cout << "Stack underflow" << endl;
        return -1;
    }

    // remove and return the element pointed by top
    return a[top--];
}
int Stack::peek()
{
    // Your code here
    // Check empty condition too
    if (isEmpty())
        return -1;

    // return the element pointed by top
    return a[top];
}

bool Stack::isEmpty()
{
    // Your code here
    return top == -1;
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
