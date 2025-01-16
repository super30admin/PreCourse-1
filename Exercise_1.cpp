/*
Time Complexity: TC is O(1) for push, pop, peek and isEmpty, because there is only increment or
decrement of top takes place and value is either read or assigned at particular index. Array
traversal or resizing does not take place as top is always at the end of array.

Space Complexity: I would like to say it is O(n) because there is space allocated for the stack, but this space is constant
(1000) for this implementation, meaning it doesnot depend on input size. If I add 3 elements or I add 1000 the size allocated will be
1000. So I think it should be O(1) as per the definition.

Any problem I faced: Not really. I intially wrote the pre-increment and post-decrement statements in push and pop as 2 separate lines,
then later made them concise and clean.
*/

#include <iostream> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() {top = -1;} // I want to initialize stack with 0 elements, hence top is set to -1
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    if (top == MAX - 1) return false;
    a[++top] = x; // increment top first and then assign x to it
    cout << x << " pushed to the stack\n";
    return true;
} 
  
int Stack::pop() 
{ 
    if (isEmpty()) return -1;
    return a[top--]; // get value of element at index top and decrement top
} 
int Stack::peek() 
{ 
    if (isEmpty()) return -1;
    return a[top];
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
