#include <iostream> 
#include <queue> 
using namespace std; 
//new one
  
/* A binary tree node has key, pointer to left child 
and a pointer to right child */
struct Node { 
    int key; 
    Node* left, *right; 
}; 
  
/* function to create a new node of tree and r 
   eturns pointer */
Node* newNode(int key) 
{ 
    //Your code here
    Node* new_node = new Node();
    
    new_node->key = key;
    new_node->left= nullptr;
    new_node->right= nullptr;
    return new_node;
}; 
  
/* Inorder traversal of a binary tree*/
void inorder(Node* temp) 
{ 
    if (temp==nullptr) 
        return; 
  
    inorder(temp->left); 
    cout << temp->key << " "; 
    inorder(temp->right); 
} 
  
/*function to insert element in binary tree */
void insert(Node* root, int key) 
{ 
  
    // Do level order traversal until we find 
    // an empty place.  
    
    //Your code here
    if (root==nullptr)
    {
        /* code */
        root= newNode(key);
        //return root;
    }

    queue<Node*> q;
    q.push(root);
    while(!q.empty()){
        Node * temp = q.front();
        q.pop();
        if (temp->left !=nullptr)
        {
           q.push(temp->left);
        }
        else{
            temp->left = newNode(key);
            return; 
        }
        if (temp->right!= nullptr)
        {
           q.push(temp->right);
        }
        else
        {
            temp->right= newNode(key);
            return;
        }
        
        
    }
    
} 
  
// Driver code 
int main() 
{ 
    struct Node* root = newNode(10); 
    root->left = newNode(11); 
    root->left->left = newNode(7); 
    root->right = newNode(9); 
    root->right->left = newNode(15); 
    root->right->right = newNode(8); 
  
    cout << "Inorder traversal before insertion:"; 
    inorder(root); 
  
    int key = 12; 
    insert(root, key); 
  
    cout << endl; 
    cout << "Inorder traversal after insertion:"; 
    inorder(root); 
  
    return 0; 
} 