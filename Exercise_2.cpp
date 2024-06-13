// Time Complexity : O(1), no need to traverse the linked list
// Space Complexity : O(1) - because no extra space has been used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Didn't understand what was "**" at first; first thought we had to keep pushing elements after the root, but there was no other ptr given which we can use to point the top element

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
    //Your code here
    if(root == NULL) {
        return 1;
    }
    return 0;
    
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode* currNode = newNode(data); 
    currNode -> next = *root; 
    *root = currNode; 
    
} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
    if (*root == NULL) {
        return 0;
    } 
    StackNode* temp = *root; 
    *root = (*root) -> next; 
    int popped = temp -> data; 
    delete temp; 
    return popped;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    if (root == NULL) {
        return 0;
    } 
    return root -> data; 
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