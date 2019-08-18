class Node(object):

    def __init__(self, data=None, next_node=None):
        self.data = data
        self.next_node = next_node

    def getNode(self):
        return self.data

    def nextNode(self):
        return self.next_node

    def setNext(self, new_next):
        self.next_node = new_next

class LinkedList(object):
    def __init__(self, head=None):
        self.head = head
    
    def insert(self, data):
        new_node = Node(data)
        new_node.setNext(self.head)
        self.head = new_node

    def size(self):
        current = self.head
        count = 0
        while current:
            count += 1
            current = current.nextNode()
        return count

    def search(self, data):
        current = self.head
        found = False
        while current and found is False:
            if current.getNode() == data:
                found = True
            else:
                current = current.nextNode()
        if current is None:
            raise ValueError("Data not in list")
        return current
    
    def delete(self, data):
        current = self.head
        previous = None
        found = False
        while current and found is False:
            if current.getNode() == data:
                found = True
            else:
                previous = current
                current = current.nextNode()
        if current is None:
            raise ValueError("Data not in list")
        if previous is None:
            self.head = current.nextNode()
        else:
            previous.setNext(current.nextNode())

LL = LinkedList()
LL.insert(1)
LL.insert(2)
LL.insert(3)
print LL.size()
print LL.search(3)
LL.delete(1)
print LL.size()