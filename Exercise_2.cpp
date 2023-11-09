// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

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
    if (root == NULL) return 1;
    else return 0;
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode* newNode = new StackNode();
    if((*root) != NULL)
    {
        while ((*root)->next != NULL) (*root) = (*root)->next;
        (*root)->next = newNode;
    }
    else *root = newNode;
    newNode->data = data;
    newNode->next = NULL;
} 
  
int pop(StackNode** root) 
{ 
    if((*root) == NULL) return -1;
    while ((*root)->next->next != NULL) (*root) = (*root)->next;
    int temp = (*root)->next->data;
    (*root)->next = NULL;
    return temp;
} 
  
int peek(StackNode* root) 
{ 
    if(root == NULL) return -1;
    while (root->next != NULL) root = root->next;
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
