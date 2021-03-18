class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data):
        self.data=data
        self.next=None
    
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
        new_node=ListNode(data)
        if self.head is None:
            self.head=new_node
        else:
            n=self.head
            while n.next is not  None:
                n =n.next
            n.next=new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            print("empty list")
            return
        n=self.head
        while n.next is not None:
            if key ==n.next.data:
                break
            n=n.next
        if n.next is None:
            print("Node not found")
        else:
            return n.next.data

        
    def remove(self, key):
        if self.head is None:
            print("empty list")
            return
        if (key ==self.head.data):
            self.head=self.head.next
            return
        n=self.head
        while n.next is not None:
            if key ==n.next.data:
                break
            n=n.next
        if n.next is None:
            print("Node not found")
        else:
            n.next=n.next.next
        

        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """


test =SinglyLinkedList()
test.append(56)
test.append(57)
test.append(58)
test.remove(57)
test.remove(57)