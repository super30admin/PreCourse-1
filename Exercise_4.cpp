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
    Node* new_node = new Node;

    new_node->key = key;
    new_node->left = NULL;
    new_node->right = NULL;

    return new_node;
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
    //Empty Tree condition
    if(temp == NULL)
    {
        temp = newNode(key);
        return;
    }
    
    queue<Node*> q;

    //Add the Root Node to Queue
    q.push(temp);

    while(!q.empty())
    {
        //Get the First Node Pointer
        Node* current = q.front();

        //Remove the First inserted Node
        q.pop();

        if(current->left != NULL)
        {
            //Queue the Left Node
            q.push(current->left);
        }
        else
        {
            //Found the Empty Node
            current->left = newNode(key);
            return;   
        }

        if(current->right != NULL)
        {
            //Queue the Right node
            q.push(current->right);
        }
        else
        {
            //Found the Empty Node 
            current->right = newNode(key);
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

/**
 * @brief Comments on Complexity
 * Time - insert operation requires a Level Order Traversal
 * The worst case could be O(n)
 * 
 * Space - Only Nodes in the Stack will occupy space. The memory is deallocated
 * as and when the node is popped
 * 
 */