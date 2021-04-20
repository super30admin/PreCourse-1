class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next_ptr=None):
        self.data = data
        self.next = next_ptr
    
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
        node = self.head
        prev = node
        while node:
            prev = node
            node = node.next
        if prev:
            prev.next = ListNode(data)
        else:
            self.head = ListNode(data)
    
    def insert_after(self, key, data):
        node = self.head
        prev = node
        """
        1 2 4
        n
        """
        if node.data == key:
            nextNode = node.next
            node.next = ListNode(data)
            node.next.next = nextNode
            return
        """
        1 2 3 4
          p n
        """
        while node:
            if prev.data == key:
                prev.next = ListNode(data)
                prev.next.next = node
                return
            prev = node
            node = node.next
        """
        1 2 3 4
              p n
        """
        if prev:
            if prev.data == key:
                prev.next = ListNode(data)
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        node = self.head
        while node:
            if node.data == key:
                return node
            node = node.next
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        node = self.head
        """
        if key is at the beginning
        1 2 3 4 -> 1 2 4
        n            h
        """
        if node.data == key:
            self.head = node.next
        prev = node
        node = node.next
        """
        if key is at the middle
        1 2 3 4 -> 1 2 4
          p n        p
        """
        while node.next:
            if node.data == key:
                prev.next = node.next
                return
            prev = node
            node = node.next
        """
        if key is at the end
        1 2 3 4
            p n
        """
        if node.data == key:
            prev.next = node.next

    
    def show(self):
        sll = []
        node = self.head
        while node:
            sll.append(node.data)
            node = node.next
        return sll

def print_data(node):
    if node:
        print(node.data)
    else:
        print("Not found")
s = SinglyLinkedList()
s.append('1')
s.append('2')
print(s.show())
node = s.find('1')
print_data(node)
s.remove('1')
node = s.find('1')
print_data(node)
print(s.show())
s.append('3')
s.append('4')
print(s.show())
s.insert_after('2', '2.1')
print(s.show())
s.insert_after('4', '5')
print(s.show())
node = s.find('4')
print_data(node)
s.remove('3')
print(s.show())
s.remove('4')
print(s.show())

