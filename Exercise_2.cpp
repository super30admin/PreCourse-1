// Time Complexity :
// push(int x); pop(); peek(); isEmpty() = O(1)
// Space Complexity :O(n) where n is the number of elements in the stack
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : did not find the exact same problem on leetcode
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
    return (root==nullptr);
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode* temp = newNode(data);
    temp->next = *root;
    *root = temp; 
} 
  
int pop(StackNode** root) 
{ 
    if(*root==nullptr)
    {
        cout << " Stack Underflow" << endl;
        return 0;
    }
    StackNode* toDelete = *root;
    int val = toDelete->data;
    *root = toDelete->next;
    delete toDelete;
    return val;
} 
  
int peek(StackNode* root) 
{ 
    if(root==nullptr)
    {
        cout << " Stack Underflow" << endl;
        return 0;
    }
    return root->data;
}
void eraseAll(StackNode** root)
{
    StackNode* current = *root;

    while(current!=nullptr)
    {
        pop(&current);
    }
    *root = nullptr;
}
  
int main() 
{ 
    StackNode* root = NULL; 
  
    push(&root, 10); 
    push(&root, 20); 
    push(&root, 30); 
  
    cout << pop(&root) << " popped from stack\n"; 
  
    cout << "Top element is " << peek(root) << endl; 
    //to release all the memory allocated
    eraseAll(&root);
    return 0; 
} 