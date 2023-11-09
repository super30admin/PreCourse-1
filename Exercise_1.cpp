#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { //Constructor here } 
    bool push(int x); 
    void pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  int top=-1;
//   tc:O(1)
//   sc:SIZE OF STACK
bool Stack::push(int x) 
{ 
     if(top == MAX)
      cout<<("OVERFLOW");
   else{
      top++;
      a[top] = x;
      cout<<"\nInsertion success!!!";
} 
  //   tc:O(1)
//   sc:SIZE OF STACK
void Stack::pop() 
{ 
     if(top == -1){
      cout<<"stack empty";
     }
   else{
      
      top--;
   } 
     
} 
//   tc:O(1)
//   sc:SIZE OF STACK
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if(top=-1)cout<<"stack empty";
    else cout<<a[top];
} 
  //   tc:O(1)

bool Stack::isEmpty() 
{ 
    //Your code here
    if(top==-1)return true;
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
