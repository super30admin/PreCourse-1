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
        if not self.head:
            self.head = ListNode(data)
            return
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr:
            if curr.data == key:
                return curr.data
            curr = curr.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = ListNode()
        curr = self.head
        prev.next = curr
        while curr:
            if curr.data == key:
                prev.next = curr.next
                return self.head
            curr = curr.next
            prev = prev.next
        return self.head

    def show(self):
        curr = self.head
        while curr:
            print(curr.data, " -> ", end="")
            curr = curr.next

test = SinglyLinkedList()

test.append(1)
test.append(2)
test.append(3)
test.append(2)
test.append(4)
test.show()
print()
val = test.find(3)
print(val, "is found")
val = test.find(5)
print(val, "is found")
test.remove(2)
test.show()
print()
print("End test One")

test2 = SinglyLinkedList()
test2.remove(2)
print("end of test 2")

test3 = SinglyLinkedList()
val = test3.find(1)
print(val)
print("End of test 3")

