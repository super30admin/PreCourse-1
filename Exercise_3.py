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
            ptr = self.head
            while ptr.next:
                ptr = ptr.next
            ptr.next = ListNode(data)
            # self.head.next = ListNode(data)
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        ptr = self.head
        while ptr:
            if ptr.data == key:
                return ptr.data
            else:
                ptr = ptr.next
        return None
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        ptr = self.head
        if ptr is not None:
            if ptr.data == key:
                self.head = ptr.next
                ptr = None
                return
        while ptr:
            if ptr.data == key:
                break
            prev = ptr
            ptr = ptr.next
        if not ptr:
            return 
        prev.next = ptr.next
        ptr.next = None

    
#     def show(self):
#         if not self.head:
#             print("Empty list")
#         else:
#             ptr = self.head
#             while ptr:
#                 print(ptr.data)
#                 ptr = ptr.next
        

# l = SinglyLinkedList()
# l.append(5)
# l.append(4)
# l.append(3)
# l.show()
# print(l.find(4))
# l.remove(4)
# l.show()
# l.remove(3)
# l.remove(5)
# l.show()