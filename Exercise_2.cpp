/*
 * Implementing Stacks using singly linked list [LIFO]
 *
 * Time Complexity : 
 * Time complexity for individual operations top()/peek(), pop(), push() is O(1)
 * Time complexity for displaying the contents of the Stack or searching would be O(N)
 *      where N is the number of nodes.
 * 
 * Space Complexity : O(N) 
 *      worst case scenario if we need to add N elements, it will be O(N).
 * 
 * Did this code successfully run on Leetcode/VSCode : Yes
 * 
 * Any problem you faced while coding this : No
 * 
 * Your code here along with comments explaining your approach
 * 
 *      Instead of pointing to the next element, keep pointing to the previous element
 * and store the top as root.
 */

#include<iostream>

using namespace std; 
  
// A structure to represent a stack 
class StackNode { 
public: 
    int data; 
    StackNode* link; // Changing this to link since the approach used will be pointing to
                     // the previous node rather than the next one.
};
  
StackNode* newNode(int data) 
{ 
    StackNode* stackNode = new StackNode(); 
    stackNode->data = data; 
    stackNode->link = NULL;  
    return stackNode; 
} 

StackNode* top = 0;
  
int isEmpty(StackNode* root) 
{ 
    //Your code here
    if (root == 0) {
        cout << "Stack in empty \n.";
        return 1;
    }
    return 0;
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here
    StackNode* stackNode = newNode(data);
    stackNode->link = *root;
    *root = stackNode;

    cout << "Data pushed to stack " << data << endl;
} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
    if (isEmpty(*root)) {
        cout << "Stack is empty. \n";
    }
    StackNode* temp = *root;
    *root = (*root)->link;

    int popped = temp->data;

    delete temp;
    return popped;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    if(isEmpty(root)){
        cout << "Stack is Empty. \n";
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