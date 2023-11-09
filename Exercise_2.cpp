#include <iostream> 
#include <vector> 
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
    if(root==NULL){
        return true;
    }
    return false;
} 
  
void push(StackNode** root, int data) 
{ 

  //Your code here 
   StackNode* temp_root = *(root);
   
          StackNode* temp = newNode(data);
   
       temp->next = temp_root;

   temp_root = temp;
*(root) = temp_root;

  
} 
  
int pop(StackNode** root) 
{ 
    

   StackNode* temp_root  = *(root);
int temp= INT_MIN;
if(temp_root!=NULL){
    temp=temp_root->data;
    StackNode* temp_node = temp_root;
    
    temp_root=temp_root->next;

    free(temp_node);

} 
*(root) = temp_root;
 
   

return temp;
    //Your code here 
} 
  
int peek(StackNode* root) 
{ 
    if(root!=NULL){
        return root->data;        
    }
    return INT_MIN;
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