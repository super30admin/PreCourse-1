class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=None
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = ListNode('nn')
        self.ptr = self.head
        self.size = 0
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode = ListNode(data)
        self.ptr.next = newNode
        self.ptr = newNode
        self.size += 1
        print("inserted element",self.ptr.data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        currentNode = self.head.next
        while currentNode is not None:
            if currentNode.data == key:
                return currentNode
            currentNode = currentNode.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        prevNode = self.head
        currentNode = self.head.next
        while currentNode is not None:
            if currentNode.data == key:
                prevNode.next = currentNode.next
                if currentNode == self.ptr:
                    self.ptr = prevNode

                del currentNode
                self.size -= 1
                return
            prevNode = currentNode
            currentNode = currentNode.next


s = SinglyLinkedList()
s.append(1)

s.remove(1)


