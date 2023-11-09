#include <bits/stdc++.h> 
using namespace std; 
 // Time Complexity of Push, Pop , Peak and IsEmpty is O(1) (constant time)
// Space Complexity of Push, Pop , Peak and IsEmpty is O(1) (constant time)
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
    if(root == NULL){
        return 1; // 1 indicates True , it is empty stack
    }
    else{
        return 0;   // 0 indicates non-empty stack
    }
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    // create a temp node to push at the beginning
    StackNode* temp = new StackNode(); 
    temp->data = data;
    
    // assign the next pointer of temp to new node (root) 
    temp->next = *root;
    
    // previous root is modified as temp
    *root = temp; 
    
} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
    // Underflow :  No elements to pop
    if(root == NULL){
        return -1; // error scenario
    }
    // create a temp node to delete the node
    StackNode* temp = *root;

    // Store the data of the root into a variable
    int res = *root->data;

    // update the next pointer to next node.
    *root = *root->next;

    // delete the current node
    delete(temp);

    // Return the data of the node that is popped
    return res;
    
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    // No element in the stack , so cannot process
    if(root == NULL){
        return -1; // error scenario
    }
    // if element is present
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