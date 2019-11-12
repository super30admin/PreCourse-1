class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = Node(None)


    def create(self, data):
        node = Node(data)
        if self.head.data == None:
            self.head = node
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = node


    def insert(self, data, location):
        node = Node(data)
        if location == 0:
            node.next = self.head
            self.head = node
        else:
            current = self.head
            for _ in range(1, location):
                current = current.next
            node.next = current.next
            current.next = node


    def traversal(self):
        current = self.head
        while current:
            print(current.data)
            current = current.next


    def search(self, value):
        current = self.head
        while current:
            if current.data == value:
                return True
            current = current.next
        return False


    def deleteNode(self, location):
        if location == 0:
            self.head = self.head.next
        else:
            current = self.head
            for _ in range(1, location):
                current = current.next
            current.next = current.next.next


ll = LinkedList()
ll.create(10)
ll.create(20)
ll.create(30)
ll.insert(5, 0)
ll.insert(25, 3)
print(ll.search(5))
print(ll.search(15))
ll.deleteNode(0)
ll.traversal()