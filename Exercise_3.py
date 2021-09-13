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
        append a new element at the end of the list.
        Takes O(n) time.
        """
        node = ListNode(data)
        if self.head is None:
            self.head = node
        else:
            temp=self.head      
            while temp.next is not None:
                temp=temp.next
            temp.next=node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp=self.head
        while temp:
            if temp.data==key:
                return temp.data
            temp=temp.next
        return None
        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp=self.head
        while temp and temp.next:
            if temp.next.data==key:
                temp.next=temp.next.next
            temp=temp.next

    def printList(self):
        temp=self.head
        while temp:
            print(temp.data)
            temp=temp.next

list=SinglyLinkedList()
list.append(1) 
list.append(2) 
list.append(3) 
list.append(4) 
list.append(5) 
list.printList()
print("found ",list.find(3))
list.remove(3)
list.printList()
