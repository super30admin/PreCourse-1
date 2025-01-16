/*
Time Complexity: TC is O(1) because all operations take place at the head of the linkedlist and no traversal is required.

Space Complexity: SC is O(n) because the linkedliast grows proportionally to the size of the input. As the linkedlist grows
dynamically and there is no fixed size allocated to the stack like there was in case of fixed size array.

Any problem I faced: Yes, I think the API with address of root was a bit different initially and it took me a few iterations
to work with it. Also I initially implemented by adding elements to the tail and doing unnecessary traversal and making TC O(on). 
But the fact that root is part of the API for push pop and peek made me think i nthe direction to use it as "top".
*/

#include <iostream> 
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
    if (root == nullptr) return true;
    return false;
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode* next_node = newNode(data);
    next_node->next = (*root);
    (*root) = next_node;
    cout << data << " is pushed\n";
} 
  
int pop(StackNode** root) 
{ 
    if (isEmpty(*root)) return -1;
    StackNode* temp = (*root);
    *root = (*root)->next;
    return temp->data;
} 
  
int peek(StackNode* root) 
{ 
    if (isEmpty(root)) return -1;
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