class Node():
	def __init__(self,key):
		self.val = key
		self.left = None
		self.right = None

def inorderPrint(root):
    if root: 
        inorderPrint(root.left) 
        print(root.val) 
        inorderPrint(root.right)

def insert(root,node): 
    if root is None: 
        root = node 
    else: 
        if root.val < node.val: 
            if root.right is None: 
                root.right = node 
            else: 
                insert(root.right, node) 
        else: 
            if root.left is None: 
                root.left = node 
            else: 
                insert(root.left, node)

r = Node(50) 
insert(r,Node(30)) 
insert(r,Node(20)) 
insert(r,Node(40)) 
insert(r,Node(70)) 
insert(r,Node(60)) 
insert(r,Node(80))

inorderPrint(r)
