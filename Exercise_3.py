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
        self.tail = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        nodedata = ListNode(data)
        if self.head == None:
            self.head = nodedata
        else:
            self.tail.next = nodedata
        self.tail = nodedata

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current_node = self.head
        while current_node != None:
            if current_node.data == key:
                return current_node.data
            current_node = current_node.next
     
        return None

            
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current_node = self.head
        prev_node = current_node
        while current_node != None:
            if current_node.data == key:
                next_node = current_node.next
                prev_node.next = next_node

            prev_node = current_node
            current_node = current_node.next

        return None



newList = SinglyLinkedList()
newList.append(5)
newList.append(6)
newList.append(9)
newList.append(10)
print(newList.find(5))
print(newList.find(6))
print(newList.find(7))
print(newList.find(11))
newList.remove(6)
newList.find(6)
