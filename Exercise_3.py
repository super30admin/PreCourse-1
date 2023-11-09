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
        if self.head != None:
            temp = self.head
            while(temp.next != None):
                temp = temp.next
            new_node = ListNode(data,None)
            temp.next = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head != None:
            temp = self.head
            while(temp.next != None):
                if temp.data == key:
                    return temp.data
            return None
        else:
            return None


    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head != None:
            temp = self.head
            prev = None
            while temp != None:
                if temp.data == key:
                    prev.next = temp.next
                else:
                    prev = temp
                    temp = temp.next
