# RIken Kapadia
# Time Complexity: 
# append: O(n)
# find: O(n)
# remove: O(n)

# Space Complexity: 
# O(n) – where n is the number of nodes in the list

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None
        self.length=0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node=ListNode(data) # Create a new node
        if self.length==0: # If the list is empty, set head to new node
            self.head=new_node
        else:
            temp=self.head # Traverse to the end of the list
            while temp.next:
                temp=temp.next
            temp.next=new_node  # Set last node's next to new node
        self.length+=1 # Increase the length.
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp=self.head
        while temp:
            if temp.data==key:
                return temp # Found the matching node
            temp=temp.next # Move to the next node
        return None # Key not found

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp=self.head
        pre=None # To keep track of previous node

        while temp:
            if temp.data==key:
                if pre:
                    pre.next=temp.next # If it's not the head, skip over the node to remove it
                else:
                    self.head=temp.next # If it's the head node, update head to next node
                return True # Node found and removed
            pre=temp # Move previous pointer
            temp=temp.next # Move current pointer
        return False # Key not found in list
    


sll = SinglyLinkedList()
sll.append(1)
sll.append(2)
sll.append(3)

found = sll.find(2)
print("Found:", found.data if found else "Not found")

removed = sll.remove(2)
print("Removed:", removed)

found_again = sll.find(2)
print("Found after removal:", found_again.data if found_again else "Not found")
