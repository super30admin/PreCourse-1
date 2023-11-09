# Space Complexity : O(n)

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
        if self.head == None:
            self.head = newNode
            return
            
        temp_node = self.head
        while temp_node.next:
            temp_node = temp_node.next
        temp_node.next = newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp_node = self.head
        while temp_node:
            if temp_node.data == key:
                return key
            temp_node = temp_node.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp_node = self.head
        if temp_node is not None and temp_node.data == key:
            if temp_node.next is not None:
                self.head = self.head.next
            else:
                self.head = None

        while temp_node.next:
            if temp_node.next.data == key:
                temp_node.next = temp_node.next.next
            temp_node = temp_node.next

list1 = SinglyLinkedList()
list1.append(5)
list1.append(4)
list1.append(10)
print(list1.find(6))
print(list1.find(4))
list1.remove(4)
print(list1.find(4))
