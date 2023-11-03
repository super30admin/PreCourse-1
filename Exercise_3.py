# Time Complexity was already mentioned in each function. Below is further elaboration if needed.
# Creation of Singly LinkedList here is an efficient Big O(1) operation since one can define the ListNode object in constant time.
# Appending to the LinkedList here is an in-efficient Big O(n) operation since one needs to first traverse through the list, identify the tail pointer and then append the next node to it.
# Finding a key value here is an in-efficient Big O(n) operation since one needs to traverse through the list to match the passed value.
# Removing a key value here is an in-efficient Big O(n) operation since one needs to traverse through the list to match the passed value to be removed.

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
        current = head
        while current:
            if current.next is None:    # To set the tail pointer in the Linked List.
                tail = current
            current = current.next

        tail.next = data                # Append argument ListNode data to the tail pointer to add to end of list.
        return head

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = head
        value = None                    # Set default return value as None.
        while current:
            if current.data == key:     # Compare key to each looped value in LinkedList.
                value = current.data
                break
            current = current.next
        return value

    def remove(self, head, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if head is not None and head.data == key:       # Check if passed key value is at the head of the list.
            head = head.next                            # Modify the list to make the the 2nd ListNode as the head.
            return head

        current = head
        while current.next is not None:                 # Check if passed key value is after the head of the list by looping over the next ListNodes.
            if current.next.data == key:                
                current.next = current.next.next        # Modify the list to make the ListNode after the node object that wil be removed as the next node object in the list.
                break
            current = current.next
        return head