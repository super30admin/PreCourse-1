// Time Complexity : O(1) for all operations
// Space Complexity : O(size of stack)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


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
    return !root;
    //Your code here 
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode* node = newNode(data); // new node added
    node->next = *root; // newnode next is pointed to root 
    *root = node;  // node becomes top // newnode->old root
    //Your code here 
} 
  
int pop(StackNode** root) 
{ 
    if(isEmpty(*root)){
        cout<<"Stack is EMPTY"<< endl;
        return 0;
    }
    StackNode* temp = *root;
    *root = (*root)-> next;
    int x = temp->data;
    cout<<"Data popped is: "<< x << endl;
    delete temp;
    return x;
    //Your code here 
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    if(isEmpty(root)){
        cout<<"Stack is EMPTY"<< endl;
        return 0;
    }
    cout << "top data: " << root->data << endl;
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