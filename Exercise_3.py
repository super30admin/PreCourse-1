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
        temp = self.head
        if temp:

            while temp.next:
                temp = temp.next

            temp.next = ListNode(data)

        else:
            curr = ListNode(data)
            self.head = curr

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr_node = self.head
        pos = 0
        while curr_node:
            if curr_node.data == key:
                return key, pos
            curr_node = curr_node.next
            pos += 1

        return None, None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        _, pos = self.find(key)

        if pos == None :
            return "ERROR: Cannot find key"
        else:
            pos = pos - 1
            if pos == -1:
                curr = self.head
                curr = curr.next
                self.head = curr
            else:
                k = 0
                curr = self.head
                while k != pos:
                    curr = curr.next
                    k = k + 1
                new_next = curr.next.next
                curr.next = new_next

