class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        # Initialize value of the current node and pointer to the next node 
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
        # Create a newNode that will be appended to the end of the list. 
        newNode = ListNode(data)
        if self.head == None:
            self.head = newNode
        else:
            
            temp = self.head
            while temp.next:
                temp = temp.next
            # Traverse until the last element in the list and append the newNode
            temp.next = newNode
        # print(self.head.data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None: return None
        temp = self.head
        # Initiate the temporary pointer to head and check elements in the linked list, one element at a time
        while temp:
            if temp.data == key:
                print('Element found')
                return temp
            temp = temp.next
        print('Element Not found')
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # Return None when the list is empty as there are no elements to remove from
        if self.head == None: return None

        # A special case when the head element matches the key. In that case, we update the head pointer.

        if self.head.data == key:
            self.head = self.head.next
            print('Element removed')
            return

        # Keep track of two pointers: previus and current. If the data at current pointer matches the key, 
        # set prev.next = cur.next. This will remove the target element from the linked list
        # The case where head element matches the key is taken care of in the above code

        prev = self.head
        cur = self.head.next

        while cur:
            if cur.data == key:
                prev.next = cur.next
                print('Element removed')
                return
            cur = cur.next
            prev = prev.next
        print('Could not remove the element')

#  Time Complexity : O(n) for all operations
#  Space Complexity : O(n) for all operations
#  Did this code successfully run on Leetcode : Code ran successfully on the test cases mentioned below.


## Testing

obj = SinglyLinkedList()

obj.append(1)
obj.append(2)
obj.append(3)
obj.append(4)
obj.append(5)
obj.append(6)

obj.find(1)
obj.find(3)


obj.remove(10)

obj.remove(2)

obj.find(2)