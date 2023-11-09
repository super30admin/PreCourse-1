
/*
 Time Complexity :
// N is the number of elements 
// Push operation : O(N) as each time have to iterate from root to end to push the elem.
// Pop operation : O(N) as each time have to iterate from root to end to pop the last elem 
// peek : O(N)  as each time have to iterate from root to end to check last element.
// isempty : O(1) just checking root is null or not 
*/

/* Space Complexity:
// No extra space complexity than what is initially provided. Just some temp variables. 
*/

/* Any problem you faced while coding this :
*/

#include<iostream>
#include <limits.h>
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
    if( root == NULL ) {
       return 1;
    } 
    return 0;
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    if( *root == NULL ) {
       *root = newNode( data ); 
    } else {
       StackNode* temp = *root;
       while( temp->next != NULL ){
          temp = temp->next;
       }
       StackNode* pushNode = newNode( data );
       temp->next = pushNode;
    }
} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
    if( *root == NULL ) {
        // No nodes present
        return INT_MIN;
    }
    StackNode* prev = NULL;
    StackNode* temp = *root;
    while( temp->next != NULL ){
       prev = temp;
       temp = temp->next;
    }
    int ret = temp->data;
    if( prev != NULL ) {
       // Means that more than one node present 
       prev->next = NULL;
       delete temp;
       temp = NULL; 
    } else {      
       // Do this for one node present; Case of no nodes present handled at top.
       delete *root;
       *root = NULL;
    }
    return ret;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    if( root == NULL ) { 
        // No nodes present
        return INT_MIN;
    }
    StackNode* temp = root;
    while( temp->next != NULL ){
       temp = temp->next;
    }
    return temp->data;
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
