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
            return 
        ptr = self.head
        while ptr.next != None:
            ptr = ptr.next
        ptr.next = ListNode(data)
        return 
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        ptr = self.head
        while ptr != None:
            if ptr.data == key:
                return ptr
            ptr = ptr.next
        return None


    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = None
        ptr = self.head
        while ptr.next != None:
            if ptr.data == key:
                if prev == None:
                    self.head = ptr.next
                else:
                    prev.next = ptr.next
                return True
            prev = ptr
            ptr = ptr.next
        return False

    def show(self):
        ptr = self.head
        while ptr != None:
            print(ptr.data , "->")
            ptr = ptr.next
        
# l = SinglyLinkedList()
# l.append(1)
# l.append(2)
# l.append(3)
# l.append(4)
# l.show()
# print(l.find(3))
# l.show()
# print(l.find(1))
# l.show()


# print(l.remove(3))
# l.show()
# print(l.remove(5))
# l.show()
# print(l.remove(1))
# l.show()
