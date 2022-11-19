class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        print("I am in the init function")
        self.data = data
        self.next = next
    
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
        print("I am in the append function")
        if self.head is None: 
            self.head = ListNode(data)
            return
        current = self.head
        while current.next is not None:
            current = current.next 
        current.next = ListNode(data)

    def find(self, key):
        print("I am in the find function")
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        current = self.head
        position = 0
        while current is not None:
            position+=1
            if current.data == key:
                return "The key is present at the {} position".format(position)
            current = current.next
        return None
        
    def remove(self, key):
        print("I am in the remove function")
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        if current is None:
            return
        if current.data == key:
            self.head = current.next 
            del current
            return
        previous = None
        while current.next is not None:
            if current.data == key:
                previous.next = current.next
                del current
                return
            current = current.next
            previous = current
        return None

linkedlistObject = SinglyLinkedList()
linkedlistObject.append(2)
linkedlistObject.append(2)
print(linkedlistObject.find(2))
linkedlistObject.remove(2)
print(linkedlistObject.find(2))
linkedlistObject.remove(2)
print(linkedlistObject.find(2))

