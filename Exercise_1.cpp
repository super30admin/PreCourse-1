// Time Complexity : o(1)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : N/A


// Your code here along with comments explaining your approach

#include <iostream> // for input/output


using namespace std;

#define MAX 1000

class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top;

public:
    int a[MAX]; // Maximum size of Stack

    Stack() { //Constructor here }
     top = 0;
    }
    bool push(int x);
    int pop();
    int peek();
    bool isEmpty();
};

bool Stack::push(int x)
{
    //Your code here
    //Check Stack overflow as well
    if (top == MAX) {
        cout << "Stack Overflowed !!!" << std::endl;
        return false;
    }
    a[top] = x;
    top+=1;
    return true;
}

int Stack::pop()
{
    //Your code here
    //Check Stack Underflow as well
        if (top < 0) {
        cout << "Stack is empty !!!" << std::endl;
        return false;
    }
    int result = a[top-1];
    a[top-1] = 0;
    top-=1;
    return result;
}

int Stack::peek()
{
    //Your code here
    //Check empty condition too
        if (top < 0) {
        cout << "Stack is empty !!!" << std::endl;
        return 0;
    }
    return a[top];

}

bool Stack::isEmpty()
{
    //Your code here
    return (top < 0) ? true : false;
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
