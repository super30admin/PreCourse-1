#include <iostream>
using namespace std; 
  
  //Linked List as a STACK
  //Time complexity : All operations such as push(), pop(), isEmpty() perform O(1)
  //Space complexity : it is also O(1) but if we consider initial array that is under the hood
  // that holds stack elements then it can be O(n) where
  // n is maximum numner of elementspushed on to the stack at any given point

// A structure to represent a stack 
class StackNode { 
public: 
    int data; 
    StackNode* next; 
    //StackNode** top=NULL; 
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
return root==NULL;
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode* temp=newNode(data);
    
    if(!temp)
    {
        cout<<"stack overflow"<<endl; exit(1);
    }
    temp->data=data;
    temp->next=*root;
    *root=temp;
    
} 
  
int pop(StackNode** root) 
{ 
    StackNode* temp;
    StackNode* curr=*root;
    int top;
    if(curr==nullptr)
    {
        cout<<"underflow"<<endl;
        exit(1);
    }
    else
    {
        temp=curr;
         top=temp->data;
        curr=curr->next;
        free(temp);
    }
    return top;
} 
  
int peek(StackNode* root) 
{ 
    if(!isEmpty(root))
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