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
        new_node = ListNode(data)
        if self.head==None:
            self.head = new_node
        else:
            temp = self.head
            while temp.next:
                temp = temp.next
            temp.next = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while temp.next:
            if(temp.data==key):
                return temp
            temp = temp.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if(self.head.data == key):
            self.head = self.head.next
        else:
            slow = self.head
            fast = slow.next
            while fast.next:
                if(fast.data==key):
                    slow.next = fast.next
                    break
                fast = fast.next
                slow = fast

        return self.head

l =   SinglyLinkedList()
l.append(10)
l.append(20)
l.append(30)
print(l.find(10).data)
print(l.remove(10).data)
