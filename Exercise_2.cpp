/*===== Submission Details ======
Student Name: Pavan Kumar K. N.
Email       : pavan1011@gmail.com
S30 SlackID : RN32MAY2021
=================================
*/
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
    return !root; 
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode* stackNode = new StackNode();
    stackNode->data = data;
    stackNode->next = *root;
    *root = stackNode;
    cout << "Pushed " << data << " to stack. \n";
} 
  
int pop(StackNode** root) 
{
    if (isEmpty(*root))
    {
        cout<<"Stack Underflow! Cannot pop from stack.\n";
        return 0;
    }
    else
    {
        StackNode* tempNode = *root;
        *root = (*root)->next;

        int poppedData = tempNode->data;
        free(tempNode);

        return poppedData;

    }

} 
  
int peek(StackNode* root) 
{ 
    if (isEmpty(root))
    {
        cout<<"Stack Underflow! Cannot pop from stack.\n";
        return 0;
    }
    else
    {
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