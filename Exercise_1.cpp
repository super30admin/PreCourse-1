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
        top = 0;
        bool push(int x);
        int pop();
        int peek();
        bool isEmpty();
    };

    bool push(int x)
    {
        if (top <= MAX - 1)
        {
            top++;
            a[top] = x;
            return true;
        }
        return false;
    }

    int pop()
    {
        auto topValue = a[top];
        if (top > 0)
        {
            top--;
        }
        return topValue;
    }
    int peek()
    {
        return a[top];
    }

    bool isEmpty()
    {
        return top == MAX;
    }

    // Driver program to test above functions
};

int main()
{
    Stack s;
    s.push(10);
    s.push(20);
    s.push(30);
    cout << s.pop() << " Popped from stack\n";
    s.push(60);
    s.push(70);
    cout << s.peek() << " peek from stack\n";

    cout << s.pop() << " Popped from stack\n";
    return 0;
}