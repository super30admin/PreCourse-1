# Time Complexity : o(n) for append, find and remove operations. Constructor  takes o(1) time
# Space Complexity : o(n) where n is the length of the list
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class ListNode: # initialize Class ListNode
    def __init__(self, data=None, next_node=None): # initialize data
        self.data = data
        self.next_node = next_node
    
    def get_data(self): # this method returns the data
        return self.data

    def get_next(self): # points to the next node in the list
        return self.next_node

    def set_next(self, new_next): # sets the next node 
        self.next_node = new_next
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        # When the list is first initialized it has no nodes, so the head is set to None
        self.head = None 

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        new_node.set_next(self.head)
        self.head = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        found = False
        while current and found is False:
            if current.get_data() == key:
                found = True
            else:
                current = current.get_next()
        if current is None:
            return None
        return key
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        previous = None
        found = False
        while current and found is False:
            if current.get_data() == key:
                found = True
            else:
                previous = current
                current = current.get_next()
        if current is None:
            raise ValueError("Key not found in list")
        if previous is None:
            self.head = current.get_next()
        else:
            previous.set_next(current.get_next())


s = SinglyLinkedList()

# Test Case 1 ->
s.append(1)
s.append(2)
s.append(2)
s.append(2)
print(s.find(2))
print(s.remove(2))
print(s.find(1))
print(s.find(2))
print(s.remove(2))
print(s.remove(2))
print(s.find(2))
print(s.find(2))
s.append(2)
print(s.find(2))

# Output ->

# 2
# None
# 1
# 2
# None
# None
# None
# None
# 2