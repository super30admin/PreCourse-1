#include <iostream> // for input/output
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
  
bool isEmpty(StackNode* root) 
{ 
    //Your code here 
    return (root == NULL) ? true : false;

} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode* current = *root;

    if (*root == NULL){
        *root = newNode(data);
    }
    else {
        while(current->next != NULL){
            current = current->next;
        }
        current->next = newNode(data);
    }

    return;
} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
    StackNode* current = *root;
    int result;

    if(*root == NULL){
        cout << "Stack is emplty" << std::endl;
        return -1;
    }

    if (current->next == NULL){
        result = current->data;
        current = NULL;
        return result;
    }

    while(current->next->next != NULL){
        current = current->next;
    }
    result = current->next->data;
    current->next = NULL;
    return result;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    StackNode* current = root;
    if(root == NULL){
        cout << "Stack is emplty" << std::endl;
        return -1;
    }
    while(current->next != NULL){
        current = current->next;
    }
    return current->data;
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