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
        if self.head is None:
            self.head = ListNode(data)
        else:
            temp = self.head
            while temp and temp.next:
                temp = temp.next
                print("WHILE: ", temp.data)
            temp.next = ListNode(data)
            temp = temp.next
            print("temp.data", temp.data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while temp:
            if temp.data == key:
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
            print("SEARCHING: ", temp.data)
            if temp.data == key:
                if prev is None:
                    self.head = self.head.next
                else:
                    prev.next = temp.next
                    temp = temp.next
                return "FOUND"
            prev = temp
            temp = temp.next
        return None   

llist2 = SinglyLinkedList()
llist2.append(1)
llist2.append(2)
llist2.append(3)
llist2.append(4)
print(llist2.find(2))
print(llist2.find(5))
print(llist2.remove(5))
print(llist2.remove(1))
print(llist2.find(4))


