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
    if(root == NULL ){
        return 1;
    }
    return 0;
}

void push(StackNode** root, int data)
{
   if(*root == NULL){
       StackNode* stackNode1 = newNode(data);
       *root = stackNode1;
       return;
   }else{
       StackNode* stackNode2 = newNode(data);
       stackNode2->next = *root;
       *root =  stackNode2;
   }
}

int pop(StackNode** root)
{
    if(*root == NULL){
        return -1;
    }
    int val = (*root)->data;
    StackNode* stackNode1 = *root;
    *root = (*root)->next;
    stackNode1 = NULL;
    return val;
}

int peek(StackNode* root)
{
   if(root == NULL){
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

