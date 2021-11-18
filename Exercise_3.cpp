// Time Complexity : O(N) for append, insertAfter and print operations and O(1) for push
// Space Complexity :O(N) for storing data
// Did this code successfully run on Leetcode : NA
// Any problem you faced while coding this : None


#include <bits/stdc++.h> 
using namespace std; 
  
// A linked list node (changes) 
class Node  
{  
    public: 
    int data;  
    Node *next;  
};  
  

void push(Node** head_ref, int new_data)  
{  
    Node* newnode = new Node();
    newnode->data = new_data;

    Node* head = *(head_ref);

    newnode->next = head;
    head = newnode;

    *head_ref = head;

}  
  

void insertAfter(Node* prev_node, int new_data)  
{  
    if (prev_node)
    {
        Node* newnode = new Node();
        if (newnode)
        {
            newnode->data = new_data;
            newnode->next = prev_node->next;
            prev_node->next = newnode;
        }
    }
}  
  

void append(Node** head_ref, int new_data)
{
	Node* newnode = new Node();
	if (newnode)
	{
		newnode->data = new_data;
		newnode->next = nullptr;

        if (*head_ref == nullptr)
            *head_ref = newnode;

        else
        {
            Node* head = *(head_ref);

            while (head->next != nullptr)
            {
                head = head->next;
            }

            head->next = newnode;

        }
	}
}
  

void printList(Node *node)  
{  
    while (node)
    {
        int data = node->data;
        cout << data << endl;
        node = node->next;
    }
}  
  

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