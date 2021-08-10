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
  
bool isEmpty(StackNode* root) 
{ 
    if(root == NULL) return true;
    return false; 
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here
    if(*root == NULL)
    {
        *root = newNode(data);
        return;
    }
    StackNode* temp = *root;
    *root = newNode(data);
    (*root)->next = temp;
} 
  
int pop(StackNode** root) 
{ 
    //Your code here
    if(root == NULL) return 0;
    StackNode* temp = *root;
    int x = temp->data;
    *root = temp->next;
    delete temp;
    return x;
} 
  
int peek(StackNode* root) 
{
    if(root == NULL) return 0; 
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