// Time Complexity : O(1) for push operation, O(N) for rest
// Space Complexity : O(N) for N elements
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : mostly a bit of difficulty with pointers.

#include <bits/stdc++.h> 
using namespace std; 
  
// A linked list node (changes) 
class Node  
{  
    public: 
        Node(int val)
        {
            data = val;
            next = NULL;
        }
        
        int data;  
        Node *next;  
};  
  
/* Given a reference (pointer to pointer) 
to the head of a list and an int, inserts 
a new node on the front of the list. */
void push(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */ 
    /* 2. put in the data */  
    
    Node* new_node = new Node(new_data); 
    
    /* 3. Make next of new node as head */
    Node* temp_head = *head_ref;
    new_node->next = temp_head;
    
  
    /* 4. move the head to point to the new node */
    *head_ref = new_node;
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    /*1. check if the given prev_node is NULL */ 
    if(prev_node == NULL)
    {
        cout << "Given node is NULL. Cannot perform insertAfter operation \n";
        return;
    }
  
    /* 2. allocate new node */ 
    /* 3. put in the data */ 
    Node* new_node = new Node(new_data);
  
    /* 4. Make next of new node as next of prev_node */
    new_node->next = prev_node->next;
  
    /* 5. move the next of prev_node as new_node */ 
    prev_node->next = new_node;
}  
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */ 
    /* 2. put in the data */
    /* 3. This new node is going to be  
    the last node, so make next of  
    it as NULL*/
    Node* new_node = new Node(new_data); 
    
    /* 4. If the Linked List is empty, 
    then make the new node as head */
    /* 5. Else traverse till the last node */
    /* 6. Change the next of last node */ 
    if((*head_ref) == NULL)
    {
        *head_ref = new_node;
    }
    else
    {
        Node* node = *head_ref;
        while(node->next != NULL)
        {
            node = node->next;
        }
        
        node->next = new_node;
    }

}  
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    while(node != NULL)
    {
        cout << node->data << "->";
        node = node->next;
    }
    cout << "NULL";
}  
  
/* Driver code*/
int main()  
{  
    Node* head = NULL;
    insertAfter(head, 8); 
    append(&head, 6);  
    push(&head, 7);  
    push(&head, 1);    
    append(&head, 4);    
    insertAfter(head->next, 8);  
    cout<<"Created Linked list is: \n";  
    printList(head);  
    return 0;  
}  
