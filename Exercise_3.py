# Time Complexity: O(n) for append, find, and remove operations
# Space Complexity: O(n) where n is the number of elements in the list

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
        if self.head is None:
            self.head = ListNode(data)
            return
        current = self.head
        while current.next is not None:
            current = current.next
        current.next = ListNode(data)
        
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current is not None:
            if current.data == key:
                return current
            current = current.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        
        if self.head is None:
            return None
        
        
        
        # handle case when only head present
        if self.head.data == key:
            self.head = self.head.next
            return
        
        current = self.head.next
        prev = self.head
        
        while current is not None:

            if current.data == key:
                prev.next = current.next
                return  
                
            prev = current
            current = current.next
            
    def print_list(self):
        
        current = self.head
        print("List contents:", end=" ")
        while current is not None:
            print(current.data, end=" -> ")
            current = current.next
        print("None")
        

if __name__ == "__main__":
    # Create the list
    sll = SinglyLinkedList()

    # Append elements
    print("Appending elements: 10, 20, 30")
    sll.append(10)
    sll.append(20)
    sll.append(30)
    sll.print_list()

    # Find an element
    print("Finding element 20:")
    node = sll.find(20)
    if node:
        print(f"Found: {node.data}")
    else:
        print("Not found.")

    # Remove an element
    print("Removing element 20:")
    sll.remove(20)
    sll.print_list()

    # Try to remove an element not in the list
    print("Removing element 100 (not in list):")
    sll.remove(100)
    sll.print_list()

    # Remove head
    print("Removing element 10 (head):")
    sll.remove(10)
    sll.print_list()

    # Remove last element
    print("Removing element 30 (last remaining element):")
    sll.remove(30)
    sll.print_list()           
                
                
            
            
             
            
        

