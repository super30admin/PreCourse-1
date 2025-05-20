// Time Complexity : O(1) except O(n) for print
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : -
// Any problem you faced while coding this : -


// Your code here along with comments explaining your approach
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
    Node* nNode = new Node();
    /* 2. put in the data */  
    nNode->data = new_data;
    /* 3. Make next of new node as head */ 
    nNode->next = *head_ref;
    /* 4. move the head to point to the new node */
    *head_ref = nNode;
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    /*1. check if the given prev_node is NULL */ 
    if(prev_node == nullptr) return;
    /* 2. allocate new node */ 
    Node* nNode = new Node();
    /* 3. put in the data */ 
    nNode->data = new_data;
    /* 4. Make next of new node as next of prev_node */
    nNode->next = prev_node->next;
    /* 5. move the next of prev_node as new_node */ 
    prev_node->next = nNode;
}  
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */ 
    Node* nNode = new Node();
    /* 2. put in the data */ 
    nNode->data = new_data;
    /* 3. This new node is going to be  
    the last node, so make next of  
    it as NULL*/  
    nNode->next = NULL;
    /* 4. If the Linked List is empty, 
    then make the new node as head */
    if (*head_ref == nullptr) {
        *head_ref = nNode;
        return;
    }
    /* 5. Else traverse till the last node */
    Node* curr = new Node();
    while(curr->next !=nullptr){
        curr=curr->next;
    }
    /* 6. Change the next of last node */ 
    curr->next = nNode;
}  
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    //Your code here
    while (node != nullptr) {
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
