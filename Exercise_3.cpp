// Time Complexity :
// push() O(1); insertAfter() O(1); append O(n) printlist O(n) where n is the number of elements in the linked list
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : did not find the exact same problem on leetcode

#include <bits/stdc++.h> 
using namespace std; 
  
// A linked list node (changes) 
class Node  
{  
    public: 
    int data;  
    Node *next;
    Node(int val,Node* nextAdd)
    {
        data = val;
        next = nextAdd;
    }
};  
  
/* Given a reference (pointer to pointer) 
to the head of a list and an int, inserts 
a new node on the front of the list. */
void push(Node** head_ref, int new_data)  
{
    Node* newNode = new Node(new_data,*head_ref);
    *head_ref = newNode;
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    /*1. check if the given prev_node is NULL */ 
    if(prev_node==nullptr)
        return;
    Node* newNode = new Node(new_data,prev_node->next);
    prev_node->next = newNode;
}  
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */ 
    Node* currentNode = *head_ref;
    Node* newNode = new Node(new_data,nullptr);
    if(currentNode==nullptr)
    {
        *head_ref = newNode;
        return;
    }
    while(currentNode->next!=nullptr)
    {
        currentNode = currentNode->next;
    }
    currentNode->next = newNode;
}  
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    Node* currentNode = node;
    while(currentNode!=nullptr)
    {
        cout<<currentNode->data<< " ";
        currentNode = currentNode->next;
    }
    cout<<endl;
}  
  
/* Driver code*/
int main()  
{  
    Node* head = NULL;   
    append(&head, 6);  
    push(&head, 7);  
    push(&head, 1);    
    append(&head, 4);    
    insertAfter(head->next, 8);  
    cout<<"Created Linked list is: ";  
    printList(head);  
    return 0;  
}  