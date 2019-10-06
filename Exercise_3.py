
# Node class
class Node:

# function to initialize the node class
    def __init__(self,data):
        self.data=data # Assign the data
        self.next=None # Initialize next as None

# Linkedlist Class
class LinkedList:

#defining the function
    def __init__(self):
        self.head=None
        
# method to insert a new node
    def insert(self,data):
        temp=Node(data)
        temp.next=self.head
        self.head=temp
    
#method to traverse elements in a linked list
    def traverse(self):
        current=self.head
        while current:
            print (current.data),
            current=current.next
            
if __name__== '__main__': 
    lis=LinkedList()
    lis.insert(1)
    lis.insert(2)
    lis.insert(3)
    lis.insert(4)
    lis.insert(5)
    print("Linked list is :"),
    lis.traverse()

