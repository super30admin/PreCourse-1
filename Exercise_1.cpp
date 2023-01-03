// Time Complexity : O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Couldn't find a leetcode problem
// Any problem you faced while coding this : no

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
    { // Constructor here }
        bool push(int x);
        int pop();
        int peek();
        bool isEmpty();
    };

    bool Stack::push(int x)
    {
        // Your code here
        // Check Stack overflow as well
        if (top < MAX)
        {
            a[top] = x;
            top = top + 1;
        }
    }

    int Stack::pop()
    {
        // Your code here
        // Check Stack Underflow as well
    }
    int Stack::peek()
    {
        // Your code here
        // Check empty condition too
        if (top > 0)
        {
            top = top - 1;
            return a[top];
        }
        return -1;
    }

    bool Stack::isEmpty()
    {
        // Your code here
        return (top == 0);
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
