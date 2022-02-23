#TIme COmplexity : O(n) -> varies between O(1) and O(n) depending on operation
#Space Complexity : O(n)


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
        node = ListNode()
        node.data = data

        if self.head is not None:
            start = self.head
            while True:
                if start.next is not None:
                    pass
                else:
                    start.next = node
                    break
                start = start.next

        else:
            self.head = node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is not None:
            start = self.head
            if start.data == key:
                return key
            while start.next is not None:
                if start.data != key:
                    pass
                else:
                    return key

                start = start.next

        return None





    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        current = self.head
        if self.head is not None:
            #start = self.head
            while True:
                if current.data != key:
                    pass
                else:
                    current.next = current.next.next
                    return key

                prev = current
                current = current.next
                if current.next == None:
                    break


        return None

#a = SinglyLinkedList()
#print(a.append('2'))
#print(a.append('3'))
#print(a.append('4'))
#print(a.find('2'))
#print(a.remove('3'))





print()
