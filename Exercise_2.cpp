// Time Complexity: O(1) for all operations as we are performing on the root and then 
// changing pointer to root or value of root depending on the function

// Space complexity: We use one node to store and we keep freeing up space by deleting nodes that are popped. Hence the fuctions should take O(1) space. 

//Code ran succesfully in online cpp compiler itself(Got the o/p of the popped element and top element)

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
    if(root == NULL){
        return 1;
    }else{return 0;}
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode* temp = new StackNode();
    temp -> data = data;
    temp -> next = *root;
    *root = temp;
} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
    if(*root == NULL){
        cout << "Stack Underflow"<< endl;
        return -1;
    }
    StackNode* temp = *root;
    *root = (*root) -> next;
    int removed = temp -> data;
    delete temp; 
    return removed;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    if(root == NULL){
        cout << "Stack is empty" <<endl;
        return -1;
    }else{
        return root -> data;
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