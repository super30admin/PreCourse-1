#include <bits/stdc++.h>

using namespace std;

#define MAX 1000

/*
Time Complexity :
    push(): O(1)
    pop(): O(1)
    peek(): O(1)
    isEmpty(): O(1)

Space Complexity :
    stack: O(n), n is number of elements in stack

Did this code successfully run on Leetcode : Couldn't find the leetcode problem

Any problem you faced while coding this : None
*/
class Stack
{
    int top;

public:
    int a[MAX]; // Maximum size of Stack

    Stack()
    {
        top = -1;
    }
    bool push(int x);
    int pop();
    int peek();
    bool isEmpty();
};

// Push data onto the stack
bool Stack::push(int x)
{
    if (top >= MAX)
    {
        return false;
    }

    a[++top] = x;

    return true;
}

// Pop data from the stack
int Stack::pop()
{
    if (isEmpty())
    {
        return -1;
    }
    else
    {
        return a[top--];
    }
}

// Peek the top element of the stack
int Stack::peek()
{
    if (isEmpty())
    {
        return -1;
    }

    return a[top];
}

// Check if the stack is empty
bool Stack::isEmpty()
{
    if (top < 0)
    {
        return true;
    }

    return false;
}

// Driver program to test above functions
int main()
{
    class Stack s;
    s.push(10);
    s.push(20);
    s.push(30);
    cout << s.peek() << " Peeked from stack\n";
    cout << s.pop() << " Popped from stack\n";
    cout << s.peek() << " Peeked from stack\n";
    cout << s.pop() << " Popped from stack\n";
    cout << s.peek() << " Peeked from stack\n";
    cout << s.pop() << " Popped from stack\n";

    return 0;
}
