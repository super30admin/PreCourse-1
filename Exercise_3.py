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
        self.tail = None

#Time complexity 0(1)
#Space complexity 0(n)
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode = ListNode(data)
        if self.head == None:
            self.head = newNode
            self.tail = newNode
        else:
            self.tail.next = newNode
            self.tail = newNode
        print("New node added", self.tail.data)

#Time complexity 0(n)
#Space complexity 0(1)
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr != None and curr.data != key:
            curr = curr.next
        if curr != None:
            print("Node found",key)
            return curr
        else:
            print("Node not found")
            return None

#Time complexity 0(n)
#Space complexity 0(1)
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = None
        curr = self.head
        while curr != None and curr.data != key:
            prev = curr
            curr = curr.next
        if curr == None:
            print("Node not found to be removed")
            return
        if prev == None:
            self.head = curr.next
            print("Node remove but head is", self.head.data)
            return self.head
        else:
            prev.next = curr.next
            print("Node removed but head is", self.head.data)
            return
        

alinkedlist = SinglyLinkedList()
alinkedlist.append(1)
alinkedlist.append(2)
alinkedlist.append(3)
alinkedlist.append(4)
alinkedlist.find(4)
alinkedlist.remove(4)
