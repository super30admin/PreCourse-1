// Time Complexity : O(1)
// Space Complexity : O(n) where n is size of LinkedList
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

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
    return root ==NULL;
    
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode *temp = newNode(data);
    temp->next = *root;
    *root = temp;
} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
    if(isEmpty(*root))                 //check if the stack is empty. If yes you cant delete the element
    {
        return -1;
    }
    else
    {
        /* code */
     StackNode *temp = *root;
     *root = (*root)->next;
     int item = temp->data;
     free(temp);
     return item;   
       
    }
    
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    if(isEmpty(root))
    {
        return -1;
    }
    else
    {
        /* code */
        return root->data;
    }
    
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

// Time Complexity 
// Time complexity is O(1) for all the functions.