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
	if(root==NULL)
	{
		//cout<<"Stack is empty"<<endl;
		return 0;
	}
	else
		return 1;
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here
    StackNode* temp=new StackNode();
    if(!temp)
    {
        cout<<"Stack overflow"<<endl;
        return;
    }
    temp->data=data;
    temp->next=(*root);
    (*root)=temp;
}
  
int pop(StackNode** root) 
{ 
    //Your code here
    if(!isEmpty(*root))
    {
        cout<<"Stack empty"<<endl;
        return -1;
    }
    StackNode* temp;
    temp=*root;
    int x=(*root)->data;
    (*root)=(*root)->next;
    temp->next=NULL;
    return x;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here
    if(isEmpty(root))
    return root->data;
    else
    return -1;
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