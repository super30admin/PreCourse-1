#include <bits/stdc++.h> 
#include<iostream>
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
    if(root == NULL)
    {
        return true;
    }
    else
    {
        return false;
    }
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode* newNode = new StackNode;

    newNode->data = data;
    newNode->next = *root;

    *root = newNode;

    return; 
} 
  
int pop(StackNode** root) 
{ 
    int x;

    //Empty Stack condition
    if((*root) == NULL)
    {
        cout << "Stack is Empty!" << endl;
        return -1;
    }

    StackNode* nextNode = (*root)->next;

    x = (*root)->data;
    
    //Deallocate the memory occupied
    delete(*root);

    *root = nextNode;

    return x;
} 
  
int peek(StackNode* root) 
{ 
    //Empty Stack condition
    if(root == NULL)
    {
        cout << "Empty Stack!" << endl;
        return -1;
    }
    //Return value of Top-most element
    else
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

/**
 * @brief Comments
 * Time - All the Functions will work with O(1) time complexity.
 * Addition and deletion in linked list is happening at head pointer only.
 * 
 * Space - Only Nodes in the Stack will occupy space. The memory is deallocated
 * as and when the node is popped.
 * 
 */