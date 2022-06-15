#include <bits/stdc++.h> 
using namespace std;

// Time complexity: O(1)
// Space complexity: O(N)
// tried the code in vscode

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
    return root == NULL; 
} 
  
void push(StackNode** root, int data) 
{
    StackNode* temp = newNode(data);
    temp->next = *root;
    *root = temp;
} 
  
int pop(StackNode** root) 
{ 
    if(!*root)
    {return -1;}
    StackNode *popped = *root;
    *root = popped->next;
    int deleted = popped->data;
    popped->next= NULL;
    delete popped;
    return deleted;
} 
  
int peek(StackNode* root) 
{ 
    if(root)
    {return root->data;}
    return -1;
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