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
    if(root == NULL)
        return true;
    else
        return false;
} 
  
void push(StackNode** root, int data) 
{
    StackNode* temp = *root;

    if(temp == NULL){
        *root = newNode(data);
        return;
    }

    while(temp -> next != NULL)
        temp = temp -> next;
    
    temp -> next = newNode(data);
} 
  
int pop(StackNode** root) 
{
    if(*root == NULL)
        throw string("Stack is empty. Can't pop!!!");
    else{
        if((*root) -> next == NULL){
            int data = (*root) -> data;
            *root = NULL;
            return data;
        }

        StackNode* prev = *root;
        StackNode* cur = (*root) -> next;

        while(cur -> next != NULL){
            prev = cur;
            cur = cur -> next;
        }

        int data = cur -> data;
        prev -> next = NULL;
        return data;
    }
     
} 
  
int peek(StackNode* root) 
{ 
    if(root == NULL)
        throw string("Stack is empty. Can't peek!!!");
    else{
        StackNode* temp = root;

        while(temp -> next != NULL){
            temp = temp -> next;
        }

        return temp -> data;
    }
} 
  
int main() 
{ 
    try{
        StackNode* root = NULL; 
    
        push(&root, 10); 
        push(&root, 20); 
        push(&root, 30); 
    
        cout << pop(&root) << " popped from stack\n"; 

        int data = peek(root);
    
        cout << "Top element is " << data << endl;
    }
    catch(string msg){
        cout << msg << endl;
    }
  
    return 0; 
} 