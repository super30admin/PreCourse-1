class Node:

    def __init__(self, data):
       self.data = data
       self.next = None

class singleLinkedList:

    def __init__(self):
        self.head = None

    def insert(self,data):
        n = Node(data)
        if self.head == None:
            self.head = n
        else:
            prev_node = self.traverse()
            prev_node.next = n

    def traverse(self):
        curr = self.head
        while curr.next is not None:
            curr = curr.next
        return curr


    def printList(self):
        curr = self.head
        if curr is None:
            print("The list is empty. ")
        else:
            print("The items in the list are : ")
            while curr is not None:
                print(curr.data)
                curr = curr.next

s = singleLinkedList()
s.printList()
s.insert(3)
s.insert(4)
s.printList()
