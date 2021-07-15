#include <bits/stdc++.h>
using namespace std;

#define MAX 10000
int size = 0;
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
    return (root == NULL);
}
  
void push(StackNode** root, int data)
{
    //Your code here
    StackNode* temp = new StackNode();
    try{
        if(size == MAX)
            throw(10);
        else
        {
            temp->data = data;
            temp->next = *root;
            *root = temp;
            size++;
        }
    }
    catch(int num)
    {
        cout<<"Stack Overflow"<<endl;
    }
}
  
int pop(StackNode** root)
{
    //Your code here
    StackNode* temp = new StackNode();
    try{
        if(size == 0)
            throw(10);
        else
        {
            temp = *root;
            *root = temp->next;
            size--;
            return temp->data;
        }
    }
    catch(int num)
    {
        cout<<"Stack Underflow"<<endl;
    }
}
  
int peek(StackNode* root)
{
    //Your code here
    if(root!=NULL)
        return root->data;
    else
        exit(1);
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


