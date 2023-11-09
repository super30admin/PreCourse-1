# Time complexity : O(n)
# Space complexity : O(1)

class ListNode:
    """
    A node in a singly-linked list.
    """
    # Create a node
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None


    #  Insert push elements to stack at the end where the traversing takes o(n)
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head == None:
            self.head = ListNode(data)
            return

        else:
            traverse = self.head
            while(traverse.next):
                traverse = traverse.next

            traverse.next = ListNode(data)

    # finding if the key is present in the stack
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return None

        else:
            while (self.head.next):
                if self.head.data == key:
                    return key
                self.head = self.head.next
        
    # Pop element from the stack unitil no element is left in the stack
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            return None

        else:
            # popNode = self.head

            while (self.head.next):
                self.head = self.head.next
            self.head.next = None
            return self.head.data
