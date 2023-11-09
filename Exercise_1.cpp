/*
 Time Complexity :
// Push operation : O(1) as just pushing element at end, no iteration needed and can directly access
// Pop operation : O(1) as just popping element from end, no iteration needed and can directly access
// peek : O(1) as directly accessing the last element. 
// isempty : O(1) just checking top variable 
*/

/* Space Complexity:
// No extra space complexity than what is initially provided. 
*/

/* Any problem you faced while coding this :
  Had question initially about what to do in peek function, then figured it out.
  What to return in case of pop and peek when stack underflow ?? 

*/

#include<iostream>
#include <limits.h>  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
  int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() {
       top = -1;
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
    if( top == MAX-1 ) {
       return false;
    }
    top++; // increment top for next operation
    a[top] = x;
    return true;
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    if( top == -1 ){
       return INT_MIN;
    }
    int ret = a[top];
    top--; // decrement top for next operation 
    return ret;
} 

int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if( top == -1 ) {
        return INT_MIN; // return minimum int when nothing present
    }
    return a[top];
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here
    if( top == -1 ){
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
    cout << s.pop() << " Popped from stack\n"; 
  
    return 0; 
} 
