from Exercise_2 import Node


class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
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
        new_node=Node(data)
        new_node.next=self.head
        self.head=new_node

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current=self.head
        while current is not None:
            if current.data==key:
                return True
            current=current.next
        return False
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current=self.head
        prev_node=None
        while current.value != key:
            prev_node=current
            current=current.next
            prev_node.next=current.next

s3=SinglyLinkedList()
s3.append(10)
s3.append(20)
s3.append(30)
s3.append(40)
s3.append(50)
s3.find(30)
s3.remove(20)
print(SinglyLinkedList)

