
class Node:

    def __init__(self,data):
        self.data=data
        self.next=None

class LinkedList:
    def __init__(self):
        self.head=None


    def push(self,data):
        newnode=Node(data)
        newnode.next=self.head
        self.head=newnode


    def insertAfter(self,prev,data):
        if prev is None:
            print("Node not available")
            return
        new_node = Node(data)

        # 4. Make next of new Node as next of prev_node
        new_node.next = prev.next

        # 5. make next of prev_node as new_node
        prev.next = new_node

    def append(self,data):
            newnode=Node(data)
            if self.head is None:
                self.head=newnode
            temp=self.head
            while(temp.next):
                temp=temp.next
            temp.next=newnode

    def printlist(self):
        temp=self.head
        while(temp):
            print(temp.data)
            temp=temp.next


if __name__ == '__main__':
    newlist=LinkedList()
    newlist.push(19)
    newlist.push(30)
    newlist.push(79)
    newlist.push(29)
    newlist.printlist()
    newlist.append(100)
    newlist.printlist()


    newlist.insertAfter(newlist.head.next.next,31)
    newlist.printlist()




