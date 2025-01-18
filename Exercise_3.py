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
        new_node = ListNode(data)
        if not self.head:  # If the list is empty
            self.head = new_node
            return
        current = self.head
        while current.next:  # Traverse to the last node
            current = current.next
        current.next = new_node  # Link the new node to the last node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data == key:  # Check if the current node's data matches the key
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
        while current:  
            if current.data == key:  # Check if the current node's data matches the key
                if previous:  # If the node to remove is not the head
                    previous.next = current.next
                else:  # If the node to remove is the head
                    self.head = current.next
                return True  # Return True after removing the node
            previous = current
            current = current.next
        return False  # Return False if the key is not found
    
linked_list = SinglyLinkedList()
while True:
    # Give input as string if getting an EOF error. For example, "append 10" or "find 10"
    print('append <value>')
    print('find <value>')
    print('remove <value>')
    print('quit')
    do = input('What would you like to do? ').split()
    operation = do[0].strip().lower()

    if operation == 'append':
        linked_list.append(int(do[1]))
        print(f"Appended {do[1]} to the linked list.")

    elif operation == 'find':
        key = int(do[1])
        found = linked_list.find(key)
        if found:
            print(f"Found {key} in the linked list.")
        else:
            print(f"{key} not found in the linked list.")

    elif operation == 'remove':
        key = int(do[1])
        removed = linked_list.remove(key)
        if removed:
            print(f"Removed {key} from the linked list.")
        else:
            print(f"{key} not found in the linked list.")

    elif operation == 'quit':
        break

    else:
        print("Invalid operation. Please try again.")
