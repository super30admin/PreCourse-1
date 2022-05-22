"""
Leetcode: NA
TC/SC: see below
Challenge: remove() was challenging because it required to think about the position of the node matching the key.
"""

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
    
class SinglyLinkedList:
    # TC - O(1), SC- O(1)
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    # TC - O(N), SC- O(1)
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head is None:
            self.head = ListNode(data)
        else:
            # append to last !None element in LL
            curr = self.head
            while curr.next:
                curr = curr.next

            curr.next = ListNode(data)

    # TC - O(N), SC- O(1)
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr:
            if curr.data == key:
                return curr
            curr = curr.next

        return None

    # TC - O(N), SC- O(1)
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev, curr = None, self.head
        while curr:
            if curr.data == key:
                # change prev next to key's next
                if prev:
                    prev.next = curr.next
                # if no prev, change head.
                else:
                    self.head = curr.next
            prev = curr
            curr = curr.next

    #   print LL
    def show(self):
        res = []
        curr = self.head

        while curr:
            res.append(curr.data)
            curr = curr.next

        print(res)


# sLL = SinglyLinkedList()
# sLL.append(10)
# sLL.append(20)
# sLL.append(30)
# sLL.remove(20)
# sLL.remove(40)
# found = sLL.find(50)
# sLL.show()
