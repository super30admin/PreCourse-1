#include<iostream>
using namespace std;

class node{
    public:
    int data;
    node* next;

    node(int val){
        data=val;
        next= NULL;
    }
};

void push(node* &head, int val){
    node* n= new node(val);

    node* temp=n;
    n->next=head;
    head=n;
}

void append(node* &head, int val){
    node* n= new node(val);

    if(head==NULL){
        head=n;
        return;
    }

    node* temp=head;
        
    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->next=n;
}


void insertAfter(node* &head, node* prev_node, int val){
    

    if(prev_node==NULL){
        cout<<"No elements are present in the linked list"<<endl;
        return;
    }

    node* n= new node(val);

    node* temp=head;

    while(temp->next!=prev_node->next){
        temp=temp->next;
    }
    
    n->next=prev_node->next;
    prev_node->next=n;
    
    
} 


void Display(node* head){
     node* temp=head;
    while(temp!=NULL){
        cout<<temp->data<<"->";
        temp=temp->next;
    }
    cout<<"NULL"<<endl;
}

int main(){ 
    node* head=NULL;

    append(head,6);
    push(head,7);
    push(head,1);
    append(head,0);
    insertAfter(head,head->next, 15);
    Display(head);


    return 0;
}