#Author: Henil Doshi

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
        self.head = ListNode()

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        node = ListNode(data)
        temp = self.head
        while temp:
            if temp.next == None:
                temp.next = node
                break
            temp = temp.next
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head.next
        while temp:
            if temp.data == key:
                return temp.data
            temp = temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.next == None:
            return None
        prev = self.head
        temp = self.head.next
        while temp:
            if temp.data == key:
                prev.next = temp.next
            temp = temp.next
            prev = prev.next
            
    def printList(self):
        temp = self.head.next
        while temp:
            print(temp.data, end = "-")
            temp = temp.next
        print("\n")

sll = SinglyLinkedList()
sll.append(1)
sll.printList()
sll.append(2)
sll.printList()
sll.append(6)
sll.printList()
sll.append(5)
sll.printList()
sll.append(1)
sll.printList()
sll.append(2)
sll.printList()
print(sll.find(1))
print(sll.find(4))
sll.remove(2)
sll.printList()

