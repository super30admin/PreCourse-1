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
        self.size = 0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head == None:
            self.head = ListNode(data)
        else:
            temp = self.head
            while(temp.next!=None):
                temp = temp.next
            temp.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        temp = self.head
        while(temp!=None):
            if(temp.data == key):
                return temp
            temp=temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        temp = self.head
        while(temp.next!=None):
            if(temp.next.data == key):
                nodeDelete = temp.next
                temp.next = temp.next.next
                del nodeDelete
                return True
                
            temp = temp.next
        return False

ss = SinglyLinkedList()
print(ss.append(10))
print(ss.append(20))
print(ss.append(30))
print(ss.append(40))
print(ss.find(20))
print(ss.find(50))
print(ss.remove(20))
print(ss.find(20))

