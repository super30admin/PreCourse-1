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
   StackNode* temp = newNode(data);
    temp->next = *root;
    *root = temp;

} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
    if(isEmpty(*root))
        return INT_MIN;
    StackNode* temp = *root;
    *root = (*root)->next;
    int k=temp->data;
    free(temp);
    return k;

} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    if(isEmpty(root))
        return INT_MIN;
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