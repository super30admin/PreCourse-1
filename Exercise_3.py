# append O(n)
# find O(n)
# remove O(n)

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
        curr = self.head
        if curr:
            while curr.next is not None:
                curr = curr.next
            curr.next = ListNode(data)  # No need to check if curr here
        else:
            self.head = ListNode(data) 
        
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
        curr = self.head
        prev = curr
        while curr:
            if curr.data == key:
                break
            prev = curr
            curr = curr.next
        curr.next = None

if __name__ == "__main__":
    singly_ll = SinglyLinkedList()
    singly_ll.append(5)
    singly_ll.append(10)
    singly_ll.append(15)
    singly_ll.append(20)

    found_node = singly_ll.find(20)
    if found_node:
        print(f"Found node with data: {found_node.data}")
    else:
        print("Node not found")