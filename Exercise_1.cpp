/*
----------------------------------
* Stack Implementation using array
----------------------------------

* Time Complexity:
*  - Push : O(1)
*  - Pop : O(1)
*  - Peek : O(1)
*  - isEmpty : O(1)

* Space Complexity: O(n)

Did this code successfully run on Leetcode : NA
Any problem you faced while coding this : NO

*/

#include <iostream>

#define MAX 1000

class Stack {
    //Kindly include Time and Space complexity at top of each file
    int top;
    int a[MAX]{}; // Maximum size of Stack

public:
    Stack() {
        top = -1;
    }

    bool push(const int x) {
        //Your code here
        //Check Stack overflow as well
        if (top == MAX - 1) {
            std::cout << "Stack Overflow: Cannot push " << x << " onto the stack\n";
            return false;
        }

        top++;
        a[top]= x;
        return true;
    }

    int pop() {
        //Your code here
        //Check Stack Underflow as well
        if (top == -1) {
            std::cout << "Stack Underflow: Stack is empty\n";
            return -1;
        }

        const int deleted_element = a[top--];
        return deleted_element;
    }

    int peek() const{
        //Your code here
        //Check empty condition too
        if (top == - 1)
            return -1;
        return a[top];
    }

    bool isEmpty() const {
        //Your code here
        if (top == -1) return true;
        return false;
    }
};

// Driver program to test above functions
int main() {
    class Stack s;
    s.pop();
    std::cout << s.peek() << " Peek when stack is empty\n";
    std::cout << "Pushing 10\n"; s.push(10);
    std::cout << "Pushing 20\n"; s.push(20);
    std::cout << "Pushing 30\n"; s.push(30);
    std::cout << s.pop() << " Popped from stack\n";
    std::cout << s.peek() << " Current top from stack\n";

    return 0;
}
