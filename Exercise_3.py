"""
Time and Space complexity for the following methods: 

1) __init__()
Time complexity: O(1)
Space complexity: O(1)

2) append()
Time complexity: O(1)
Space complexity: O(1)

2) find()
Time complexity: O(N)
Space complexity: O(1)

3) remove()
Time complexity: O(N)
Space complexity: O(1)
"""

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
        self.tail = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        """
        newNode = ListNode(data)
        if self.head is None:
            self.head = newNode
            self.tail = newNode
            
        else:
            self.tail.next = newNode
            self.tail = newNode
        print('Node appended',self.tail.data)
        return True

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr is not None:
            if curr.data == key:
                return curr.data
            else:
                curr = curr.next
        return False
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr = self.head
        prev = None
        if curr is None:
            print('LinkedList has no nodes to remove')
            return False
        
        while curr is not None:
            if curr.data == key:
                if prev is None:
                    self.head = curr.next
                    if self.head is  None:
                        self.tail = None
                        return True
                else:
                    prev.next = curr.next
                if curr == self.tail:
                    self.tail = prev
                return True
            
            prev = curr 
            curr = curr.next
        return False 

if __name__ == '__main__':
    linked_list = SinglyLinkedList()
    linked_list.append(10)
    print(linked_list.find(10))
    print(linked_list.find(20))
    print(linked_list.remove(10))
    linked_list.remove(10)
