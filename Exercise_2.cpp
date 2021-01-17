#include <iostream>
using namespace std;

// A structure to represent a stack 
struct StackNode
{
int data;

StackNode *next;
};

// top pointer to keep track of the top of the stack
StackNode *top = NULL;


bool isempty()
{
 if(top == NULL)
 return true; else
 return false;
}


void push (int value)
{
  StackNode *ptr = new StackNode();
  ptr->data = value;
  ptr->next = top;
  top = ptr;
}


int pop ( )
{ int x;
 if ( isempty() )
  {cout<<"Stack is Empty";
  return -1;}
 else
 {
  StackNode *ptr = top;
   x=top->data;
  top = top -> next;
 
  delete(ptr);
 }
 return x;
}


void peek()
{
 if ( isempty() )
  cout<<"Stack is Empty";
 else
  cout<<"Element at top is : "<< top->data;
}




int main()
{
	 push(10);
	 push(20);
	 push(30);
	 cout << pop() << " popped from stack\n"; 
  
    cout << "Top element is ";
    peek();
 


return 0;
}
