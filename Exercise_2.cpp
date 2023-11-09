// Time Complexity : O(1) for all operations
// Space Complexity : O(N) for storing data
// Did this code successfully run on Leetcode : NA
// Any problem you faced while coding this : None


#include <bits/stdc++.h> 
using namespace std; 

  
// A structure to represent a stack 
class StackNode 
{ 
public: 
    int data; 
    StackNode* next; 
}; 
  
StackNode* newNode(int data) 
{ 
    StackNode* stackNode = new StackNode(); 
    stackNode->data = data; 
    stackNode->next = nullptr; 
    return stackNode; 
} 
  
int isEmpty(StackNode* root) 
{ 
    if (root == nullptr)
        return 1;
    return 0;
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode* newNode = new StackNode();
    newNode->data = data;
    newNode->next = *root;
    *root = newNode;
} 
  
int pop(StackNode** root) 
{ 
    if (isEmpty(*root))
        return -1;

    StackNode* Node = *root;
    StackNode* temp = Node->next;
    *root = temp;

    int data = Node->data;

    delete Node;

    return data;

} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    if (root)
        return root->data;
    return -1;
} 
  
int main() 
{ 
    StackNode* root = nullptr; 
  
    push(&root, 10); 
    push(&root, 20); 
    push(&root, 30); 
  
    cout << pop(&root) << " popped from stack\n"; 
  
    cout << "Top element is " << peek(root) << endl; 
  
    return 0; 
} 