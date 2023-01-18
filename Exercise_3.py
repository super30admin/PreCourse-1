# Note: Time and space complexity provided in the comment
# section of each linked list function implemented

class ListNode:
    """ A node in a singly-linked list."""
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
    
class SinglyLinkedList:

    # initialize the linked list with first head element
    # Time Complexity - O(1)
    # Space complexity - O(1)
    def __init__(self):
        self.head = None

    # check if linked list is empty or not. If empty then create a new ListNode object and assign
    # this as the head. If not empty then traverse the linked list till the end and append the
    # data as new ListNode.
    # Time Complexity - O(n)
    # Space complexity - O(n)
    def append(self, data):
        if not self.head:
            self.head = ListNode(data)
            return

        cur = self.head
        while cur.next:
            cur = cur.next
        cur.next = ListNode(data)

    # check if linked list is empty or not. If not empty then traverse through
    # the linked list and compare data of each element with key. If found print msg
    # and return, if not found print msg and return
    # Time Complexity - O(n)
    # Space complexity - O(n)
    def find(self, key):
        if not self.head:
            print("Linked List empty")
            return None

        cur = self.head
        while cur:
            if cur.data == key:
                print("key found")
                return cur
            cur = cur.next
        print("key not found")
        return None

    # checking if linked list is empty or not. I not empty check if key matches with head,
    # if yes remove the first element and make next element as head.
    # Time Complexity - O(n)
    # Space complexity - O(n)
    def remove(self, key):
        if not self.head:
            print("Linked List empty")
            return None

        if self.head.data==key:
            temp = self.head.next
            self.head.next = None
            self.head = temp
            print("key removed successfully")
            return

        cur = self.head
        while cur.next:
            if cur.next.data==key:
                cur.next = cur.next.next
                print("key removed successfully")
                return
            cur = cur.next
        print("key not present")
        return None


    # displays the elements in linked list in order
    # Time Complexity - O(n)
    # Space complexity - O(n)
    def show(self):
        cur = self.head
        while cur:
            print(cur.data)
            cur = cur.next


s = SinglyLinkedList()
s.append(5)
s.append(6)
s.show()
(s.find(5))
(s.remove(5))
s.show()
(s.find(6))