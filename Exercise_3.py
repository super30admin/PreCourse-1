class ListNode:
    """
    A node in a singly-linked list.
    """
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

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node
        else:
            curr_node = self.head
            while curr_node.next is not None:
                curr_node = curr_node.next
            curr_node.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        else:
            curr_node = self.head
            while curr_node is not None and curr_node.data != key:
                curr_node = curr_node.next
            if curr_node is None:
                return None
            else:
                return curr_node.data
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        else:
            curr_node = self.head
            prev_node = None
            while curr_node is not None and curr_node.data != key:
                prev_node = curr_node
                curr_node = curr_node.next
            if curr_node is None:
                return None
            elif prev_node is None and curr_node is self.head:
                self.head = self.head.next
            else:
                prev_node.next = curr_node.next
            curr_node = None


# 
# a = SinglyLinkedList()
# a.append(9)
# a.append(7)
# a.append(3)
# a.append(4)
# curr_node = a.head
# while curr_node is not None:
#     print(curr_node.data, end = '->')
#     curr_node = curr_node.next
#
# print("\n", a.find(2))
# print(a.find(9))
# print(a.find(4))
#
# a.remove(4)
# print(a.find(4))
# a.remove(9)
# curr_node = a.head
# while curr_node is not None:
#     print(curr_node.data, end = '->')
#     curr_node = curr_node.next

