class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None
        self.size = 0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode=ListNode(data)
        if self.head is None:
            self.head=newNode
            self.size +=1
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = newNode

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current.next:
            if current.data == key:
                return 'found' + str(current.data)
            current = current.next
        return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head

        if current is None:
            return

        if current.data == key:
            self.head = current.next
            current = None
            return

        while current.next:
            if current.data == key:
                prev.next = current.next
                current = None
                return

            else:
                prev = current
                current = current.next
        return 'Not found'

    def printLinkedList(self):
        current = self.head
        while current.next:
            print(current.data)
            current = current.next
        print(current.data)


S = SinglyLinkedList()
S.append(4)
S.append(6)
S.append(9)
print(S.find(6))
S.printLinkedList()
print("test2")
S.remove(6)
S.printLinkedList()
print("test3")
S.remove(4)
S.printLinkedList()



