# Time Complexity: O(1) for appending, O(n) for finding and the same for removal
# Space Complexity: O(n) where n is the number of elements inserted
# Did this code successfully run on Leetcode: I don't think this exact question is on Leetcode.
#                                             Please let me know in case it is on Leetcode
# Any problem you faced while coding this: No
# Your code here along with comments explaining your approach


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
        I initialised head and another pointer to keep a track of the last node entered
        """
        self.head = ListNode(None)
        self.pointer = ListNode(None)
        self.pointer = self.head

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(1) time.
        It inserts a new node after the last node
        """
        if not self.head:
            self.head = ListNode(data)
        else:
            new = ListNode(data)
            self.pointer.next = new
            self.pointer = self.pointer.next

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        Starts searching from the beginning. If element is found, return the element, else None
        """
        node = self.head.next
        while node:
            if node.data == key:
                return key
            node = node.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        I have taken 2 pointer approach. Fast will check for the key and slow will be the previous one.
        In case the number is found, the next pointer of slow is changed to the next pointer of fast 
        and hence fast is removed.
        """
        slow = ListNode(None)
        slow.next = self.head
        fast = slow.next
        while fast:
            if fast.data == key:
                slow.next = fast.next
                fast.next = None
                return fast.data
            slow = slow.next
            fast = fast.next
        return None


# I have put in the driver code for checking the functionality
a_list = SinglyLinkedList()
while True:
    print('append <value>')
    print('find <value>')
    print('remove <value>')
    print('quit')
    do = input('What would you like to do? ').split()

    operation = do[0].strip().lower()
    if operation == 'append':
        a_list.append(int(do[1]))
    elif operation == 'find':
        found = a_list.find(int(do[1]))
        if found is None:
            print('Not in list')
        else:
            print('Found value: ', int(found))
    elif operation == 'remove':
        removed = a_list.remove(int(do[1]))
        if removed is None:
            print('Not in list')
        else:
            print('Removed value: ', int(removed))
    elif operation == 'quit':
        break
