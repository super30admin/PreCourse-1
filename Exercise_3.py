# Time Complexity = o(n)
# Space Complexity = o(n)
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

        if self.head is None:
            self.head = ListNode(data, None)
            return

        itr = self.head
        while itr.next:
            itr = itr.next

        itr.next = ListNode(data, None)

        #Handling the empty list
        #looping till last element and adding node to it's next
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        
    def find(self, key):

        if self.head is None:
            return

        itr = self.head
        while itr:
            if itr.data == key:
                return itr

            itr = itr.next

        # looping and matching the key to data
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
    def remove(self, key):

        if self.head is None:
            return

        if self.head.data == key:
            self.head = self.head.next
            return

        itr = self.head

        while itr.next:
            if itr.next.data == key:
                itr.next = itr.next.next
                break
            itr = itr.next

        # handling the empty and single element separately
        #looping and finding the key and it's prev element to add None to it
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
    def print(self):
        if self.head is None:
            print("Empty Linked List")
        slstr = ''
        itr = self.head
        while itr:
            slstr += str(itr.data)
            itr = itr.next

        print(slstr)

sl = SinglyLinkedList()
sl.append(2)
sl.append(4)
sl.append(5)
sl.append(8)
sl.find(8)
sl.remove(8)
sl.print()
