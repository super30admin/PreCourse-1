#include <iostream>

using namespace std;
 
#define MAX 1000
#define EMPTY -9999
 
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top;
 
public:
    int a[MAX]; // Maximum size of Stack
    Stack() {
        int top = -1;
    }
    bool push(int x);
    int pop();
    int peek();
    bool isEmpty();
};
 
bool Stack::isEmpty()
{
    return (-1 == top);
}

bool Stack::push(int x)
{
    //Your code here
    //Check Stack overflow as well
    if (top >= MAX)
        return false;
    a[++top] = x;
   
    return true;
}
 
int Stack::pop()
{
    //Your code here
    //Check Stack Underflow as well
    if (isEmpty())
        return EMPTY;
    
    return a[top--];
}

int Stack::peek()
{
    //Your code here
    //Check empty condition too
    if (isEmpty())
        return EMPTY;
    return a[top];
}
 
// Driver program to test above functions
int main()
{
    class Stack s;
    // s.push(10);
    // s.push(20);
    // s.push(30);
    cout << s.pop() << " Popped from stack\n";
 
    return 0;
}