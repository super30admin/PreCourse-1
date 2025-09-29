# Time Complexity :
         # append: O(n)
         # find: O(n)
         # remove: O(n)
  
# Space Complexity : O(n)
         
# Did this code successfully run on Leetcode : NA

# Any problem you faced while coding this :NA
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data # Store data
        self.next=None # Pointer to next node
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None # Head pointer (None means empty)

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        temp = ListNode(data) #Create new node with data
        # If list is empty, new node becomes head
        if self.head is None: 
            self.head =temp 
        else:
            # Traverse to the end and insert node
            curr = self.head 
            while curr.next:  
                curr = curr.next
            curr.next = temp 
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None: #if list is empty return None
            return None
        else:
            curr = self.head # Iterate through list
            while curr:
                if curr.data == key: 
                    return curr.data # Return value if available
                curr = curr.next
            return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # Check if the value is head Node
        curr = self.head
        if curr and curr.data == key:
            self.head = curr.next
            return curr.data
        # Iterate through the list
        else:
            prev = self.head
            curr = self.head.next
            while curr:
                #if item available, remove from list
                if curr.data == key:
                    prev.next = curr.next
                    return curr.data
                prev = curr
                curr = curr.next
            return None
a_SinglyLinkedList = SinglyLinkedList()
while True:
        #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
        print('append <value>')
        print('remove <value>')
        print('find <value>')
        print('quit')
        do = input('What would you like to do? ').split()
        #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
        operation = do[0].strip().lower()
        if operation == 'append':
            a_SinglyLinkedList.append(int(do[1]))
        elif operation == 'remove':
            Removed = a_SinglyLinkedList.remove(int(do[1]))
            if Removed is None:
                print('Value not found')
            else:
                print('Removed value: ', int(Removed))
        elif operation == 'find':
            find = a_SinglyLinkedList.find(int(do[1]))
            if find is None:
                print('Value not found')
            else:
                print('Value found: ', int(find))

        elif operation == 'quit':
            break

