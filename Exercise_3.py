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
        newListNode = ListNode(data)
        if self.head is None:
            self.head = newListNode
        curr = self.head
        while curr.next != None:
            curr = curr.next
        # now we are at the end of the linked list
        curr.next = newListNode

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr is not None:
            if curr.data == key:
                return True
            curr = curr.next
        return False

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # Initial thought: Removal can be at the head or elsewhere
        curr = self.head
        # removal from the beginning of Linked List
        if curr is not None:
            if curr.data == key:
                tempNode = self.head
                self.head = self.head.next
                tempNode = None
            else:
            # removal elsewhere
                while curr.next is not None:
                    if curr.next.data == key:
                        tempNode = curr.next
                        curr.next = curr.next.next
                        tempNode = None
                        break
                    curr = curr.next

    def printLinkedList(self):
        curr = self.head
        while curr is not None:
            print(curr.data)
            curr = curr.next

linkedlist = SinglyLinkedList()
linkedlist.head = ListNode("1")
two = ListNode("2")
three = ListNode("3")
four = ListNode("4")
linkedlist.head.next = two
two.next = three
three.next = four
linkedlist.printLinkedList()
print("After removal: ")
linkedlist.remove("4")
linkedlist.printLinkedList()
print("After Adding: ")
linkedlist.append("7")
linkedlist.printLinkedList()