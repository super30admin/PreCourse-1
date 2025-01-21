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
        if self.head is None:
            self.head = ListNode(data)
            return
        else:
            new_node = ListNode(data)
            curr = self.head
            while curr.next is not None:
                curr = curr.next
            curr.next = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr.next is not None:
            if curr.data == key: return curr.data
            curr = curr.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None: return None

        curr = self.head

        # if head is the key
        if curr.data == key:
            tempNode = self.head
            self.head = curr.next
            # delete old head
            tempNode = None

        # traverse to find the key
        while curr.next is not None:
            if curr.next.data == key:
                node_to_del = curr.next
                curr.next = curr.next.next
                node_to_del = None
                break
            curr = curr.next

    def printLL(self):
        if self.head is None: return None
        tempNode = self.head
        while tempNode:
            print(tempNode.data)
            tempNode = tempNode.next


ll = SinglyLinkedList()
ll.append(10)
ll.append(20)
ll.append(30)
ll.append(40)
ll.append(50)
ll.printLL()
print(ll.find(30))
ll.remove(30)
ll.remove(10)
ll.printLL()
