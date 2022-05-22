/*Hi, I would like to apologize for not having solved the linked list programs,
    as it has been quite a long time since I revised Data Structures, and I cannot solve this
    program myself without external help */



#include <bits/stdc++.h> 
using namespace std; 
  
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
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
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