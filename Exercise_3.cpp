// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

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
    Node* newNode = new Node();
    newNode -> data = new_data;
    if (*head_ref == NULL){
        newNode -> next = NULL;
        *head_ref = newNode;
    }
    else {
        newNode -> next = *head_ref;
        *head_ref = newNode;
    }
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    if (prev_node == NULL) return;
    Node* newNode = new Node();
    newNode -> data = new_data;
    newNode -> next = prev_node -> next;
    prev_node -> next = newNode;
}  
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
    Node* newNode = new Node();
    Node* head = * head_ref;
    newNode -> data = new_data;
    newNode -> next = NULL;
    if (*head_ref == NULL) *head_ref = newNode;
    else {
        while (head->next != NULL) head = head->next;
        head -> next = newNode;
    } 
}  
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    while (node != NULL) 
    {
        cout<< node -> data <<endl;
        node = node -> next;
    }
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
