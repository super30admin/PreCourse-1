// Time Complexity :
// push(): O(1)
// pop(): O(1)
// peek(): O(1)
// isEmpty(): O(1)
// Space Complexity : O(n) where n is the number of elements in the stack
// Did this code successfully run on Leetcode : -
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Root/Stack node is the basis of all the operations. The node is manipulated to perform all the actions.

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
    if(root == NULL){
        return -1;
    }
    else return 0;
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode* StackNode = newNode(data);
    StackNode->next = *root;
    *root = StackNode;

} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
    StackNode* temp = *root;
    *root = (*root)->next;
    int ans = temp->data;
    delete temp;
    return ans;

} 
  
int peek(StackNode* root) 
{ 
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