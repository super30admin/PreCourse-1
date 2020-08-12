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
    Node* newnode = new Node();
    newnode->key = key;
    newnode->left = nullptr;
    newnode->right = nullptr;
    return newnode;
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
    Node* N = newNode(key);
    queue<Node*> q;
    q.push(temp);
    while (q.empty() == false) {
        Node* tempNode = q.front();
        q.pop();
        if (tempNode->left == NULL) {
            tempNode->left = N;
            break;
        }
        else {
            q.push(tempNode->left);
        }
        if (tempNode->right == NULL) {
            tempNode->right = N;
            break;
        }
        else {
            q.push(tempNode->right);
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
   
   // struct Node* root = NULL;

    cout << "Inorder traversal before insertion:"; 
    inorder(root); 
  
    int key = 12; 
    insert(root, key); 
  
    cout << endl; 
    cout << "Inorder traversal after insertion:"; 
    inorder(root); 
  
    return 0; 
} 