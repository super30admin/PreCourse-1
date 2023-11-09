//Time complexity=O(1)
// Space complexity=
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
     Node *nodetopush = new Node;
    nodetopush->data=new_data;
    nodetopush->next= (*head_ref);
    (*head_ref)=nodetopush; 
  
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
	Node *inode = new Node;
    /*1. check if the given prev_node is NULL */
    if(prev_node!=NULL)
    {
    
    inode->data=new_data;
    inode->next=NULL; 
    inode->next=prev_node->next;
    prev_node->next=inode;

    }
  
}  
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */ 
    Node *toAppend=new Node;
    Node *cur=new Node;
    cur=*head_ref;
    toAppend->data=new_data;
    toAppend->next=NULL;
  if(*head_ref==NULL)
  *head_ref=toAppend;
  else
  {
  	while(cur->next!=NULL)
  	{
  		cur=cur->next;
  	}
  	cur->next=toAppend;
  	
  }
   
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    while(node!=NULL)
    {
    	cout<<node->data<<endl;
    	node=node->next;
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
