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

/* function to create a new node of tree and returns pointer */
struct Node* newNode(int key)
{
 struct Node* temp = new Node();
 temp->key=key;
 temp->left=NULL;
 temp->right=NULL;

 return temp;
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
queue<struct Node*> queue1;     //created a queue to traverse the list 
                                // and find a empty space to insert element.
struct Node *k ;            
queue1.push(temp);

while(!queue1.empty())
{
 k=queue1.front();              //k is created to store the root traversal value from queue.
 queue1.pop();

 if(k->left==NULL)
 {
     k->left=newNode(key);break;           //if empty space in left. Insert element and break.
 }
 else
 {
     queue1.push(k->left);          //if no empty space, insert element in queue and continue traversal.
 }

 if(k->right==NULL)
 {
     k->right=newNode(key);break;     //if empty space in right. Insert element and break.
 } else{
     queue1.push(k->right);         //if no empty space, insert element in queue and continue traversal.
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