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
Node* newNode(int key) 
{ 
    //Your code here
    Node *new_node = new Node();
    if(!new_node)
    {
        cout<<"Memory Error"<<endl;
        return NULL;
    }
    new_node->key = key;
    new_node->left = new_node->right = NULL;
    return new_node;
}; 
  
/* Inorder traversal of a binary tree*/
void inorder(Node* temp) 
{ 
    if (!temp) 
        return; 
  
    inorder(temp->left); 
    cout << temp->key << " "; 
    inorder(temp->right); 
} 
  
/*function to insert element in binary tree */
Node* insert(Node* temp, int key) 
{ 
    if(temp == NULL)
    {
        temp = newNode(key);
        return temp;
    }
    // Do level order traversal until we find 
    // an empty place.  
    queue <Node*> q;
    //Your code here
    q.push(temp);
    while(!q.empty())
    {
        struct Node* n = q.front();
        q.pop();
        if(n->left != NULL)
        {
            q.push(n->left);
        }
        else
        {
            n->left = newNode(key);
            return temp;
        }
        
        if(n->right != NULL)
        {
            q.push(n->right);
        }
        else
        {
            n->right = newNode(key);
            return temp;
        }
    }
} 
  
// Driver code 
int main() 
{ 
    Node* root = newNode(10); 
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
