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
        newNode = ListNode(data)
        # Set the newnode as head of list if list is empty
        if self.head is None:
            self.head = newNode
            return
        # Traverse through the entire list to last element and add the newnode
        temp = self.head
        while temp.next:
            temp = temp.next
        temp.next = newNode
        
    
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # Iterates through the list to find the element. returns the element or None if not found.
        temp = self.head
        while temp is not None:
            if temp.data == key:
                return temp
            temp = temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # Checks if head of list is the element to delete and modifies the list inaccording
        if self.head and self.head.data == key:
            self.head = self.head.next
            return
        # Iterates through the list to find the element. returns the element or None if not found.
        prev,temp = None,self.head
        while temp  and temp.data != key:
            prev = temp
            temp = temp.next
        if temp is None:
            print("Element is not found in list")
            return 
        prev.next = temp.next
        temp = None
    
    def printList(self):
        # Returns the array of elements present in list
        res = []
        temp = self.head
        # Checks and returns None if list is empty
        if temp is None:
            print("Empty List")
        while temp is not None:
            res.append(temp.data)
            temp = temp.next
        print(res)

l = SinglyLinkedList()

# Append elements to the list
l.append(10)
l.append(20)
l.append(30)

l.printList()

found_node = l.find(20)
found_data = found_node.data if found_node else "Not Found"

# Remove an element and print the updated list
l.remove(20)
l.printList()
