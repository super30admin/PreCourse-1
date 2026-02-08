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
        self.head = ListNode()
        

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode = ListNode(data)
        self.last.next.next = newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        tmpNode = ListNode(None, self.head)
        while tmpNode.next != None:
            if tmpNode.next.data == key:
                return tmpNode.next
            tmpNode.next = tmpNode.next.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        prevNode = ListNode(None, self.head)
        currNode = ListNode(None, self.head.next)
        while currNode.next != None:
            if currNode.next.data == key:
                prevNode.next.next = currNode.next.next
                break
            else:
                prevNode.next = currNode.next
                currNode.next = currNode.next.next
        return