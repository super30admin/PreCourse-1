class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    
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
        curr = self.head
        if not curr.data:
            self.head = ListNode(data)
        else:
            while curr.next:
                curr = curr.next
            curr.next=ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if not self.head.data:
            return None
        curr = self.head
        while curr:
            if curr.data==key: return key
            curr=curr.next

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if not self.head.data:
            return
        if self.head.data == key:
            self.head = self.head.next

        curr = self.head
        prev = None
        while curr:
            if curr.data == key:
                prev.next = curr.next
                break
            prev=curr
            curr=curr.next

    def print(self):
        if not self.head: return None
        curr = self.head
        res = []
        while curr:
            res.append(curr.data)
            curr = curr.next
        print("Printing the list")
        print(res)

stackA = SinglyLinkedList()
stackA.head = ListNode()
stackA.remove(10)
stackA.find(2)
stackA.append(1)
stackA.print()
stackA.append(2)
stackA.print()
stackA.append(3)
stackA.print()
stackA.remove(1)
stackA.print()
stackA.append(4)
stackA.print()
stackA.remove(3)
stackA.print()
stackA.append(5)
stackA.print()
stackA.remove(5)
stackA.print()
