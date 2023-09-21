#include <iostream>



using namespace std;

#define MAX 1000

class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    int top = -1;
public:
    int a[MAX]; // Maximum size of Stack

    Stack() { //Constructor here }
        bool push(int x);
        int pop();
        int peek();
        bool isEmpty();
    };

    bool push(int x) {
        //Your code here
        //Check Stack overflow as well
        top++;
        if (top > 999) return false;
        a[top] = x;
        return true;
    }

    int pop() {
        //Your code here
        //Check Stack Underflow as well
        if (top < 0)return 0;

        return a[top--];
    }

    int peek() {
        //Your code here
        //Check empty condition too
        if (top == -1)return 0;
        return a[top];
    }

    bool isEmpty() {
        //Your code here
        if (top == -1)return true;
        else false;

    }
};

// Driver program to test above functions
int main() {
    class Stack s;
    s.push(10);
    s.push(20);
    s.push(30);
    cout << s.pop() << " Popped from stack\n";
    cout << s.pop() << " Popped from stack\n";
    cout << s.pop() << " Popped from stack\n";

    return 0;
}
