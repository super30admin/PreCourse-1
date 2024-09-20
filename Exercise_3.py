class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data):
        self.data = data
        self.next = None
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None
        self.len = 0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        self.len += 1
        new_node = ListNode(data)
        if self.len == 1:
            self.head = new_node
        else:
            curr = self.head
            while curr.next != None:
                curr = curr.next
            curr.next = new_node
            
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr != None:
            if curr.data == key:
                print("Found")
                return curr
            curr = curr.next
        print("Not Found")
        return None
       
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr = self.head
        prev = self.head
        if curr.data == key:
            self.head = curr.next
            print("Found ", key)
            
        while curr.next != None:
            if curr.next.data == key:
                print("Found ", key)
                curr.next = curr.next.next
            else:
                curr = curr.next
        
    def show(self):
        curr = self.head
        sl = ''
        while curr != None:
            sl = sl + str(curr.data) + ' -> '
            curr = curr.next
        print(sl[0:-4])
