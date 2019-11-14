class newNode():
    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None

def inorder(temp):
    if temp:
        inorder(temp.left)
        print(temp.key)
        inorder(temp.right)

def insert_at_root(temp,key):
    a = newNode(key)
    a.right = temp
    a.left = temp.left
    temp.left = None
    return a

def insert_to_empty(root,n):
    queue = []
    if root:
        queue.append(root)
        while(queue):
            a = queue.pop(0)
            if(a.left):
                queue.append(a.left)
            else:
                a.left = newNode(n)
                break
            if(a.right):
                queue.append(a.right)
            else:
                a.right = newNode(n)
                break
        return root
    else:
        return None

if __name__ == '__main__':
    root = newNode(10)
    root.left = newNode(11)
    root.left.left = newNode(7)
    root.right = newNode(9)
    root.right.left = newNode(15)
    root.right.right = newNode(8)

    print("Inorder traversal before insertion at root", end = " ")
    print("\n")
    inorder(root)

    print("Inorder traversal after insertion at empty space", end = " ")
    print("\n")
    inorder(insert_to_empty(root,100))

    print("Inorder traversal after insertion at root", end = " ")
    print("\n")
    inorder(insert_at_root(root, 12))
