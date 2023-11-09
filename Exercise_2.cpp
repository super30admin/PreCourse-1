// #include <bits/stdc++.h> 
#include <iostream> 

using namespace std; 

// Time Complexity : O(1)
// Space Complexity : O(N) ? Since, we are using N nodes
// Did this code successfully run on Leetcode : Yes, I ran in VS
// Any problem you faced while coding this : Intution to push & pop from the front was required
  
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
    return root == NULL;
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode *temp = newNode(data);
    temp->next = *root;
    *root = temp;
} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
    if(!*root) return -1;
    StackNode *popped = *root;
    *root = popped->next;
    int deleted = popped->data;
    // Deleting the node properly
    popped->next = NULL;
    delete popped;
    return deleted;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    if(root) return root->data;
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