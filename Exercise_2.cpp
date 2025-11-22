// Time Complexity:
// push()  -> O(1)
// pop()   -> O(1)
// peek()  -> O(1)
// isEmpty() -> O(1)
//
// Space Complexity:
// O(n) — where n is the number of elements pushed onto the stack,
// because each push creates a new node in the linked list.
//
// Did this code successfully run on Leetcode?
// This was not a LeetCode problem, but the code runs successfully on terminal.
//
// Any problems faced while coding this:
// Understanding pointer manipulation and using StackNode** for push/pop.
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
return !root;    //Your code here 
} 
  
void push(StackNode** root, int data) 
{ 
	StackNode* stackNode = newNode(data);
	stackNode->next = *root;
	*root = stackNode;
    //Your code here 
} 
  
int pop(StackNode** root) 
{ 
    if (isEmpty(*root)){
	    cout << "Stack Underflow\n";
	    return INT_MIN;
	    }
    StackNode* temp = *root;
    *root = (*root)->next;
    int popped = temp -> data;
    delete temp;
    return popped;//Your code here 
} 
  
int peek(StackNode* root) 
{ 
    if (isEmpty(root)){
	    cout << "Stack is empty\n";
	    return INT_MIN;//Your code here 
} 
return root -> data;
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
