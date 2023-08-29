#include <iostream>  
using namespace std; 
  //ARRAY as a STACK
  //Time complexity : All operations such as push(), pop(), isEmpty() perform O(1)
  //Space complexity : it is also O(1) but if we consider initial array that is under the hood
  // that holds stack elements then it can be O(n) where
  // n is maximum numner of elementspushed on to the stack at any given point
#define MAX 1000 
  
class Stack {

    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
	if(top>=MAX-1)
	{
		cout<<"overflow"<<endl;
		return false;	
	}
	else
	{
		a[top]=x;
		top++;
		cout<<x<<" pushed successfully"<<endl;
		return true;
	}
} 
  
int Stack::pop() 
{ 	
	// checking underflow
    if(top>0)
	{
		top--;
		return a[top];
	}
		else
		{
			return -1;
		}
} 

int Stack::peek() 
{ 
	if(top<0)
	{
		cout<<"empty"<<endl;
		return 0;
	}
	else
	{
	return a[top];
	}
} 
  
bool Stack::isEmpty() 
{ 
    return (top<0);
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
