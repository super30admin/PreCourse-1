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
        print ( "appending data ", data)
        node = ListNode( data )
        if ( self.head == None ):
            self.head = node
        else:
            ptr = self.head
            while ( ptr.next is not None ):
                ptr = ptr.next
            ptr.next = node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        print ( "find ", key )
        ptr = self.head
        while ( ptr is not None and ptr.data != key ):
            ptr = ptr.next
        if ( ptr is None ):
            return None
        else:
            return ptr


    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        ptr = self.head

        # Check if the key is the head ptr
        if ( ptr and ptr.data == key ):
            self.head = ptr.next
            return

        # Iterate the linked list and check for the data
        while ( ptr.next is not None and ptr.next.data != key ):
            ptr = ptr.next
        if ( ptr is None ):
            return None
        else:
            ptr.next = ptr.next.next


a = SinglyLinkedList()
a.append(1)
a.append(2)
a.append(3)
a.remove(2)
a.append(4)
b = a.find(4)
print ("Found ", b.data )
a.remove(1)
a.remove(4)
a.remove(3)
a.find(3)
