// TC: Push -> O(1), Pop -> O(1), Peek -> O(1), Is Empty -> O(1)
// SC: O(n) (grows dynamically with input, unlike the array implementation where size was set to a max of 1000)

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
    return root == nullptr;
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode* node = newNode(data);
    node->next = *root;
    *root = node;
} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
    if(isEmpty(*root)) return INT_MIN; // we need to check if *root is empty because we are getting **root as input param
    StackNode* temp = *root;
    *root = (*root)->next;
    int returnVal = temp->data;
    delete temp;
    return returnVal;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    if(isEmpty(root)) return INT_MIN; 
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