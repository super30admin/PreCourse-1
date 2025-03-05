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
        Space Complexity: O(1)
        """
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        Takes O(1) space
        """
        newnode = ListNode(data) # creating a node
        if self.head is None: # if head is empty,pointing the head to new node
            self.head = newnode
            return

        current = self.head 
        while current.next: # traversing till the last node
            current = current.next 
        current.next = newnode #adding new node to the last node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        No extra space. so O(1)
        """
        # Traversing through entire linkedlist to match the key
        current = self.head
        while current:
            if current.data == key:
                return current
            current = current.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        Space complexity : O(1)
        """
        current = self.head
        previous = None
        #if list is empty
        if current is None:
            print('List is empty')
            return
        #if liost has only 1 node
        if current.data == key and current.next is None:
            self.head = None
            return
        #if first element of the node matches the key
        if current.data == key:
            self.head = current.next
            return
        #Traverse the list to find the key
        while current and current.data != key:
            previous = current
            current = current.next
        #if key not found till the last node, we return None
        if current is None:
            return None
        #if key was found, we ulink the node
        previous.next = current.next
    
    def display(self):
        """Print the linked list.
        Time Complexity: O(N)
        space Complexity = O(N)
        """
        current = self.head
        while current:
            print(current.data, end=" -> ")
            current = current.next
        print("None")


ll = SinglyLinkedList()
print("Appending 1,2,3,4")
ll.append(1)
ll.append(2)
ll.append(3)
ll.append(4)
print("Printing the linkedlist")
ll.display()  
print("Removing 2")
ll.remove(2)
print("Printing the linkedlist")
ll.display()  
print("Removing 1")
ll.remove(1)
print("Printing the linkedlist")
ll.display() 
print("Removing 4")
ll.remove(4)
print("Printing the linkedlist")
ll.display()  
print("Removing 3")
ll.remove(3)
print("Printing the linkedlist")
ll.display()  
print("Removing 10")
ll.remove(10)  
print("Appending 5,6")
ll.append(5)
ll.append(6)
print("Printing the linkedlist")
ll.display()
print("Finding 6,10")
print("Finding 6:", ll.find(6)) 
print("Finding 10:", ll.find(10))  
print("Removing 10:", ll.remove(10)) 
