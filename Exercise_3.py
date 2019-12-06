class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = Node(None)


    def create(self, data):
        """
        Create a new node with data as data
        If head is none, point head to new node
        Else point current to head, iterate till the last node and set the last node's next as new node
        """
        node = Node(data)
        if self.head.data == None:
            self.head = node
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = node


    def insert(self, data, location):
        """
        Create a new node with data as data
        If location is 0, point node.next to earlier head and change the head to new node
        Else iterate till the location, set the new node's next as current node's next and point the current node's next to new node
        """
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
        """
        Set current at head and print while iterating till current is not none
        """
        current = self.head
        while current:
            print(current.data)
            current = current.next


    def search(self, value):
        """
        Iterate like traversal and check whether the node value is equal to target value
        """
        current = self.head
        while current:
            if current.data == value:
                return True
            current = current.next
        return False


    def deleteNode(self, location):
        """
        If location is 0, set the head to dead.next, garbage collector will remove the node because nothing points to it
        Else iterate till the location and change the next value of the node to node's next.next
        """
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