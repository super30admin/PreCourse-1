//time complexity is o(1) for every function and space is o(1)
#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { //Constructor here
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
   if(top >= MAX-1){
	cout<<"stack overflow"<<endl;
	return false;
   } else{
   	 a[++top] = x;
   	 return true;
   }
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    if (top == -1) {
    	return 0;
    } else {
    	return a[top--];
    }
} 

int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
 if(top == -1) {
	 return 0;
 } else {
 	return a[top];
 }
 
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
 if(top == -1){
	return true;
  } else {
  	return false;
  }
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