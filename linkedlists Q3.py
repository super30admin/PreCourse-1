
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
        temp = self.head
        while temp.next is not None:
            temp = temp.next
        new_node = ListNode(data)
        temp.next = new_node


    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        count = 0
        while temp.data == key and temp.next is not None:
            count = count + 1
            temp = temp.next
        temp = temp.next
        if temp.data == key:
            print('found at location' ,coun t +1)
        else:
            print('Not found')

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
    def display(self):
        temp = self.head
        while temp:
            print(temp.data ,'--->' ,end='')
            temp = temp.next