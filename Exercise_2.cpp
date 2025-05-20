// Time Complexity : O(1) for all
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : -
// Any problem you faced while coding this : -


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
    //Your code here 
    if(root == NULL) return 1; // check if the root is empty
    else return 0;
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode* nNode = newNode(data); // create a new node and add it to the front of the list
    nNode->next = *root;
    *root = nNode;
} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
    if(isEmpty(*root)){
        cout<<"Stack is Empty"<<endl;
        return -1;
    }
    int popped = (*root)->data; //delete the top node in the list
    StackNode* nNode = *root;
    *root = (*root)->next;
    delete nNode;
    return popped;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    if (isEmpty(root)) {
        cout <<"Stack is Empty"<<endl;
        return -1;
    }
    return root->data; // return the value of the root
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
