#include <bits/stdc++.h> 
#include <iostream> 
using namespace std; 

// A structure to represent a stack 
// Time Complexity : isEmpty = O(1), push = O(1) , pop = O(1),peek =O(1)
// Space Complexity : O(1)

class StackNode { 
public: 
    int data; 
StackNode* newNode(int data)

int isEmpty(StackNode* root) 
{ 
    //Your code here 
    if (root == nullptr) return 1;
    else return 0;
} 

void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode *temp=newNode(data);
    temp->next=(*root);
    (*root)=temp;
} 

int pop(StackNode** root) 
{ 
    //Your code here 
    if (*root == nullptr)
    {
        return -1;
    }
    StackNode *tempRoot= *root;
    *root=tempRoot->next;
    int retTemp=tempRoot->data;
    delete tempRoot;
    return retTemp;
} 

int peek(StackNode* root) 
{ 
    //Your code here 
    return root->data; 
} 

} 
