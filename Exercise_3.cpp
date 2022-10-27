/*
Time Complexities:
push, insertAfter : O(1)
append, printList : O(n)
*/

#include <iostream>
#include <bits/stdc++.h> 
using namespace std; 
  
// A linked list node (changes) 
class Node  
{  
    public: 
    int data;  
    Node *next;  
};  
  
/* Given a reference (pointer to pointer) 
to the head of a list and an int, inserts 
a new node on the front of the list. */
void push(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */ 
    auto newNode = new Node();
    /* 2. put in the data */  
    newNode->data = new_data;
    /* 3. Make next of new node as head */ 
    newNode->next = (*head_ref);
    /* 4. move the head to point to the new node */
    (*head_ref) = newNode;
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    /*1. check if the given prev_node is NULL */ 
    if(prev_node == NULL)   return;
    /* 2. allocate new node */ 
    Node* newNode = new Node(); 
    /* 3. put in the data */ 
    newNode-> data = new_data; newNode->next = NULL;
    /* 4. Make next of new node as next of prev_node */
    newNode->next = prev_node->next;
    /* 5. move the next of prev_node as new_node */ 
    prev_node->next = newNode;
}  
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */ 
    Node* newNode = new Node(); 
    /* 2. put in the data */ 
    newNode-> data = new_data; 
    /* 3. This new node is going to be  
    the last node, so make next of  
    it as NULL*/  
    newNode->next = NULL;
    /* 4. If the Linked List is empty, 
    then make the new node as head */
    if(*head_ref == NULL)   *head_ref = newNode;
    /* 5. Else traverse till the last node */
    else    {
        auto tail = *head_ref;
        while(tail->next) tail = tail->next;
    /* 6. Change the next of last node */ 
        tail->next = newNode;
    }
}  
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    auto itr = node;
    while(itr)  cout<<itr->data<<" ", itr=itr->next;
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