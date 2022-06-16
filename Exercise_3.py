'''
Exercise_3 : Implement Singly Linked List.

# Author: Neha Doiphode
# Date  : 06-15-2022

# Approach:
    To add a new end of the list: Traverse to the end of the existing list. Update next pointer with the new node's address.

    To find node in the list    : Traverse each node from head, one by one comparing the node.data with the key.
                                  If match found, return the node.data.
                                  else, continue traversing list to the end. If match not found, return None.

    To remove first occurence of key in the list: Use two pointers previous and current to keep track of nodes.
                                                  When current.data matches with the key to remove,
                                                  make use of previous pointer to point to current.next.
                                                  So that, we can remove the current node.

# Time Complexity                            : Please check method doc-strings below.
# Space Complexity                           : O(n), to create a list with n elements.
# Did this code successfully run on Leetcode : Not run on leetcode.
# Any problem you faced while coding this    : Current implementation of remove operation looks a bit cluttered :).
                                               Should be a little more elegant.
'''

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
        if self.head:
            temp = self.head
            while temp.next:
                temp = temp.next
            temp.next = ListNode(data)
        else:
            self.head = ListNode(data)

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head:
            temp = self.head
            while temp.next:
                if temp.data == key:
                    return temp.data
                temp = temp.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head:
            current = self.head
            previous = None
            while current.next:
                if current.data == key:
                    if previous:
                        previous.next = current.next
                    else:
                        self.head = current.next
                        return
                previous = current
                current = current.next

            if current and current.data == key:
                if previous:
                    previous.next = None
                else:
                    self.head = None
        return

    def display(self):
        '''
        Not part of the boilerplate. Added by Neha.
        '''
        if self.head:
            temp = self.head
            while temp.next:
                print(f'{temp.data}->', end = '')
                temp = temp.next
            print(f'{temp.data}', end = '')
        else:
            print('List is empty')
        print()
        print()


'''
Not part of the boilerplate. Added by Neha.
'''
l = SinglyLinkedList()
l.append(10)
l.append(20)
l.append(30)
l.append(20)
l.append(10)
l.append(50)
l.display()
l.remove(10)
l.remove(20)
l.display()
