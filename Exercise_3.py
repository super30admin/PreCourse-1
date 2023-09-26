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
        self.size = 0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data=data)
        if(self.head is None):
            self.head = new_node
            self.tail = new_node
        else:
            self.tail.next = new_node
            self.tail = self.tail.next
        self.size+=1

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while temp:
            if(key == temp.data):
                return temp.data
            temp = temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        prev = None
        while temp:
            if(key == temp.data):
                if prev:  # If there's a previous node
                    prev.next = temp.next
                    if temp.next is None:  # If the removed node was the tail
                        self.tail = prev
                    else:  # If the removed node is the head
                        self.head = temp.next
                        if self.head is None:  # If the list becomes empty
                            self.tail = None
                temp.next = None
                self.size -= 1
                return True

            prev = temp
            temp = temp.next
        return False

