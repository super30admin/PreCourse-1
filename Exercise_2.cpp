/*
// Time Complexity :
O(1) for push()
O(1) for pop()
O(1) for empty()
o(1) for peek
// Space Complexity :
O(1) for push
O(1) for pop
O(1) for isempty
O(1) for peek
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

*/



#include<iostream>
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
    return !root; // root pointing to the null pointer.
} 

/*
create a node store value, 
create new node as root pointer top of the stack. 
*/
void push(StackNode** root, int data) 
{ 
    //Your code here
    StackNode* node = newNode(data);
    node->next = *root;
    *root = node;
    cout<<"data "<<data<<" pushed into address "<<*root<<endl;
} 
/*
Store the root node in temp
Transfer root node to the next pointer
free the memory occupied by temp node.
*/
int pop(StackNode** root) 
{ 
    //Your code here
    if(isEmpty(*root))
    {
        cout<<"Stack underflow "<<endl;
        return -1;
    }
    StackNode* temp = *root;
    *root = (*root)->next;
    int val = temp->data;
    free(temp);
    return val;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here
    if(isEmpty(root))
    {
        cout<<"Stack underflow "<<endl;
        return -1;
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