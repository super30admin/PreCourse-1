#include <bits/stdc++.h> 
using namespace std; 
  
// A linked list node (changes) 
class Node  
{  
    public: 
    int data;  
    Node *next;  
};  

// Time Complexity : O(1)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Couldn't find a leetcode problem
// Any problem you faced while coding this :N/A
  
/* Given a reference (pointer to pointer) 
to the head of a list and an int, inserts 
a new node on the front of the list. */
void push(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */ 
	Node* node = new Node();	  

    /* 2. put in the data */
 	node->data = new_data;  
  
    /* 3. Make next of new node as head */ 
	node->next = *head_ref;
  
    /* 4. move the head to point to the new node */
	*head_ref = node;
}  


// Time Complexity : O(1)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Couldn't find a leetcode problem
// Any problem you faced while coding this :N/A
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    /*1. check if the given prev_node is NULL */ 
	 if (!prev_node) {
	    return;
	 }	 
  
    /* 2. allocate new node */ 
    	Node* node = new Node();

    /* 3. put in the data */ 
	node->data = new_data;
  
    /* 4. Make next of new node as next of prev_node */
	node->next = prev_node->next;
  
    /* 5. move the next of prev_node as new_node */
	prev_node->next = node; 
}  
  


// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Couldn't find a leetcode problem
// Any problem you faced while coding this :N/A

/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */ 
	Node* node = new Node();  

    /* 2. put in the data */ 
	node->data = new_data;
  
    /* 3. This new node is going to be  
    the last node, so make next of  
    it as NULL*/ 
	node->next = NULL; 
  
    /* 4. If the Linked List is empty, 
    then make the new node as head */
	if(*head_ref == NULL) {
	*head_ref = node;
	}
  
    /* 5. Else traverse till the last node */
	Node *last_node = *head_ref;
	while (last_node->next != NULL)
    	{
           last_node = last_node->next; 
    	}

    /* 6. Change the next of last node */
        last_node->next = node;  
}  
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    //Your code here
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
