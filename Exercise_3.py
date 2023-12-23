# Time Complexity Of append, find, remove operation is O(n), as we need to iterate the Linkedlist.
# Space complexity is O(1)
# Did this code successfully run on Leetcode : This run sucessfully on my vscode
# Any problem you faced while coding this : No, I did not face any problem while coding this
# Utilited the ListNode class, for the append, and find operations, iterated towards the end to peform the operation of add a new node to the end of linkedlist or removing from the end of linked list.


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
        nn = ListNode(data)
        curr = self.head
        if self.head is None:
            self.head = nn
            return
        while curr.next is not None:
            curr = curr.next
        curr.next = nn
        return
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr is not None:
            if curr.data == key:
                return curr
            curr = curr.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return
        prev = None
        curr = self.head
        while curr is not None:
            if curr.data == key:
                if prev:
                    prev.next = curr.next
                else:
                    self.head = curr.next
            prev = curr
            curr = curr.next

    def printLinkedList(self):
        print("printing Linked List")
        curr = self.head
        while curr is not None:
            print(curr.data)
            curr = curr.next


            
ll = SinglyLinkedList()
ll.append(1)
ll.printLinkedList()
ll.append(2)
ll.printLinkedList()
ll.append(3)
ll.printLinkedList()
ll.remove(3)
ll.printLinkedList()
ll.remove(1)
ll.printLinkedList()



           
            
            
            
            
            

