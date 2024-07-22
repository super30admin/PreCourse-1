// Time Complexity : O(1) as we maintain a root for "top" of stack element
// Space Complexity : O(N) for n elements in stack
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : Mostly with understanding of "pointer to pointer" 
// and it took me a bit to finally figure out list formed will be (30 -> 20 -> 10 -> Null)
// and not ( 10 -> 20 -> 30 > Null). I was trying to figure out a way to maintain a head to be able to loop through the list to pop an element. 
// but finally figured out we don't need to maintain a head but a tail since we are implementing stack. 

#include <bits/stdc++.h> 
using namespace std; 
  
// A structure to represent a stack 

// Stack is last in first out. so the list formed should maintain a track of tail.
// for example : D -> C -> B -> A -> NULL

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
    // if(root == NULL)
    // {
    //     return true;
    // }
    // else
    // {
    //     return false;
    // }
    
    return !root;
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode* new_stack_node = newNode(data);
    new_stack_node->next = *root;
    *root = new_stack_node;
    
    StackNode* new_next = newNode(-1);
    
} 
  
int pop(StackNode** root) 
{ 
    if(isEmpty(*root))
    {
        cout << " Error : Accessing Null list \n";
        return -1;
    }
    
    int item_to_pop = (*root)->data;
    *root = (*root)->next;
    return item_to_pop;
} 
  
int peek(StackNode* root) 
{ 
    if(isEmpty(root))
    {
        cout<< " Error: Accessing empty list \n";
        return -1;
    }
    return root->data;
} 
  
int main() 
{ 
    StackNode* root = NULL; 
    
    cout << isEmpty(root) << "\n";
    push(&root, 10);
    cout << isEmpty(root) << "\n";
    push(&root, 20); 
    push(&root, 30); 
  
    cout << pop(&root) << " popped from stack\n"; 
    cout << "Top element is " << peek(root) << endl; 
    
    cout << pop(&root) << " popped from stack\n";
    cout << "Top element is " << peek(root) << endl;
    
    cout << pop(&root) << " popped from stack\n";
    cout << "Top element is " << peek(root) << endl;
    
    cout << pop(&root) << " popped from stack\n";
    cout << "Top element is " << peek(root) << endl;
    
  
    return 0; 
} 