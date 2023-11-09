#include <bits/stdc++.h> 
using namespace std; 
  
// A structure to represent a stack 
class StackNode { 
public: 
    int data; 
    StackNode* next; 
}; 
  
StackNode* newNode(int data) 
{ 
    StackNode* stackNode = new StackNode(); 
    stackNode->data = data; 
    stackNode->next = NULL; 
    return stackNode; 
} 
  
int isEmpty(StackNode* root) 
{
	if(root != NULL)
		return 0;
	else
		return 1;
    //Your code here 
} 
  
void push(StackNode** root, int data) 
{
	StackNode* newnode1 = newNode(data);
	if(isEmpty( *root))
		*root = newnode1;
	else{
		newnode1-> next = *root;
		*root = newnode1;
	}
    //Your code here 
} 
  
int pop(StackNode** root) 
{
	if(isEmpty(*root))
		return INT_MIN;
	StackNode* newnode1 = *root;
	*root = (*root) -> next;
	int temp = newnode1-> data;
	free(newnode1);
	return temp;
    //Your code here 
} 
  
int peek(StackNode* root) 
{
	if(isEmpty(root))
        return INT_MIN;
    else
    	return root->data; 
    //Your code here 
} 
  
int main() 
{ 
    StackNode* root = NULL; 
  
    push(&root, 10); 
    push(&root, 20); 
    push(&root, 30); 
  
    cout << pop(&root) << " popped from stack\n"; 
  
    cout << "Top element is " << peek(root) << endl; 
  
    return 0; 
} 
