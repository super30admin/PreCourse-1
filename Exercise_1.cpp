// TC for push, pop, peek and isEmpty check is O(1)
// SC beacuse we are using auxillary stack SC will be 1000 * O(1) -> Constant space

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
	if (top > MAX)
		return false;
	
	top++;
	a[top] = x;
	return true;
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
	int poppedElement;
	if (top < 0)
		return -1;
	
	poppedElement = a[top];
	top--;
	return poppedElement;
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
	int poppedElement;
	if (top < 0)
		return -1;
	
	poppedElement = a[top];
	return poppedElement;
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
	if (top == 0)
		return true;
	
	return false;
} 
  
// Driver program to test above functions 
int main() 
{ 
    class Stack s; 
    s.push(10); 
    cout<<s.peek();
    s.push(20); 
    cout<<s.peek();
    s.push(30); 
    cout << s.pop() << " Popped from stack\n"; 
  
    return 0; 
} 
