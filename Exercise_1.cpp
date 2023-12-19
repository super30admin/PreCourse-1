// Time Complexity : O(1)
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
        top = -1;
    }
    bool push(int x);
    int pop();
    int peek();
    bool isEmpty();
};

bool Stack::push(int x)
{
    if (top + 1 != MAX)
    {
        top++;
        a[top] = x;
    }
}

int Stack::pop()
{
    int removedElement;
    if (top != -1)
    {
        removedElement = a[top];
        top--;
    }
    return removedElement;
}
int Stack::peek()
{
    int peekElement;
    if (top != -1)
    {
        peekElement = a[top];
    }
    return peekElement;
}

bool Stack::isEmpty()
{
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
