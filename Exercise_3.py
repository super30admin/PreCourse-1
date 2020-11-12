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
        self.head = ListNode()

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        print("Adding...")
        curr = self.head

        while curr:
            if curr.next == None:
                curr.next = ListNode(data)
                break
            curr = curr.next

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        print("Finding...")
        curr = self.head.next

        while curr:
            if curr.data == key:
                return key
            curr = curr.next

        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        print("Removing...")
        prev = self.head
        curr = self.head.next

        while(curr):
            if curr.data == key:
                prev.next = curr.next
            curr = curr.next
            prev = prev.next

    def printList(self):
        curr = self.head.next

        while curr:
            print(curr.data, end = "->")
            curr = curr.next

linkedList = SinglyLinkedList()
linkedList.append(1)
linkedList.printList()
print("\n")

linkedList.append(2)
linkedList.printList()
print("\n")\

linkedList.append(3)
linkedList.printList()
print("\n")


print(linkedList.find(3))

linkedList.remove(3)
linkedList.printList()
print("\n")

linkedList.remove(1)
linkedList.printList()
print("\n")


linkedList.append(1)
linkedList.printList()
print("\n")

linkedList.append(3)
linkedList.printList()
print("\n")