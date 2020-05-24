#include <iostream> 
#include <queue> 
using namespace std; 
//new one
  
/* A binary tree node has key, pointer to left child 
and a pointer to right child */
struct Node { 
    int key; 
    struct Node* left, *right; 
}; 
  
/* function to create a new node of tree and r 
   eturns pointer */
struct Node* newNode(int key) 
{ 
    //Your code here
    Node* result = new Node();
    result->key  = key;
    result->left = NULL;
    result->right = NULL;
    return result;
}; 
  
/* Inorder traversal of a binary tree*/
void inorder(struct Node* temp) 
{ 
    if (!temp) 
        return; 
  
    inorder(temp->left); 
    cout << temp->key << " "; 
    inorder(temp->right); 
} 
  
/*function to insert element in binary tree */
void insert(struct Node* temp, int key) 
{ 
    // Do level order traversal until we find 
    // an empty place.
    //Your code here  
    std::queue<Node*> Q;
    if(temp == NULL){
        temp = newNode(key);    
    }
    Q.push(temp);
    while(!Q.empty()){
        Node* nd = Q.front();
        Q.pop();
        if(nd->left != NULL){
            Q.push(nd->left);
        }
        else{
            nd->left = newNode(key);
            break;
        }
        if(nd->right != NULL){
            Q.push(nd->right);
        }
        else{
            nd->right = newNode(key);
            break;
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