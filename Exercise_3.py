# Time Complexity :
# Space Complexity : O(n) because we need to traverse through every whole elements
# Did this code successfully run on Leetcode : online GDB yes
# Any problem you faced while coding this : None had to write an example code to test it out.


# Your code here along with comments explaining your approach


class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None): #node initialization
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
        new_node = ListNode(data)
        # If the list is empty, set the new node as the head.
        if self.head is None:
            self.head = new_node
            return
        # Otherwise, traverse the list until the end.
        current = self.head
        while current.next:
            current = current.next
        current.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:   # Traverse the list until the key is found.
            if current.data == key:
                return current
            current = current.next
        return None
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        previous = None  
        while current:  # Traverse the list to locate the node with the key.
            if current.data == key:
                if previous is None:  # If the node to remove is the head, update the head.
                    self.head = current.next
                else:
                    previous.next = current.next
                return True  # when Successful removal
            previous = current
            current = current.next
        return False  #  when Key not found

# The below is an Example to test the code
if __name__ == "__main__":
   
    s = SinglyLinkedList()
    # To Append elements to the list
    s.append(10)
    s.append(20)
    s.append(30)
    
    # To Find an element
    node = s.find(20)
    if node:
        print("Found:", node.data)
    else:
        print("Not found")
    
    # To Remove an element
    removed = s.remove(20)
    print("Removed 20:", removed)
    
    #  To Try to find the removed element
    node = s.find(20)
    print("Found 20 after removal:", node)