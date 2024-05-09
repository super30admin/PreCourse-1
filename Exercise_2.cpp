// Time Complexity: O(1) - push, pop and peek function operations are done in the constant time
// Space Complexity: O(1) - No extra space is used for the push, pop and peek functions

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
    if (root == NULL) 
    {
        cout<<"Empty Stack\n";
        return 1;
    }
    return 0;
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 

    StackNode* temp = new StackNode();
    temp->data = data;
    temp->next = *root;
    *root = temp;
} 

  
int pop(StackNode** root) 
{   
    //Your code here 
    if (isEmpty(*root))
    {
        cout<<"Empty Stack\n";
        return -1;
    }

    if (*root != NULL)
    {
        StackNode* temp = *root;

        int t= temp->data;
        *root = (*root)->next;
        return t;    
    }
} 
  
int peek(StackNode* root) 
{ 
    //Your code here
    if (isEmpty(root))
    {
        cout<<"Empty Stack\n";
        return -1;
    }

    if (root != NULL)
    {
        return root->data;   
    }
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