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
    if(root == NULL)
        return true;
    return false;

} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode* node = newNode(data);
    node->next = *root;
    *root = node;
} 

//Why does pop method need a parameter since Stack is LIFO?  
int pop(StackNode** root) 
{ 
    //Your code here 
    if(isEmpty(*root))
        throw exception("Stack underflow");
    else
    {   
        int deletedNode = (*root)->data;
        StackNode *node = *root;
        *root = (*root)->next;
        delete(node);
        return deletedNode;
    }

} 
  
int peek(StackNode* root) 
{ 
    if(isEmpty(root))
        throw exception("Stack is empty");
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