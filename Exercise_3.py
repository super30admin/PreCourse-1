import copy

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
        if not self.head:
            self.head = ListNode(data)
        else:
            curr = self.head
            while curr:
                if not curr.next:
                    curr.next = ListNode(data)
                    break
                curr = curr.next
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr:
            if curr.data == key:
                return curr.data
            curr = curr.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = None
        curr = self.head
        next = curr.next
        while curr:
            if curr.data == key:
                prev.next = next
                break
            else:
                prev = curr
                curr = curr.next
                next = next.next
        return None

#     def display(self):
#         """
#         Print all elements in order - for debugging purposes.
#         """
#         header = self.head
#         stack = []
#         while header:
#             stack.append(header.data)
#             header = header.next
#         print(stack)


# ## Driver code
# sll = SinglyLinkedList()
# sll.append(111)
# sll.append(122)
# sll.display()
# sll.append(133)
# sll.append(144)
# sll.display()
# print('Found!', sll.find(133))
# print('Found!', sll.find(144))
# sll.remove(144)
# sll.display()
# print('Found!', sll.find(144))