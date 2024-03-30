#include <bits/stdc++.h> 
using namespace std; 
// Time Complexity : O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :YEs
// Any problem you faced while coding this :
  
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
    if(root == NULL) {
       return 1;  
    }
    return 0;
} 
  
void push(StackNode** root, int data) 
{ 
    //allocate new node and intialize it with data
    StackNode* node= new StackNode(data);
 
    node->next = *root;
    *root = node;
} 
  
int pop(StackNode** root) 
{ 
    int top = -1;
    StackNode *temp;
    
    if(!isEmpty(*root)){
        top = (*root)->data;
        temp = *root;
        *root = (*root)->next;
        delete temp;
    }
    
    return top;
} 
  
int peek(StackNode* root) 
{ 
    int top = -1;
    
    if(!isEmpty(root)){
        top = root->data;
    }
    
    return top;
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
