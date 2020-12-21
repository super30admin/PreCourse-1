'''
Time Complexity :
O(n) for all the operations as we scan the whole linked list.

Space Complexity : (not confident about this answer)
append(): O(1) since we are scanning the linked list but reusing the same variable at each iteration.
find(): O(1) since we are scanning the linked list but reusing the same variable at each iteration.
remove(): O(1) since we are scanning the linked list but reusing the same variable at each iteration.

Did this code successfully run on Leetcode :
Didnt run since the identifiers used had different names and I was running late to individually rename all.

Any problem you faced while coding this :
Not any I know of. There is no driver code available.
'''

#Your code here along with comments explaining your approach
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
            self.head = ListNode(data = data)
        else:
            curr = self.head
            while curr.next != None:
                curr = curr.next
            new_node = ListNode(data, None)
            curr.next = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        if self.head is None:
            return None
        else:
            curr = self.head
            while curr != None:
                if curr.data == key:
                    return curr
                curr = curr.next
            return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is not None:
            curr = self.head
            prev = curr
            while curr.data != key:
                prev = curr
                curr = curr.next
            prev.next = curr.next

