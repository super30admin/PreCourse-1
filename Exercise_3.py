'''
// Time Complexity : O(1)
// Space Complexity : O(n)
'''
class ListNode:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
    
class SinglyLinkedList:
    def __init__(self):
        self.head = None

    def append(self, data):
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node
            return
        current = self.head
        while current.next:
            current = current.next
        current.next = new_node
        
    def find(self, key):
        current = self.head
        while current:  
            if current.data == key:
                return current
            current = current.next
        return None

    def remove(self, key):
        current = self.head
        previous = None  
        while current:
            if current.data == key:
                if previous is None: 
                    self.head = current.next
                else:
                    previous.next = current.next
                return True  
            previous = current
            current = current.next
        return False