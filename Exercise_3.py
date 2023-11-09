# Time complexity: O(n)
# Space complexity: O(n)

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
        new_node= ListNode(data)
        new_node.next=self.head
        self.head=new_node
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        
    def find(self, key):
        curr=self.head
        position=0
        while curr:
            if curr.data == key:
                return position
            curr=curr.next
            position +=1
        return -1    
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
    def remove(self, key):
        if key<=0 or self.is_Empty():
            return self.remove_begining()
        elif key  >= self.get_length():
            return self.remove_end()
        else:
            curr=self.hand
            for _ in range(key-1):
                curr=curr.next
                remove_data =curr.next.data
                curr.next=curr.next.next
                return remove_data

        
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
