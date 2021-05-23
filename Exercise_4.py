
class node:
    def __init__(self,data=None):
        self.data=data
        self.left=None
        self.right=None
class BinaryTree:
    def __init__(self):
        self.root=None
    def inorder(self,temp):
        if not temp:
           return
        self.inorder(temp.left)
        print(temp.data,end=" ")
        self.inorder(temp.right)
    def preorder(self,temp):
        if not temp:
            return
        print(temp.data,end=" ")
        self.preorder(temp.left)
        self.preorder(temp.right)
    def postorder(self,temp):
        if not temp:
            return
        self.postorder(temp.left)
        self.postorder(temp.right)
        print(temp.data,end=" ")
    def levelorder(self,temp):
        if not temp:
            return
        queue=[]
        queue.append(temp)
        while len(queue)>0:
              node1=queue.pop(0)
              print(node1.data,end=" ")
              if(node1.left is not None):
                 queue.append(node1.left)
              if(node1.right is not None):
                 queue.append(node1.right)
    def insertlevelorder(self,temp,val):
        if not temp:
            return
        queue=[]
        queue.append(temp)
        while len(queue)>0:
            node1=queue.pop(0)
            if(node1.left is  None):
                node1.left=node(val)
                break
            else:
                queue.append(node1.left)                
            if(node1.right is  None):
                node1.right=node(val)
                break
            else:
                queue.append(node1.right)


        
ob1=BinaryTree()
first=node(1)
second=node(2)
thrid=node(3)
fourth=node(4)
five=node(5)
six=node(6)
seven=node(7)
first.left=second
first.right=thrid
second.left=fourth
second.right=five
thrid.left=six
thrid.right=seven
print("******inorder*******")
ob1.inorder(first)
print()
print("******preorder*******")
ob1.preorder(first)
print()
print("******postorder*******")
ob1.postorder(first)
print()
print("before insertion******levelorder*******")
print()
ob1.levelorder(first)
print()
ob1.insertlevelorder(first,8)
print()
print("after insertion******levelorder*******")
print()
ob1.levelorder(first)
