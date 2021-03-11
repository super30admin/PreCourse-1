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
        self.curr_ptr = self.head

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node
            self.curr_ptr = new_node
        else:
            self.curr_ptr.next = new_node
            self.curr_ptr = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        else:
            ptr = self.head
            while ptr:
                if ptr.data == key:
                    return ptr
                ptr = ptr.next
            return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return
        elif self.head.data == key:
            self.head = self.head.next
        else:
            ptr = self.head
            while ptr.next is not None:
                if ptr.next.data == key:
                    ptr.next = ptr.next.next
                    return
                ptr = ptr.next
            return

    def print_list(self):
        if self.head is None:
            print(None)
        else:
            ptr = self.head
            while ptr:
                print(ptr.data)
                ptr = ptr.next
