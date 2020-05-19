class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data, next):
        self.data = data
        self.next = next

class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None
        self.tail = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        # Append takes O(1) time.
        toAdd = ListNode(data, None)
        if self.head == None:
            self.head = toAdd
            self.tail = toAdd
        else:
            self.tail.next = toAdd
            self.tail = toAdd
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        toReturn = None
        curr = self.head
        while not curr == None:
            if curr.data == key:
                toReturn = curr
                break
            curr = curr.next
        return toReturn

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr = self.head
        prev = None
        while not curr == None:
            if curr.data == key:
                break
            prev = curr
            curr = curr.next

        if not curr == None:
            if prev == None:
                self.head = curr.next
            else:
                prev.next = curr.next
                if curr.next == None:
                    self.tail = prev

l = SinglyLinkedList()
for i in range(0,10):
    l.append(i)

print(l.find(6).data)
print(l.find(100))

l.remove(9)
print l.tail.data
l.append(10)

l.remove(100)

print l.head.data
l.remove(l.head.data)
print l.head.data

print "-------"
curr = l.head
while not curr == None:
    print curr.data
    curr = curr.next
