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
        self.head = ListNode(None)

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        new_node.next = self.head
        self.head = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr:
            if curr.data == key:
                return curr
            curr = curr.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = ListNode(0)
        temp.next = self.head
        prev, curr = temp, self.head
        while curr:
            if curr.data == key:
                prev.next = curr.next
                break
            else:
                prev = curr
                curr = curr.next
        
        self.head = temp.next

    def print_LL(self):
        curr = self.head
        while curr:
            print(curr.data, end=" -> ")
            curr = curr.next
        print("None")

linked = SinglyLinkedList()
linked.print_LL()
print("Appendng 10, 20, 30")
linked.append(10)
linked.append(20)
linked.append(30)
print("Linked List as of right now")
linked.print_LL()
print("Finding 20")
print(linked.find(20))
print("Finding 120")
print(linked.find(120))
print("Removing 30")
linked.remove(30)
linked.print_LL()