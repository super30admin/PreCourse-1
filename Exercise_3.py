# Time Complexity:
# append(data): O(n)
# find(key): O(n)
# remove(key): O(n)
# 
# Space Complexity:
# O(n) for storing n nodes in the linked list

class ListNode:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next

class SinglyLinkedList:
    def __init__(self):
        self.head = None

    def append(self, data):
        new_node = ListNode(data)
        if not self.head:
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
        prev = None
        while current:
            if current.data == key:
                if prev:
                    prev.next = current.next
                else:
                    self.head = current.next
                return
            prev = current
            current = current.next