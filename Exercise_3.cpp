//Time Complexity : O(1)
//Space Complexity : O(1)
//Any problems faced : confused using pointers

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
    Node* nn = new Node();

    /* 2. put in the data */ 
    nn->data = new_data; 
  
    /* 3. Make next of new node as head */ 
    nn->next = head_ref;
  
    /* 4. move the head to point to the new node */
    head_ref == nn;
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    /*1. check if the given prev_node is NULL */ 
    Node** head_ref;
    if(prev_node == NULL) {
    	Node* nn = new Node(); 
		nn->data = new_data;
		nn->next = head_ref;
    	head_ref == nn;
    } else {
  
        /* 2. allocate new node */
        Node* nn = new Node(); 
  
        /* 3. put in the data */ 
        nn -> data = data;
  
        /* 4. Make next of new node as next of prev_node */
        nn->next = prev->next;
  
        /* 5. move the next of prev_node as new_node */ 
        prev_node->next = nn;
}  
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */ 
    Node* nn = new Node();
  
    /* 2. put in the data */ 
    nn->data = data;
  
    /* 3. This new node is going to be  
    the last node, so make next of  
    it as NULL*/  
    nn -> next = NULL;
  
    /* 4. If the Linked List is empty, 
    then make the new node as head */
    if(head_ref == NULL) {
    	head_ref = nn;
    } else {

        /* 5. Else traverse till the last node */
        Node* temp = new Node();
		while(temp -> next != NULL)
		{
			temp = temp -> next;
		}
        
        /* 6. Change the next of last node */ 
        temp -> next = nn;
		nn -> next = NULL;
    }
}  
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    Node** head_ref;
    //Your code here
    Node* temp = new Node();
    temp = head_ref;
    if(head == NULL){
    	cout << "List is empty" <<"\n";
    }
    else{
    	cout << "The elements are: "<<"\n";
    	while(temp != NULL){
    		cout << temp->data;
    		temp = temp->next;
    	}
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