// Time Complexity : Push: O(1), Pop: O(1), Peek: O(1), isEmpty: O(1)
// Space Complexity : Push: O(1), Pop: O(1), Peek: O(1), isEmpty: O(1)
// Did this code successfully run on Leetcode : No, Didn't find a similar problem
// Any problem you faced while coding this : confusion with pointers and dereferencing


#include <vector>
#include <algorithm>
#include <iostream>

using namespace std; 
  
// A structure to represent a stack 
class StackNode { 
public: 
    int data;          // Data part of stack node object
    StackNode* next;  // pointer to next node
}; 
  
StackNode* newNode(int data)    // function to implement new node, returns a pointer to the created node
{ 
    StackNode* stackNode = new StackNode(); 
    stackNode->data = data; 
    stackNode->next = NULL; 
    return stackNode; 
} 
  
int isEmpty(StackNode* root) 
{ 
    if (root == NULL) return 1; // check if root itself is null and if it is return 1 (true) else 0 (false)
    return 0; 
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode* newnodeptr = newNode(data); // create a newnode pointer
    newnodeptr->next = *root; // assign the next node to newnode as current root
    *root = newnodeptr; // reassign root to newnode

} 
  
int pop(StackNode** root) 
{ 
    if (isEmpty(*root)) return -1; // check if stack is empty if so return -1
    StackNode* temp = *root; // assign root to a temporary node
    int data = (*root)->data; // gather the data from node to be poped
    *root = (*root)->next; // shift the root to the next node orphaning the popped node
    delete temp; // prevent memory leak of orphaned node
    return data; // return the data
} 
  
int peek(StackNode* root) 
{ 
    if (isEmpty(root)) return -1; // check if root is empty
    return root->data; // if not return the data
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