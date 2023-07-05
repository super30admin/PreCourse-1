// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

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
    if(root == NULL) return true;
    else return false;
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode* new_node = newNode(data);
    new_node->next = *root;
    *root = new_node;
    cout << data << " pushed to stack\n"; 

} 
  
int pop(StackNode** root) 
{ 
    if (isEmpty(*root)) {
        cout << "Stack is empty\n";
        return INT_MIN;
    }
    StackNode* temp = *root;
    *root = (*root)->next;
    int popped = temp->data;
    delete temp;
    return popped;
} 
  
int peek(StackNode* root) 
{ 
    if (isEmpty(root)) {
        cout << "Stack is empty\n";
        return INT_MIN;
    }
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