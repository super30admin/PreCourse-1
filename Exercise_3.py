# Time Complexity : See comments
# Space Complexity : O(N) where N is total elements pushed
# Any problem you faced while coding this : no


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

    def append(self, data): # O(n)
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head is None:
            self.head = ListNode(data)
        else:
            p = self.head
            while p.next is not None:
                p = p.next
            p.next = ListNode(data)

        return self.head
        
    def find(self, key): # O(n)
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        p = self.head
        while p is not None and p.data != key:
            p = p.next
        return p
        
    def remove(self, key): # O(n)
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return
        if self.head.data == key:
            self.head = self.head.next
            return

        p = self.head
        while p.next is not None and p.next.data != key:
            p = p.next
        
        p.next = p.next.next

    def print(self): # O(n)
        p = self.head
        ll = []
        while p is not None:
            ll.append(str(p.data))
            p = p.next
        
        print(" -> ".join(ll))




llist = SinglyLinkedList()
llist.append(1)
llist.append(2)
llist.append(4)
llist.append(6)
print("find 4", llist.find(4))
print("find 14", llist.find(14))
llist.print()

print("remove 2 ")
llist.remove(2)
llist.print()

print("remove 1 ")
llist.remove(1)
llist.print()

print("remove 6 ")
llist.remove(6)
llist.print()

print("remove 4 ")
llist.remove(4)
llist.print()





