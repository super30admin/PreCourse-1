// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : This exact problem was not there on Leetcode
// Any problem you faced while coding this : The <bits/stdc++.h> header is not standard and might not be available on all systems, including my macOS systems. So added all the libraries manually while running the code


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
    return !root;
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode* stackNode = newNode(data);
    stackNode->next = *root;
    *root = stackNode;
} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
    if(isEmpty(*root)){
        cout<<"Stack Underflow\n";
        return -1;
    }
    StackNode* temp = *root;
    *root =(*root)->next;
    int popped = temp->data;
    delete temp;
    return popped;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    if(isEmpty(root)){
        cout<<"Stack is empty\n";
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