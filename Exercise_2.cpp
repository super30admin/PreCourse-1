// Time complexity:
// isEmpty(): O(1)
// push(): O(1)
// pop(): O(n)
// peek(): O(1)
// Space Complexity : O(n) where n is size of the elements in Structure
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Didn't understand wether we can create global Pointer for maintaining the tail or not.

#include <bits/stdc++.h> 
using namespace std; 
  
// A structure to represent a stack 
class StackNode { 
public: 
    int data; 
    StackNode* next; 
}; 

StackNode* tail=NULL; 

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
    if(root==NULL){
        return 1;
    }
    return 0; 
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here
    if(*root==NULL){
        *root = newNode(data);
        tail = *root;
    }
    else{
        tail->next = newNode(data);
        tail = tail->next;
    }
} 
  
int pop(StackNode** root) 
{ 
    //Your code here
    if(*root == NULL){
        return NULL;
    }
    if((*root)->next == NULL){
        int val = tail->data;
        *root = NULL;
        tail = NULL;
        return val;
    }
    StackNode* prev =  *root;
    while(prev->next!=tail && prev!=NULL){
        prev = prev->next;
    }
    int val = tail->data;
    tail = prev;
    tail->next = NULL;
    return val;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here
    if(root==NULL){
        return NULL;
    } 
    else{
        return tail->data;
    }
} 
  
int main() 
{ 
    StackNode* root = NULL; 
  
    push(&root, 10); 
    push(&root, 70); 
    push(&root, 60);
  
    cout << pop(&root) << " popped from stack\n"; 
  
    cout << "Top element is " << peek(root) << endl;

    cout << "stack is empty " << isEmpty(root) << endl;
  
    return 0; 
} 