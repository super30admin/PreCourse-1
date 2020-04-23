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
            self.head = ListNode(data)
            print(self.head.data)
        else:
            curr =self.head
            while (curr.next != None):
                curr = curr.next
            curr.next = ListNode(data)
            print (curr.next.data)
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        tofind = self.head
        while (tofind !=None):
                if tofind.data == key:
                    return ("element found: ",tofind.data)
                tofind = tofind.next
        return (None)
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr = self.head
        prev = None
        if curr==None:
            if curr.data == key:
                self.head = curr.next
        else:
            while (curr!=None):
                if curr.data == key:
                    break
                prev = curr
                curr = curr.next
            prev.next = curr.next
        

a = SinglyLinkedList()    
a.append(4)
a.append(2)
a.append(3)
a.append(1)
k=a.find(3)
print(k)
k=a.find(6)
print(k)
t=a.remove(3)
print(t)
k=a.find(3)
print(k)