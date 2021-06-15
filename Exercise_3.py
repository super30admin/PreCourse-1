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
        current_node = self.head
        if self.head == None:
            self.head = new_node
        else:
            current_node = self.head
            while current_node.next != None:
                current_node = current_node.next

            current_node.next = new_node

        return new_node.data
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp_node = self.head
        while temp_node.data != None:
            if temp_node.data == key:
                return temp_node.data
            elif temp_node.next.data == key:
                return temp_node.next.data
            else:
                return None
        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp_node = self.head
        while temp_node != None:
            if temp_node.data == key:
                print("Removed ", int(temp_node.data))
                temp_node = None
                break
            elif temp_node.next != None and temp_node.next.data == key:
                print("Removed ", int(temp_node.data))
                temp_node.next = temp_node.next.next
                break
            else:
                print("Key not found")

sll = SinglyLinkedList()
print(sll.append(1))
print(sll.append(2))
print(sll.append(3))
print(sll.find(2))
print(sll.find(5))
print(sll.remove(1))