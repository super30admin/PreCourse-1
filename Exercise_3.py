# Exercise_3 : Implement Singly Linked List.

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : N/A
# Any problem you faced while coding this : thinking of edge cases

# Your code here along with comments explaining your approach

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
        # if head is none, means there is no linked list yet. So create a new node with passed data and point head to it
        if self.head is None:
            self.head = ListNode(data)
        curr = self.head
        # if head is not none, there is atleast one node already present.
        # Until curr.next is not none, keep forwarding curr pointer.
        # Append a new node whenever curr.next is None meaning its the end of the list
        while curr.next is not None:
            curr = curr.next
        curr.next = ListNode(data)
        return curr.next.data

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # if head is none, means there is no linked list yet. So return none
        if self.head is None:
            return None
        curr = self.head
        # Forward curr pointer until you find that curr.data equals the asked key.
        while curr.next is not None:
            curr = curr.next
            if curr.data == key:
                return curr
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # if head is none, means there is no linked list yet. So return none
        if self.head is None:
            return None
        # if the element to be removed is at head itself, forward head to the next node
        if self.head.data == key:
            self.head = self.head.next
            return
        curr = self.head
        # else - keep forwarding curr until you find that curr.next.data equals the key
        while curr.next is not None:
            if curr.next.data == key:
                curr.next = curr.next.next
                return
            curr = curr.next
        return None

    # print linked list for understanding purpose
    def printList(self):
        if self.head is None:
            print("Empty linked list")
            return
        curr = self.head
        while curr.next is not None:
            print(curr.next.data)
            curr = curr.next


l_list = SinglyLinkedList()

l_list.append(5)
l_list.append(2)
l_list.append(3)
l_list.printList()

print('Found element: ', l_list.find(3).data)

l_list.remove(2)
l_list.printList()
