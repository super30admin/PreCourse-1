#include <iostream>  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
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
