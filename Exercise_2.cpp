// Time Complexity : O(1) (for push and pop from front)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : N/A
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
    // Returns true if Linked List is Empty 
    return (root == NULL);
} 
  
void push(StackNode** root, int data) 
{
    //Append new node at the front
    StackNode* temp = newNode(data);
    temp->next = *root;
    *root = temp;
} 
  
int pop(StackNode** root) 
{ 
    StackNode* temp = *root;
    // Empty Stack
    if(isEmpty(head)) return -1;

    // Extract the node data from front
    *root = (*root)->next;
    int x = temp->data;
    free(temp);
    return x;
} 
  
int peek(StackNode* root) 
{ 
    // Empty Stack
    if(isEmpty(root)) return -1; 

    while (root->next!=NULL)
        root = root->next;
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