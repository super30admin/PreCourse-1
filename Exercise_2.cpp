#include <bits/stdc++.h> 
using namespace std; 

// Time Complexity for below operations : O(1)
// Space Complexity for stack : O(n)

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

// Time Complexity : O(1)
// Space Complexity : O(1)
  
int isEmpty(StackNode* root) 
{ 
    //Your code here 
    if (root == NULL)
        return true;
    
    return false;
} 

// Time Complexity : O(1)
// Space Complexity : O(1)

// Create new node with given data value. Assign it's next pointer to root of list. 
// Reassign root of list to new node.

void push(StackNode** root, int data) 
{ 
    //Your code here 
    
    StackNode* node = newNode(data);
    node->next = *root;
    *root = node;
} 

// Time Complexity : O(1)
// Space Complexity : O(1)

// Free the memory location pointed by root and move root to next element of list.
int pop(StackNode** root) 
{ 
    //Your code here 
    StackNode* temp = *root;
    int data = temp->data;

    *root = (*root)->next;
    delete temp;
    return data;
} 

// Time Complexity : O(1)
// Space Complexity : O(1)
int peek(StackNode* root) 
{ 
    //Your code here 
    if (isEmpty(root))
        return -1;

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