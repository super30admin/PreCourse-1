class Node:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.start = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        node = Node(data)
        if self.start == None:
            self.start = node
        else:
            var = self.start
            while var.next != None:
                var = var.next
            var.next=node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        var = self.start
        f=0
        while var.next != None:
            if var.data==key:
                f=1
            var = var.next
        if f==0:
            return "Element not found"
        return "Element found"
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        var = self.start
        f=0
        while var.next != None:
            if var.data==key:
                f=1
                var.next=var.next.next
                return 1
            var = var.next
        if f==0:
            return 0

LL = SinglyLinkedList()
LL.append(1)
LL.append(2)
LL.append(3)
print(LL.find(2))
print(LL.find(4))
if LL.remove(2)==0:
    print("Element not found")
else:
    print("Element removed")
print(LL.find(2))