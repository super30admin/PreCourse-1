# Python program to insert element in binary tree
class newNode():

    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

class BT(object):
    def __init__(self, root):
        self.root = newNode(root)

    """ Inorder traversal of a binary tree"""

    def printTree(self, traversal_type):
        if traversal_type == "inorder":
            return self.inorder(b.root, "")

    def inorder(self, start, traversal):
        """
        Left -> Root -> Right
        :param temp:
        :return:
        """
        if start:
            traversal = self.inorder(start.left, traversal)
            traversal += (str(start.value)+'-')
            traversal = self.inorder(start.right, traversal)
        return traversal



    """function to insert element in binary tree """


    def insert(temp, key):
        pass


# Driver code
if __name__ == '__main__':
    b = BT(10)
    #root = newNode(10)
    b.root.left = newNode(11)
    b.root.left.left = newNode(7)
    b.root.right = newNode(9)
    b.root.right.left = newNode(15)
    b.root.right.right = newNode(8)

    """print("Inorder traversal before insertion:",inorder(root," "), end=" ")
    inorder(root," ")

    key = 12
    insert(root, key)

    print()
    print("Inorder traversal after insertion:", end=" ")
    inorder(root)"""


    print(b.printTree("inorder"))
