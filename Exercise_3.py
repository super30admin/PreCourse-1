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
        curr_node = self.head
        if not curr_node:
            self.head = ListNode(data)
        else:
            while curr_node.next is not None:
                curr_node = curr_node.next
            curr_node.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        if not curr:
            return None
        else:
            while curr!=None:
                if curr.data == key:
                    return curr.data
                curr = curr.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = self.head
        curr = prev.next

        while curr:
            if curr.data == key:
                prev.next = curr.next
                curr.next = None
            prev = prev.next
            curr = curr.next

    def isempty(self):
        if self.head == None:
            return True
        else:
            return False

    def display(self):
        iternode = self.head
        arr = []
        if self.isempty():
            print("Stack Underflow")

        else:
            while (iternode != None):
                arr+=[iternode.data]
                iternode = iternode.next
        return arr

llist = SinglyLinkedList()
llist.head = ListNode(5)
llist.head.next = ListNode(6)
llist.head.next.next = ListNode(7)

llist.append(8)
print(llist.display())

print(llist.find(7))
print(llist.find(9))

llist.remove(6)
print(llist.display())



