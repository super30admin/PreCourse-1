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

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node=ListNode(data);
        if self.head is None:
            self.head=new_node
        else:
            current=self.head
            while current.next:
                current=current.next
            current.next=new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current=self.head
        while current:
            if current.data == key:
                return current
            current=current.next
        return None
        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current=self.head
        if current is None:
            return None
        if current.data== key:
            self.head=current.next
            return current
        prev=None
        while current:
            if current.data== key:
                prev.next= current.next
                return current
            prev =current
            current=current.next
        return None

# Create a new singly-linked list
sll = SinglyLinkedList()

# Append elements
sll.append(10)
sll.append(20)
sll.append(30)

# Find an element
node = sll.find(20)
print(node.data if node else "Not found")  # Output: 20

# Remove an element
removed = sll.remove(20)
print(removed.data if removed else "Not found")  # Output: 20

# Try to find the removed element
node = sll.find(20)
print(node.data if node else "Not found")  # Output: Not found
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

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node=ListNode(data);
        if self.head is None:
            self.head=new_node
        else:
            current=self.head
            while current.next:
                current=current.next
            current.next=new_node
        print(f"Appended {data} to the list")

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current=self.head
        while current:
            if current.data == key:
                print(f"Found {key} in the list")
                return current
            current=current.next
        print(f"{key} not found in the list")
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current=self.head
        if current is None:
            print("List is empty")
            return None
        if current.data== key:
            self.head=current.next
            print(f"Removed {key} from the list")
            return current
        prev=None
        while current:
            if current.data== key:
                prev.next= current.next
                print(f"Removed {key} from the list")
                return current
            prev =current
            current=current.next
        print(f"{key} not found in the list")
        return None

# Create a new singly-linked list
sll = SinglyLinkedList()

# Append elements
sll.append(10)
sll.append(20)
sll.append(30)

# Find an element
node = sll.find(20)
print(node.data if node else "Not found")  # Output: 20

# Remove an element
removed = sll.remove(20)
print(removed.data if removed else "Not found")  # Output: 20

# Try to find the removed element
node = sll.find(20)
print(node.data if node else "Not found")  # Output: Not found