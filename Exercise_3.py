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

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode = ListNode(data)
        if self.head is None:
            self.head = newNode
            return
        currentNode = self.head
        while currentNode.next:
            currentNode = currentNode.next
        currentNode.next = newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        while currentNode.next and currentNode != key:
            currentNode = currentNode.next
        if currentNode == key:
            return 'Key Found'
        else:
            return 'No key found'
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        currentNode = self.head
        if currentNode.data == key:
            self.head = currentNode.next
            return
        while currentNode.next and currentNode.next.data != key:
            currentNode = currentNode.next
        if currentNode.next.data == key:
            if currentNode.next != None and currentNode.next.next:
                currentNode.next = currentNode.next.next
            else:
                currentNode.next = None
        else:
            print('No key found')

    def traverse(self):
        if self.head is None:
            self.head = newNode
            return
        currentNode = self.head
        while currentNode.next:
            print(currentNode.data)
            currentNode = currentNode.next
        print(currentNode.data)


n = SinglyLinkedList()
n.append(1)
n.append(2)
n.append(3)
n.remove(3)
n.remove(1)
