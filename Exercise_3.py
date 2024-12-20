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
        if not self.head:  
            self.head = new_node  
            return
        last_node = self.head
        while last_node.next: 
            last_node = last_node.next
        last_node.next = new_node  

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current_node = self.head
        while current_node:  
            if current_node.data == key:  
                return current_node  
            current_node = current_node.next
        return None  

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current_node = self.head
        previous_node = None
        while current_node:  
            if current_node.data == key:  
                if previous_node:  
                    previous_node.next = current_node.next 
                else:  
                    self.head = current_node.next  
                return  
            previous_node = current_node  
            current_node = current_node.next
        return  

# Example usage
sll = SinglyLinkedList()
sll.append(1)
sll.append(2)
sll.append(3)

node = sll.find(2)
if node:
    print(f'Found: {node.data}')
else:
    print('Not found')

sll.remove(2)
node = sll.find(2)
if node:
    print(f'Found: {node.data}')
else:
    print('Not found')