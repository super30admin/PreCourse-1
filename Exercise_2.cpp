
#include<iostream>
using namespace std;

// A structure to represent a stack
class StackNode {
public:
    int data;
    StackNode* next;

};
StackNode* top= NULL;

StackNode* newNode(int data)
{
    StackNode* stackNode = new StackNode();
    stackNode->data = data;
    stackNode->next = NULL;
    return stackNode;
}

int isEmpty(StackNode* root)
{
    if(root==NULL)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

void push(StackNode** root, int data)
{
    StackNode* stackPush= newNode(data);
    if(isEmpty(*root))
    {
        *root = stackPush;
    }
    else{
    StackNode * temp = *root;
    stackPush->next=temp;
    *root = stackPush;
    }
}

int pop(StackNode** root)
{
   if(root== NULL)
   {
       cout<<"Stack Underflow";
   }
   StackNode* temp1 = *root;        // to get the current element that is to be popped.
   StackNode* temp = (*root)->next;
   *root=temp;                      // to change the root to the next element.
   return temp1->data;              // return popped element.
}

int peek(StackNode* root)
{
    StackNode* temp = root;
    return temp->data;
}

int main()
{
    StackNode* root = NULL;

    push(&root, 10);
    push(&root, 20);
    push(&root, 30);
    push(&root, 40);
    push(&root, 50);
    push(&root, 100);



    cout << pop(&root) << " popped from stack\n";

    cout << "Top element is " << peek(root) << endl;

    return 0;
}