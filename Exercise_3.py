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

        if not self.head:
            self.head = node
            return

        top = self.head
        while top.next != None:
            top = top.next
            
        top.next = node

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        top = self.head
        while top != None:
            if top.data == key:
                return top.data
            top = top.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head

        if temp.data == key:
            self.head = temp.next
            return
        
        temp = temp.next
        prev = self.head
        
        while temp!=None:
            if temp.data == key:
                temp = temp.next
                prev.next = temp
                return
            
            prev = temp
            temp = temp.next

            
        return None


    def print(self):

        top = self.head
        while top!=None:
            print(top.data)
            top = top.next


sl = SinglyLinkedList()
sl.append(1)
sl.append(2)
sl.append(3)
sl.remove(1)
sl.print()