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
    //Your code here
    if(root == nullptr){
        return 1;
    }else{
        return 0;
    }
}

void push(StackNode** root, int data)
{
    //Your code here
    StackNode* curr = *root;
    if(curr == nullptr){
        curr = newNode(data);
        *root = curr;
    }else{
        while(curr->next){
            curr = curr->next;
        }
        curr->next = newNode(data);
    }
}
void print(StackNode *root){
   puts("Print");
   while(root!=nullptr){
    cout<<"Print :"<<root->data<<endl;
    root = root->next;
   }
}

int pop(StackNode** root)
{
    //Your code here
    if(isEmpty(*root)){
        puts("Stack underflow");
        return -1;
    }
    StackNode* curr = *root;
    StackNode* prev;
    while(curr->next != nullptr){
        prev = curr;
        curr = curr->next;
    }
    prev->next = nullptr;
    return curr->data;
}

int peek(StackNode* root)
{
    //Your code here
    if(isEmpty(root)){
        puts("Stack empty");
        return -1;
    }
    while(root->next){
        root=root->next;
    }
    return root->data;
}

int main()
{
    StackNode* root = NULL;
    push(&root, 10);
    push(&root, 20);
    push(&root, 30);
    print(root);
    cout << pop(&root) << " popped from stack\n";

    cout << "Top element is " << peek(root) << endl;

    return 0;
}
