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

class StackLL{
    private:
    node* top;
    public:
    StackLL(){
        top=NULL;
    }

    bool isEmpty(){
        return top==NULL;

    }

    int Top(){
        if (top==NULL){
            cout<<"No elements are present"<<endl;
            return -1;
        }
        return top->data;
    }

    void push(int val){
        node* n=new node(val);
        if(top==NULL){
            top=n;
        }else{
            n->next=top;
            top=n;
        }
    }

    int pop(){
        if(top==NULL){
            cout<<"Stack is empty"<<endl;
            return -1;
        }
        else{
            int t_val=top->data;
            node* t=top;
            top=top->next;
            delete t;
            return t_val;
        }
    }
};

int main(){

    StackLL st;
    st.push(1);
    st.push(2);
    st.push(3);
    cout<<st.Top()<<endl;
    st.pop();
    cout<<st.Top()<<endl;
    st.pop();
    st.pop();
    cout<<st.isEmpty()<<endl;

    return 0;
}