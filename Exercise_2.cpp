#include <bits/stdc++.h> 
using namespace std; 
  
// A structure to represent a stack 

class Stack {

private:
    class Node { 

    public: 
        int data; 
        Node* next; 
    } *head;

public:
    Stack() : head(nullptr) {}
    Node *newNode(int data);
    int isEmpty() const ;
    void push(int data);
    int pop();
    int peek() const;
};
 
Stack::Node* Stack::newNode(int data) 
{ 
    Node* node = new Node(); 
    node->data = data; 
    node->next = nullptr; 
    return node; 
} 
  
int Stack::isEmpty() const
{ 
    if (nullptr == head) {
        return true;
    }

    return false;
} 
  
void Stack::push(int data) 
{ 
    Node *node = newNode(data);
    node->next = head;
    head = node;
} 
  
int Stack::pop() 
{ 
    if (nullptr == head) {
        return -1;
    }

    int data = head->data;
    Node *node = head;
    head = head->next;
    delete node;

    return data;
} 
  
int Stack::peek() const
{ 
    if (nullptr == head) {
        return -1;
    }

    return head->data;
}
  
int main() 
{ 
    Stack stack; 
  
    stack.push(10); 
    stack.push(20); 
    stack.push(30); 
  
    cout << stack.pop() << " popped from stack\n"; 
    cout << "Top element is " << stack.peek() << endl; 
  
    return 0; 
} 
