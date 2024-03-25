#include <iostream>
#include <stdio.h>
#include <stdlib.h>

using namespace std; 

#define EMPTY -9999

// A structure to represent a stack
class StackNode {

public:
    int data;
    StackNode* next;
   
    StackNode() {
        next = NULL;
    }
};

StackNode* top = NULL;

StackNode* newNode(int data)
{
    StackNode* stackNode = new StackNode();
    stackNode->data = data;
    stackNode->next = NULL;
    return stackNode;
}
 
bool isEmpty(StackNode* root)
{
    if (NULL == top)
        return true;
    else
        return false;
}
 
void push(StackNode* root, int data)
{
    if (NULL == root)
        return;
   
    if (NULL == top) {
        top = root;
        top->data = data;
        return;
    }
   
    top->next = newNode(data);
    top = top->next;
   
}
 
int pop(StackNode* root)
{
    if (NULL == root)
        return EMPTY;
    if (NULL == top)
        return EMPTY;
   
    if (root == top) {
        int data = top->data;
        top = NULL;
        return data;
    }  
    int data = top->data;
   
    StackNode* cur = root ;
    while (cur->next != top) {
        cur = cur->next;
    }
    cur->next = NULL;
    top = cur;
   
   
    return data;
}
 
int peek(StackNode* root)
{
    if (NULL == root)
        return EMPTY;
    if (NULL == top)
        return EMPTY;
       
    return top->data;
}

int main()
{
    StackNode* root = new StackNode();
   
 
    push(root, 10);
    push(root, 20);
    push(root, 30);
 
    cout << pop(root) << " popped from stack\n";
 
    cout << "Top element is " << peek(root) << endl;
 
    return 0;
} 