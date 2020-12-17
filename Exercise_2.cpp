//Stack using Linked List//

#include <iostream>
using namespace std;

// A structure to represent a stack
class StackNode {
public:
    int data;
    StackNode *next;
};

StackNode* newNode(int data)
{
    StackNode* stackNode = new StackNode();
    stackNode->data = data;
    stackNode->next = NULL;
    return stackNode;
}

bool isEmpty(StackNode* root)
{
    if(root==NULL)
    {
        cout<<"Stack is empty"<<endl;
        return true;
    }
    else
        return false;

}

void push(StackNode** root, int data)
{
    StackNode* stackNode = new StackNode();
    stackNode->data = data;
    stackNode->next = root;
    root = stackNode;
}

int pop(StackNode** root)
{
        //check if stack is empty//
        if(isEmpty(root)==true)
        {
            cout<<"Stack is empty"<<endl;
            return -1;
        }
        else{
            StackNode* stackNode = root;
            root = root->next; //Assign NULL to the previous node
            return stackNode->data;
            delete(stackNode->data);
        }
}

int peek(StackNode* root)
{
    if(isEmpty(root)==true)
        {
            cout<<"Stack is Empty!"<<endl;
            return -1;
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

    cout << "Top element is " << peek(&root) << endl;

    return 0;
}
