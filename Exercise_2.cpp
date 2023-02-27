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
  
bool isEmpty(StackNode* root) 
{ 
    //Your code here 
    if(root == NULL) return false;
    else return true;
} 
  
void push(StackNode** root, int data) 
{ 
    // Time Complexity O(1)
    // Space Complexity O(1)
    //Your code here 
    StackNode* newNode1 = newNode(data);
    newNode1->next = *root;
    *root = newNode1;
} 
  
int pop(StackNode** root) 
{ 
    // Time Complexity O(1)
    // Space Complexity O(1)
    //Your code here 
    StackNode* newRootNode = (*root) -> next;
    int poppedData = (*root) -> data;
    *root = newRootNode;
    return poppedData;
} 
  
int peek(StackNode* root) 
{ 
    // Time Complexity O(1)
    // Space Complexity O(1)
    //Your code here 
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