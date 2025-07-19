/*
Time Complexity : O(1)
Space Complexity : O(n) for n elements */
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
    //Your code here
    return !root;

} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here
    StackNode* new_Node = newNode(data); 
    if(!new_Node){//check if the stack is full or not
        cout << "Stack Overflow" << endl;
    }
    new_Node->next = *root;
    *root = new_Node;    
} 
  
int pop(StackNode** root) 
{ 
    //Your code here
    if(isEmpty(*root))
        return -1;
        
    StackNode* temp = *root;
    *root=(*root)->next;
    int popped=temp->data;
    delete temp;
    return popped;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here
    if(isEmpty(root))
        return -1;
    return root->data; 
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