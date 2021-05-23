class Node:
    def __init__(self,data):
        self.data=data
        self.next=None

class SLL:
    def __init__(self):
        self.head=None
    def print(self):
        temp=self.head
        while  temp:
              print(temp.data,end=" ")
              temp=temp.next
    def push(self,new_data):
        new_node=Node(new_data)
        new_node.next=self.head
        self.head=new_node
    def append(self,new_data):
       new_node=Node(new_data)

       if self.head is None:
          self.head=new_node
       temp=self.head
       while(temp.next):
            temp=temp.next
       temp.next=new_node
    def addnode(self,prevnode,new_data):
        if prevnode is None:
           print("prev node is empty")
        newnode=Node(new_data)
        newnode.next=prevnode.next
        prevnode.next=newnode

ll=SLL()
ll.head=Node(1)
second=Node(2)
third=Node(3)
ll.head.next=second
second.next=third
ll.print()
ll.push(4)
print()
ll.print()
print()
ll.append(5)
print()
ll.print()
print()
ll.addnode(ll.head.next,6)
print()
ll.print()
