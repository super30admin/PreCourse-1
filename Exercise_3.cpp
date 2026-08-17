// Time Complexity : Push: O(1), insertAfter: O(1) (given previous node), Append: O(n), printList: O(n)
// Space Complexity : Push: O(1), insertAfter: O(1), Append: O(1), printList: O(1)
// Did this code successfully run on Leetcode : No, Didn't find a similar problem
// Any problem you faced while coding this : None

#include <algorithm>
#include <vector>
#include <iostream>

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
    Node* nodeptr = new Node();
  
    /* 2. put in the data */
    nodeptr->data = new_data;

    /* 3. Make next of new node as head */
    nodeptr->next = *head_ref; 
  
    /* 4. move the head to point to the new node */
    *head_ref = nodeptr;
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    /*1. check if the given prev_node is NULL */
    if (prev_node == NULL) return;  
        
    /* 2. allocate new node */
    Node* newnodeptr = new Node();
        
    /* 3. put in the data */
    newnodeptr->data = new_data;
        
    /* 4. Make next of new node as next of prev_node */
    newnodeptr->next = prev_node->next;
        
    /* 5. move the next of prev_node as new_node */
    prev_node->next = newnodeptr;
}  
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */
    Node* newnodeptr = new Node(); 
  
    /* 2. put in the data */
    newnodeptr->data = new_data; 
  
    /* 3. This new node is going to be  
    the last node, so make next of  
    it as NULL*/
    newnodeptr->next = NULL;  
  
    /* 4. If the Linked List is empty, 
    then make the new node as head */
    if (*head_ref == NULL) {
        *head_ref = newnodeptr;
        return;
    }
    /* 5. Else traverse till the last node */
    Node* lastptr = *head_ref;
    while (lastptr->next != NULL) {
        lastptr = lastptr->next;
    }  
    /* 6. Change the next of last node */
    lastptr->next = newnodeptr; 
}  
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    while (node != NULL) {
        cout << node->data << " ";
        node = node->next;
    }
    cout << endl;
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