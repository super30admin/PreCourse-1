//Time Complexity: 
   //Push: O(1)
   //Pop: O(1)
   //Peek: O(1)
   //isEmpty: O(1)

// Space Complexity: O(n) where n is number of elements

//Code ran succesfully in online cpp compiler itself(Got the o/p of the popped element)

#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; //Index of top element
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() {top = -1;} // Constructor 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    //Your code here
    //Check Stack overflow as well
    if(top >= MAX-1){
        cout << "Stack Overflow"<<endl;
        return false;
    }
    else{
        a[++top] = x; //Inserting element at the incremented top
        return true;
    }
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    if(top < 0){
        cout << "Stack underflow"<<endl;
        return 0;
    }
    else{
        int x = a[top--]; //Retrieving value of top element and reducing it
        return x;
    }
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if(top < 0){
        cout << "Empty Stack"<<endl;
        return 0;
    }
    else{
        int x = a[top];
        return x;
    }
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
    return(top < 0);
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
