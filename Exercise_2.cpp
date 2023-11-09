#include <iostream>
#include "limits"
using namespace std; 

// Leetcode : Tried on playground, it worked.
// Approach : Problem statement requires stack to be implemented using linked list. Hence, we implement the following steps.
//           We will keep track of head node only which will act as top of stack
//           1. Implementing Push :
//                      a. Create a new node with data.
//                      b. Assign current root as next pointer of newly created node.
//                      c. Assign newly created node as root.
//                      d. Time Complexity : O(1) // Constant Time
//           2. Implementing Pop :
//                      a. Check whether list is empty.
//                      b. If not then return data field of root.
//                      c. Get current root address.
//                      d. Assign root to the next node of root.
//                      e. Delete node whose data field was returned.
//                      f. Time Complexity : O(1) // Constant Time.
//           3. Implementing Peek :
//                      a. Check whether list is empty.
//                      b. If not then return data field of root.
//           4. Implementing isEmpty :
//                      a. Check whether current root is null.
//                      b. If yes then return true.
//                      c. Else return false.

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
    if(root == nullptr)
    {
        return true;
    }
    return false;
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
    if(isEmpty(*root))
    {
        throw range_error("Stack is empty");
    }

    StackNode* temp = *root;
    int retVal = temp->data;
    *root = temp->next;
    delete temp;
    return retVal;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    if(isEmpty(root))
    {
        throw range_error("Stack is empty");
    }

    return root->data;;
} 
  
int main() 
{ 
    StackNode* root = NULL; 
    
    for(int i = 0 ; i < 1000; i++)
    {
        push(&root, i+1);  
    }

    for(int i = 0 ; i < 1000; i++)
    {
        cout << pop(&root) << " popped from stack\n";  
    } 
    
    cout << "Top element is " << peek(root) << endl; 
  
    return 0; 
} 