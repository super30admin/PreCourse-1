class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
    
class SinglyLinkedList:

    # Initializes the head of the linked list
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
        # Checks if the linked list contains atleast one node
        if self.head:
            currNode = self.head # Sets the current node to point to the head node
            # Iterates until it finds the tail of the linked list
            while currNode.next:
                currNode = currNode.next
            currNode.next = newNode # Sets the next pointer of the tail to point to the new node
        else:
            self.head = newNode # Sets the head of the empty linked list to point to the new node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # Checks if the linked list contains atleast one node
        if self.head:
            currNode = self.head # Assigns currNode to the head of the linked list
            while currNode:
                # Checks if the data of the current node matches the given key
                if currNode.data == key:
                    return currNode
                currNode = currNode.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head:
            prevNode = None
            currNode = self.head # Assigns currNode to point to the head of the linked list
            while currNode:
                nextNode = currNode.next if currNode.next else None
                # Checks if the data of the current node matches the given key
                if currNode.data == key:
                    if not prevNode:
                        self.head = nextNode
                        return
                    else:
                        prevNode.next = nextNode
                        return
                prevNode = currNode
                currNode = nextNode
            self.head = None
        return "Key is not present in the list!"