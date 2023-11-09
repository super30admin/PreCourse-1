//time complexity is o(1) for every function and space is dynamic array and some pointer will take extre memory.
#include <bits/stdc++.h> 
using namespace std; 
  
// A structure to represent a stack 
class StackNode { 
public: 
    int data; 
    StackNode* next; 
}; 
  
  //time complexity is o(1) and space is some extra pointer varibale
StackNode* newNode(int data) 
{ 
    StackNode* stackNode = new StackNode(); 
    stackNode->data = data; 
    stackNode->next = NULL; 
    return stackNode; 
} 
  
  //time  and space complexity is o(1)
int isEmpty(StackNode* root) 
{ 
    //Your code here 
    return !root;
} 
  
  //time complexity is o(1)
void push(StackNode** root, int data) 
{ 
    //Your code here 
    
     StackNode* stackNode =  newNode(data); 
     stackNode->next = *root;
     *root = stackNode;
     
} 
  
   //time complexity is o(1) and space is some extra pointer varibale
int pop(StackNode** root) 
{ 
    //Your code here 
    if(isEmpty(*root))
     return INT_MIN;
   
    StackNode* temp =  *root;
    
    *root = (*root)->next;
    int data = temp->data;
    free(temp);
    return data;
    
} 
  
  //time complexity is o(1)
int peek(StackNode* root) 
{ 
    //Your code here 
    if(isEmpty(root)){
    	
    	return INT_MIN;
    	
    } else {
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
  
    cout << "Top element is " << peek(root) << endl; 
  
    return 0; 
}