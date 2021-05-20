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
    return (root == NULL);
} 
  
void push(StackNode** root, int data) 
{ 

    StackNode*newN = newNode(data);
    if(isEmpty(*root)){
        *root = newN;
    } else {
        newN->next = *root;
        *root = newN;
    }
} 
  
int pop(StackNode** root) 
{
    StackNode *popN;
    int ret;
 
    if(!isEmpty(*root)){
        popN = *root;
        *root = popN->next;
        ret = popN->data;
        free(popN);
        return ret;
    }

    return 0;
} 
  
int peek(StackNode* root) 
{ 
    if(!isEmpty(root)){
        return (root->data);
    }
    return 0;
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