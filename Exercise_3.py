#Time Complexity: O(n)
#Space-Complexity: o(n)

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
        node = ListNode(data)
        current=self.head
        if self.head is None:
            self.head = node
        
        else:
            while current.next!=None:
                current=current.next   
            current.next=node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        else:
            current = self.head
            while current is not None:
                if current.data==key:
                    return current.data
                else:
                    current = current.next

            return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        previous = None
        while current!=None:
            if current.data==key:
                if current==self.head:
                    self.head=self.head.next
                    current = self.head
                else:
                    previous.next=current.next
                    current=current.next
            else:
                previous=current
                current=current.next

        if current==None:
            return self.head

        return self.head

            
    def show(self):
            current = self.head
            while current!=None:
                print(current.data)
                current=current.next

linked_list = SinglyLinkedList()
linked_list.append(2)
linked_list.append(3)
linked_list.show()
print(linked_list.find(4))
linked_list.remove(3)
print(linked_list.find(3))
linked_list.show()