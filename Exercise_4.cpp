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
    Node* newNode = new Node();
    newNode->key = key;
    newNode->left = newNode->right = NULL;
    return newNode;
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
Node* insert(struct Node* temp, int key) 
{ 
    if(temp == NULL)
    {
        temp = newNode(key);
        return temp;
    }
    // Do level order traversal until we find 
    // an empty place.
    queue<Node*> q;  
    q.push(temp);
    while(!(q.empty()))
    {
        Node* temp1 = q.front();
        q.pop();
        if(temp1->left == NULL)
        {
            temp1->left = newNode(key);
            return temp;
        }
        if(temp1->right == NULL)
        {
            temp1->right = newNode(key);
            return temp;
        }
        q.push(temp1->left);
        q.push(temp1->right);

    }

    return temp;
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
    root = insert(root, key); 
  
    cout << endl; 
    cout << "Inorder traversal after insertion:"; 
    inorder(root); 
  
    return 0; 
} 