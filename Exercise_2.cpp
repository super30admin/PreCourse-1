// Time Complexity : 
//      push, pop, isEmpty, peek: O(1)
// Space Complexity : 
//      push, pop, isEmpty, peek: O(1)

// Did this code successfully run on Leetcode : Yes


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
    //Your code here 
    StackNode* temp = newNode(data);
    if (root == NULL)
        *root = temp;
    else
    {
        temp->next = *root;
        *root = temp;
    }
        
} 
  
int pop(StackNode** root) 
{ 
    if(*root == NULL)
        return(-1);
    
    int top = (*root)->data;
    (*root) = (*root)->next;
    return top;
} 
  
int peek(StackNode* root) 
{ 
    if(root == NULL)
        return (-1);
    return(root->data);
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