# Python program to insert element in binary tree  
class Node:
    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None


def inorder(temp):
    """
        Inorder traversal of a binary tree
        Time Complexity - Linear O(n)
        Space Complexity - Linear O(n)
        'n' is the number of nodes
    """
    if not temp:
        return
    inorder(temp.left)
    print(temp.key)
    inorder(temp.right)


def insert(root, key):
    """
        function to insert element in binary tree
        Time Complexity - O(h)
        'h' is the height of the tree
        Space Complexity - Constant O(1)
    """
    node = Node(key)
    # Firs element in tree
    if not root:
        root = node
    else:
        # Keep track of the current and parent node
        current = root
        parent = None
        while True:
            parent = current
            # Insertion in left sub tree
            if node.key < current.key:
                current = current.left
                # If the left sub tree is empty
                if not current:
                    parent.left = node
                    return
            # Insertion in right sub tree
            else:
                current = current.right
                # If right sub tree is empty
                if not current:
                    parent.right = node
                    return

# Driver code
if __name__ == '__main__':
    root = Node(10)
    root.left = Node(11)
    root.left.left = Node(7)
    root.right = Node(9)
    root.right.left = Node(15)
    root.right.right = Node(8)

    print("Inorder traversal before insertion:", end=" ")
    inorder(root)

    key = 12
    insert(root, key)

    print()
    print("Inorder traversal after insertion:", end=" ")
    inorder(root)
