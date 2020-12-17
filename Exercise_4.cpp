//Binary search tree using queue//

#include <iostream>
#include <queue>
using namespace std;
//new one

/* A binary tree node has key, pointer to left child and a pointer to right child */
struct Node {
    int key;
    struct Node* left, *right;
};

/* function to create a new node of tree and returns pointer */
struct Node* newNode(int key)
{
    Node* newleaf = new Node;
    newleaf->key = key;
    newleaf->left = NULL;
    newleaf->right = NULL;
    return newleaf;
};

/* Inorder traversal of a binary tree*/
void inorder(struct Node* temp)
{
    if (temp==NULL)
        return;
    else
        {
            inorder(temp->left);
            cout<<temp->key<<" ";
            inorder(temp->right);
        }
}

/*function to insert element in binary tree */
void insert(struct Node* temp, int key)
{

    //Check if empty tree, if yes then create a root node
    if(temp==NULL)
        {
            temp=newNode(key);
            return;
        }
    //Do level order traversal until we find an empty place.
    queue<Node*> q; //declare a queue
    q.push(temp);   //push root node into queue

    while(!q.empty()) //Run though the entire queue length
    {
        Node* n = q.front(); //Assign the front of the queue to a new node
        q.pop();

        if(n->left!=NULL)   //check for the presence of left child and push into queue
            q.push(n->left);
        else
        {
            n->left = newNode(key); //create a left child
            return;
        }

        if(n->right!=NULL)      //check for right child and push into queue
            q.push(n->right);

        else
        {
            n->right=newNode(key);  //create a right child
            return;
        }
    } //end of while

} //end of function


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
