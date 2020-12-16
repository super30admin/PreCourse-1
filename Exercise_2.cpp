// Time Complexity : O(1) as there are no loops
// Space Complexity : O(1000 *2)=O(2000) as MAX is 1000 and each has a pointer
// Did this code successfully run on Leetcode : I did not find this question in Leet Code
// Any problem you faced while coding this : No I just followed few youtube videos for understadning


// Your code here along with comments explaining your approach

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
    StackNode* stackNode = new StackNode(); //pointer variable = new data-type;
    stackNode->data = data; 
    stackNode->next = NULL; 
    return stackNode; 
} 
  
int isEmpty(StackNode* root) 
{ 
    return !root; //root stores address so if there is no address its negations will be 1 which is boolean of true.
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode* stackNode = newNode (data); //returns you a pointer variable of data type StackNode. Here newnode is the function.
    stackNode->next = *root; // as root is double pointer we still have the address of the main variable root.
    *root = stackNode;
    cout << data << " pushed to stack \n";


} 
  
int pop(StackNode** root) 
{ 
    if (isEmpty (*root)) 
    return INT_MIN;

    StackNode* temp= *root;
    *root = (*root) ->next;
    int popped = temp->data;
    free(temp);

    return popped;

} 
  
int peek(StackNode* root) 
{ 
    if (isEmpty(root))
        return INT_MIN;
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