
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
        if self.head is None:
            self.head = ListNode(data)
        else:
            tmp = self.head
            while tmp.next:
                tmp = tmp.next
            tmp.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        tmp = self.head
        while tmp:
            if tmp.data == key:
                return tmp
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        
        if self.head:
            if self.head.data == key:
                self.head = self.head.next
            else:
                tmp = self.head
                while tmp.next:
                    if tmp.next.data == key:
                        tmp.next = tmp.next.next
                        break
                    else:
                        tmp = tmp.next
        else:
            return 'stack is empty'
                    
    def display(self):
        tmp = self.head
        while tmp:
            print(tmp.data)
            tmp = tmp.next
            

l = SinglyLinkedList()
l.append(1)
l.append(2)
l.append(3)
l.append(4)
l.append(2)
l.append(1)
l.display()
l.remove(4)
l.remove(2)
l.remove(1)

print('---------------')
l.display()




