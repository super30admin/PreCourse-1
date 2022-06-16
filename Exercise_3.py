# Any problem you faced while coding this : Unable to return the removed node

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
        new = ListNode(data)
        if self.head:                           #checks if there's a head, if true then it traverses at the end and adds the new node. Else, makes the new node head 
            while self.head.next:
                self.head = self.head.next
            self.head.next = new
        else:
            self.head = new        

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        tmp = self.head                        # to create an instance
        while tmp:                       # traverses the list while there is a head.
            if tmp.data == key:
                return key
            else:
                tmp = tmp.next
        return None            
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        tmp = self.head
        if tmp.data == key:
            self.head = self.head.next
        elif tmp.next:
            while tmp.next:                       
                if tmp.next.data == key:
                    tmp.next = tmp.next.next
                    #return key
                    break
                tmp = tmp.next
        else:
            return "Not in the linkedList"  

ll1 = SinglyLinkedList()
ll1.append(1)
ll1.append(2)
ll1.append(4)
ll1.append(8)
print("Searching 4",ll1.find(4))
print("Searching 3",ll1.find(3))
print(ll1.remove(4))
print(ll1.remove(3))