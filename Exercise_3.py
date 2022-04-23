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
        self.head = ListNode()

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        curr = self.head

        while curr:
            prev = curr
            curr = curr.next
        prev.next = ListNode(data)

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head.next == None:
            return None
        curr = self.head.next

        while curr:
            if curr.data == key:
                return curr.data
            else:
                curr = curr.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.next == None:
            return None
        curr = self.head.next
        prev = self.head
        while curr:
            if curr.data == key:
                prev.next = prev.next.next
                return curr.data
            else:
                prev = curr
                curr = curr.next

        return None


a_list = SinglyLinkedList()
while True:
    print('append <value>')
    print('find <value>')
    print('remove <value>')
    do = input('What would you like to do? ').split()
    operation = do[0].strip().lower()
    if operation == 'append':
        a_list.append(int(do[1]))
    elif operation == 'remove':
        removed = a_list.remove(int(do[1]))
        if removed is None:
            print('List is empty or element not found')
        else:
            print('Removed value: ', int(removed))
    elif operation == 'find':
        found = a_list.find(int(do[1]))
        if found is None:
            print('Not found')
        else:
            print('Found value: ', int(found))
    elif operation == 'quit':
        break
