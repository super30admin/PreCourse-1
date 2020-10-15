// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :  Not available on leetcode
// Any problem you faced while coding this : None


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
    //Your code here
    if(root == NULL){
        cout << "Stack is Empty!\n";
        return -1;
    }
    return 0;
}
  
void push(StackNode** root, int data)
{
    //Your code here
    StackNode* stackNode = newNode(data);
    stackNode->next = *root;
    *root = stackNode;
    cout << data << " is pushed into the stack!\n";
}
  
int pop(StackNode** root)
{
    //Your code here
    if(isEmpty(*root) == 0){
        StackNode* temp = *root;
        int val = temp->data;
        *root = (*root)->next;
        return val;
    }
    return INT_MIN;
}
  
int peek(StackNode* root)
{
    //Your code here
    if(isEmpty(root) == 0){
        return root->data;
    }
    return INT_MIN;
}
  
int main()
{
    StackNode* root = NULL;
    isEmpty(root);
    
    cout << pop(&root) << " popped from stack\n";
    push(&root, 10);
    push(&root, 20);
    push(&root, 30);
    cout << isEmpty(root) << endl;
    cout << pop(&root) << " popped from stack\n";
  
    cout << "Top element is " << peek(root) << endl;
    cout << pop(&root) << " popped from stack\n";
  
    cout << "Top element is " << peek(root) << endl;
    return 0;
}
