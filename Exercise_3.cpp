#include <iostream> 
using namespace std; 

// Time Complexity : push = O(1), insertAfter = O(n) , append = O(n),printList =O(n)
// Space Complexity : O(1)

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
    
    Node *temp=new Node();
    temp->data=new_data;
    temp->next=*head_ref;
    *head_ref=temp;
 
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
  
    if (prev_node==nullptr) return;
    Node *temp=new Node();
    temp->data=new_data;
    temp->next=prev_node->next;
    prev_node->next=temp;
}  
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
    Node *temp=new Node();
    temp->data=new_data;
    temp->next=nullptr;
    if(*head_ref == nullptr){*head_ref=temp; return;} 
    Node *iter=*head_ref;
    while(iter->next!=nullptr)
    {
        iter=iter->next;
    }
    iter->next=temp;
    return;
}  
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    while(node!=nullptr)
    {
        std::cout<<" "<<node->data;
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
