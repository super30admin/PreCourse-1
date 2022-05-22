'''
Time Complexity: O(n) for all operations
Space Complexity: O(n) where n is number of elements
Problems: To implement a singly linked list
'''

'''
Program to implement singly
linked list
'''

'''
Class ListNode
to initialize a
node in the list
'''
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
    
'''
Class to implement
singly linked list
'''
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
        node = ListNode(data)
        curr = self.head
        if curr != None:
            while curr.next != None:
                curr = curr.next
            curr.next = node
        else:
            self.head = node


        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr != None:
            if curr.data == key:
                return True
            curr = curr.next
        return False
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr = self.head
        if curr != None:
            while curr.next != None:
                if curr.next.data == key:
                    curr.next = curr.next.next
                    return 'Node deleted'
                curr = curr.next
            return 'Node not found'
        else:
            return 'Cannot delete from empty list'

s = SinglyLinkedList()
s.append(1)
s.append(2)
print(s.remove(3))
print(s.find(3))