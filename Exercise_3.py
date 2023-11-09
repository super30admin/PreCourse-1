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
        check head, if it doesn't exists add new node to head else traverse to end & add new node to end.
        """
        new_node = ListNode(data)
        if not self.head:
            self.head = new_node
            return
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        starting head search the key, if it exists return the data else return None
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
        check if head exists or not & key matches head data, if yes make head.next new head else traverse through
        linklist to find key, if found remove the node else return null if key not found
        """
        curr = self.head
        if self.head and self.head.data == key:
            self.head = self.head.next
            curr = None
            return
        prev = None
        while curr:
            prev = curr
            curr = curr.next
            if curr.data == key:
                prev.next = curr.next
                curr = None
                break
        else:
            return

    def print(self):
        cur = self.head
        while cur:
            print(cur.data,end='->')
            cur = cur.next


ll = SinglyLinkedList()
ll.append(1)
ll.append(2)
ll.append(3)
ll.append(4)
ll.print()
print()
print(ll.find(2))
ll.print()
print(ll.remove(4))
ll.print()
