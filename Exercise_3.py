# Time Complexity : O(N) for all operations
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Ran it locally
# Any problem you faced while coding this : None


# Your code here along with comments explaining your approach
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
        node = ListNode(data=data)
        '''If the linkedlist is empty set the head to the node'''
        '''Else iterate the linkedlist to reach the end of the list and attach the node'''

        if self.head is None:
            self.head = node

        else:
            curr = self.head

            while curr.next:
                curr = curr.next

            curr.next = node

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        '''Iterate the linkedlist to find the key'''
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

        '''If the key is the first node then update the head to head.next'''
        if self.head.data == key:
            curr = self.head
            self.head = self.head.next
            return curr

        '''Iterate the linkedlist and link the node before the key with the node after the key'''
        curr = self.head
        prev = self.head
        while curr:
            if curr.data == key:
                prev.next = curr.next
                return curr
            prev = curr
            curr = curr.next

    def show(self):
        curr = self.head
        result = []
        while curr:
            result.append(curr.data)
            curr = curr.next
        return result


a_stack = SinglyLinkedList()
while True:
    print('Linked List: ', a_stack.show())
    #Give input as string if getting an EOF error. Give input like "push 10" or "find 10"
    print('push <value>')
    print('find <value>')
    print('remove <value>')
    print('quit')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.append(int(do[1]))
    elif operation == 'find':
        popped = a_stack.find(int(do[1]))
        if popped is None:
            print('Element not found')
        else:
            print('Element found: ', popped.__str__)
    elif operation == 'remove':
        popped = a_stack.remove(int(do[1]))
        if popped is None:
            print('Element not found')
        else:
            print('Element removed successfully')
    elif operation == 'quit':
        break