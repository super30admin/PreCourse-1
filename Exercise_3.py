# Time complexity: O(n) where n is the number of elements being added to the list
# Space complexity: O(n)

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
        # if the list is empty: assign the head pointer to the newly added element
        newNode = ListNode(data)
        if self.head == None:
            self.head = newNode
        else:
            # otherwise traverse the linked list till the last node and then insert the element
            cur = self.head
            while cur:
                cur = cur.next
            cur.next = newNode
        return self.head

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # If the list is empty: return None and terminate the find operation
        if not self.head:
            return None
        # otherwise, use a temp pointer to head, traverse until either we find the key or we exhaust the list
        cur = self.head
        while cur and cur.data != key:
            cur = cur.next
        # if key is found then cur is not None and we can return the data otherwise we return None
        if cur:
            return cur.data
        else:
            return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # If list is empty: terminate the remove operation and return None
        if not self.head:
            return None
        # Use a temp pointer to keep track of the previous node and then traverse the list using cur pointer until either we find the element we want to remove or we exhaust the list
        prev, cur = None, self.head
        while cur and cur.data != key:
            prev = cur
            cur = cur.next
        # If key is found, point the prev pointer to cur's next otherwise just return the list without any removal
        if cur:
            prev.next = cur.next
        return self.head
