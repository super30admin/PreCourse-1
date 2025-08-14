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
        head = self.head
        while head!=None and head.next!=None:
            head = head.next
        new_node = ListNode(data)
        head.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        head = self.head
        while head!=None:
            if head.data==key:
                return head
            head=head.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        head = self.head
        prev = self.head
        while head!=None:
            if head.data==key:
                prev.next = head.next
                head.next = None
                del head
                break
            prev = head
            head = head.next

mySingleLinkedList = SinglyLinkedList()
mySingleLinkedList.remove(5)
mySingleLinkedList.append(5)
mySingleLinkedList.append(10)
mySingleLinkedList.append(5)
mySingleLinkedList.find(5)
mySingleLinkedList.remove(10)
mySingleLinkedList.find(10)