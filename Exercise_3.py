class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.next = next
        self.data = data
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head == None:
            self.head = ListNode(data)
            return True
        iterator = self.head
        while iterator.next:
            iterator = iterator.next
        newNode = ListNode(data) 
        iterator.next = newNode
        return True
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        iterator = self.head
        while iterator:
            if iterator.data == key:
                return iterator
            iterator = iterator.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            return False
        elif self.head.data == key:
            self.head = self.head.next
            return True
        else:
            iterator = self.head
            while iterator.next:
                if iterator.next.data == key:
                    iterator.next = iterator.next.next
                    return True
                iterator = iterator.next
        return False

newLinked = SinglyLinkedList()
newLinked.append(5)
newLinked.append(6)
newLinked.append(7)
newLinked.append(8)
newLinked.append(9)
newLinked.append(10)

x = newLinked.find(7)
print(x.data)
newLinked.remove(7)
y = newLinked.find(7)
print(y)
newLinked.remove(10)
z = newLinked.find(8)
print(z.data)
newLinked.remove(5)
myX = newLinked.head
print('start the printing the linkedlist:')
while myX:
    print(myX.data)
    print(" ")
    myX = myX.next
