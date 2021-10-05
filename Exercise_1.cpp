//Time complexity for pop=1
//Space complexity=1000*ItemType(4 for int)=4000

#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top;
    int itemCount;
    int x; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { int x=0; int itemCount=0; } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
    void  display();
}; 
  
bool Stack::push(int x) 
{ 
    //Your code here
    //Check Stack overflow as well
	bool result=false; //set resukt as false
	if(itemCount < 1000)//if the stack is not full, push the element in stack
	{
		a[itemCount]=x;//push the value as the last element in array
		itemCount++;//Increase the count
		result=true;//return true if push is successful
	}
	else
	{
		cout<<"No Capacity"<<endl;//else, return as stack is full
	}
	return result;
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well
	
	if(itemCount==0)//If stack is empty, nothing can be popped
	{
		cout<<"No items to pop"<<endl;
	}
	else
	{
		
		top=a[itemCount-1];//Return the count element at count -1th position in array
		itemCount--;//Decreement the count after popping 
		
	
	} 
	return top;
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
	if(itemCount==0)//Check if stack is empty
	cout<<"No elements in stack "<<endl;
	else
	top=a[itemCount-1];//Show the top element

	

	return top;
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here
	bool result=true;
	if(itemCount>0)
	result= false;
	 
	return result;
} 
  
// Driver program to test above functions 
int main() 
{ 
    class Stack s; 
    s.push(10); 
    s.push(20); 
    s.push(30); 
    cout << s.pop() << " Popped from stack\n";
    cout<<s.peek() <<" Last element in stack"<<endl;
    return 0; 
} 
