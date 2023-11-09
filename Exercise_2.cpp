// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
#include <iostream>

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
    if(root == nullptr){ //checking if the head of the stack is empty
        return 1;

    }
    else{
        return 0;
    }




    
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode* n1 = newNode(data); //creating a new node with data using the newNode function.
    n1->next= (*root);    //using the next pointer to point to the previous node(current root)
    (*root) =n1;          // making the new node the current root.


    
    
} 
  
int pop(StackNode** root) 
{ 
    if(isEmpty(*root)){
        cout << "Stack underflow" << endl;
        return 0;
    }
    else{
        StackNode* temp = (*root); //making a temp pointer to point to the head of the stack.
        (*root)=(*root)->next;  
        return temp->data;

        
        



    }

    
    
} 
  
int peek(StackNode* root) 
{ 
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