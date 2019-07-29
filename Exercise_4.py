class Node:
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None

def inorder(temp):
    if not temp:
        return
    inorder(temp.left)
    print(temp.data,end=" ")
    inorder(temp.right)

def insert(temp,key):
    q=[]
    q.append(temp)

    while(len(q)):
        temp=q[0]
        q.pop(0)

        if (not temp.left):
            temp.left=Node(key)
            break
        else:
            q.append(temp.left)


        if (not temp.right):
            temp.right=Node(key)
        else:
            q.append(temp.right)


if __name__ == '__main__':
    root = Node(1)
    root.left = Node(11)
    root.left.left = Node(7)
    print("***",end=" ")
    inorder(root)
    root.right = Node(9)
    root.right.left = Node(15)
    root.right.right = Node(8)
    print("======")
    inorder(root)


    print("Inorder traversal before insertion:", end=" ")
    inorder(root)

    key = 12
    insert(root, key)

    print()
    print("Inorder traversal after insertion:", end=" ")
    inorder(root)