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
  
  // Time complexity- O(1)
int isEmpty(StackNode* root) 
{ 
    //Your code here 
    return !root;
} 
  
  // Time complexity- O(1)
void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode* stackNode = newNode(data);
    stackNode->next = *root;
    *root = stackNode;
    cout << data << " is pushed to the stack\n";
} 
  
  // Time complexity- O(1)
int pop(StackNode** root) 
{ 
    //Your code here 
    if (isEmpty(*root))
        return -1;
    StackNode* temp = *root;
    *root = (*root)->next;
    int element = temp->data;
    free(temp);
    return element;
} 
  
  // Time complexity- O(1)
int peek(StackNode* root) 
{ 
    //Your code here 
    if (isEmpty(root))
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