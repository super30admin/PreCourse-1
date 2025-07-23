/**************************
 all operation are O(1) time complexity
 *************************/
 #include <iostream> 
using namespace std; 

// A structure to represent a stack 
class StackNode { 
public: 
    int data; 
    StackNode* next;

     StackNode(int val)
    {
        data =val;
        next = nullptr;
    } 
}; 
  

  
int isEmpty(StackNode* root) 
{ 
    return (root == nullptr);
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode* temp = new StackNode(data); 
    temp->next = *root;
    *root = temp;
    
} 
  
int pop(StackNode** root) 
{ 
    if(*root == nullptr)
    {
    cout<< "stack underflow\n";
    return -1;
    }
    int res = (*root)->data;
    StackNode* temp = *root;
    *root = (*root)->next;
    delete temp;
    return res;
} 
  
int peek(StackNode* root) 
{ 
    if(root == nullptr)
    {
        cout<< "stack is empty\n";
        return -1;
    }
   return root->data;
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