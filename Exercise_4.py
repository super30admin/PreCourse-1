# Python program to insert element in binary tree
class newNode():

    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None


""" Inorder traversal of a binary tree"""


def inorder(temp):
    if temp == None:
        return

    inorder(temp.left)
    print (temp.key, " ")
    inorder(temp.right)


"""function to insert element in binary tree """


def insert(temp, key):
    queue_for_level_order = []
    queue_for_level_order.append(temp)

    while (len(queue_for_level_order) > 0):
        node = queue_for_level_order.pop(0)
        if node.left is None:
            node.left = newNode(key)
            break
        else:
            queue_for_level_order.append(node.left)

        if node.right is None:
            node.right = newNode(key)
            break
        else:
            queue_for_level_order.append(node.right)


def main():
    root = newNode(10)
    root.left = newNode(11)
    root.left.left = newNode(7)
    root.right = newNode(9)
    root.right.left = newNode(15)
    root.right.right = newNode(8)

    print("Inorder traversal before insertion:")
    inorder(root)

    key = 12
    insert(root, key)

    print()
    print("Inorder traversal after insertion:")
    inorder(root)


# Driver code
if __name__ == '__main__':
    main()
