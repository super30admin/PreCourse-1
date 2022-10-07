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
        if self.head == None:
            self.head = ListNode(data, None)
            return 
        temp = self.head
        while temp.next != None:
            temp = temp.next
        temp.next = ListNode(data, None)
        return
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        
        temp = self.head
        while temp != None:
            if temp.data == key:
                return key
            temp = temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        curr = self.head
        prev = None
        while curr != None:
            if curr.data == key:
                if prev == None:
                    self.head = self.head.next
                else:
                    prev.next = curr.next
                return key
            prev = curr   
            curr = curr.next
        return None

s = SinglyLinkedList()
print(s.find(10))
s.append(10)
s.append(20)
s.append(30)
print(s.remove(10))
print(s.remove(20))
print(s.remove(30))
print(s.remove(30))
print(s.find(20))
print(s.find(39))
