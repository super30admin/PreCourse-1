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
        temp = ListNode(data)
        if(not self.head):
            self.head = temp
        else:
            t = self.head
            while(t.next):
                t = t.next
            t.next = temp


        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        t = self.head
        while(t):
            if(t.data == key):
                return key
            else:
                t = t.next
        return None
    
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = ListNode(0)
        prev.next = self.head
        curr = self.head
        nxt = curr.next

        while(nxt):
            if(key == curr.data):
                prev.next = nxt
                curr.next =  None
                return self.head
            else:
                prev = curr
                curr = nxt
                nxt = nxt.next
        if(key == curr.data):
                prev.next = nxt
                curr.next =  None
                return self.head
        else:
            prev = curr
            curr = nxt
            nxt = nxt.next

l =   SinglyLinkedList()
l.append(10)
l.append(20)
l.append(30)
print(l.find(10))
k = l.remove(20)
print(k)
while(k):
    print(k.data)
    k = k.next



