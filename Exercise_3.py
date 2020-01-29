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
        Intialising head to None.
        """
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        If first element added, head is set to the first element,
        else iterate to the end of list add new element.
        """
        if self.head is None:
            self.head = ListNode(data,self.head)
        else:
            temp = self.head
            while temp.next is not None:
                temp = temp.next
            temp.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        Iterate through list, if key is found them return the data,
        else return None.
        """
        temp = self.head
        while temp is not None:
            if temp.data == key:
                return temp.data
            temp = temp.next

        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        Initialise 2 variable - previous and current;
        which contains previous and current element when iterating through list.
        Iterate through list, if key is found then set prev->next to current->next,
        else return None.
        Eg: 1->2->3 In second iteration prev = 1 and current = 2.
        we set prev->next = current->next, hence 1->3
        """
        current = self.head
        prev = self.head
        while current is not None:
            if current.data == key:
                prev.next = current.next
                return current.data
            prev = current
            current = current.next

        return None

s = SinglyLinkedList()
s.append(1)
s.append(2)
s.append(3)
print(s.find(3))
print(s.remove(2))
print(s.find(2))