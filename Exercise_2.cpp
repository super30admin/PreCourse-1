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
 

StackNode *top;
int isEmpty(StackNode* root) 
{ 
    //Your code here 
    return top ==NULL;
    
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode *temp = new StackNode(); 
   if(!temp){
       cout<<"stack is full\n";
       exit(1);   
       
   }
   temp->data=data;
   temp->next = top;
   top = temp;
    
} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
    StackNode *temp = new StackNode(); 
    if(top ==NULL){
        cout<< "Empty stack\n";
        exit(1);
    }
    else{
        temp = top;
        top = top->next;
        temp->next = NULL;
        return temp->data;
    }
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    if(!isEmpty(root)){
        return top->data;
    }
    else{
        cout<<"stack is empty\n";
        exit(1);
        //return -1;
    }
} 
  
int main() 
{ 
    StackNode* root = NULL; 
  
    push(&root, 10); 
    push(&root, 20); 
    push(&root, 30); 
  
    cout << pop(&root) << " popped from stack\n"; 
    cout << pop(&root) << " popped from stack\n"; 
    cout << pop(&root) << " popped from stack\n"; 
  
    cout << "Top element is " << peek(root) << endl; 
  
    return 0; 
} 
