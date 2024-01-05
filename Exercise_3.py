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
        if self.head is None:
            self.head = ListNode(data)
        else:
            curr_ptr = self.head
            while curr_ptr.next is not None:
                curr_ptr = curr_ptr.next
            curr_ptr.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return IndexError("Empty List Can't search for any key")
        else:
            curr_ptr = self.head
            while curr_ptr is not None:
                if curr_ptr.data == key:
                    return curr_ptr.data
                curr_ptr = curr_ptr.next
            return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return IndexError("Empty List Can't remove  any key")
        else:
            if self.head.data == key:
                self.head = self.head.next
            else:
                curr_ptr = self.head
                while curr_ptr.next is not None:
                    if curr_ptr.next.data == key:
                        curr_ptr.next = curr_ptr.next.next
                    curr_ptr = curr_ptr.next

s = SinglyLinkedList()
print(s.find('1'))
s.append('1')
s.append('2')
print(s.find('2'))
print(s.remove('1'))
s.append('3')
print(s.find('2'))
print(s.remove('2'))
print(s.find('3'))
print(s.remove('3'))
print(s.find('6'))
