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
        if not self.head:
            self.head = ListNode(data)
        else:
            ptr = self.head
            while ptr.next:
                ptr = ptr.next
            ptr.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        ptr = self.head
        while ptr:
            if ptr.data == key:
                return ptr
            ptr = ptr.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        ptr = self.head
        lag_ptr = ptr
        if self.head and self.head.data == key:
            self.head = self.head.next
            return
        while ptr:
            if ptr.data == key:
                lag_ptr.next = ptr.next
                ptr.next = None
                return ptr
            lag_ptr = ptr
            ptr = ptr.next

    def show(self):
        ptr = self.head
        while ptr:
            print(ptr.data, end=" ")
            ptr = ptr.next
        print()
        
if __name__ == "__main__":
    s_list = SinglyLinkedList()
    s_list.append(10)
    s_list.append(20)
    s_list.append(30)
    s_list.show()
    s_list.remove(30)
    s_list.remove(10)
    s_list.show()
    print(s_list.find(20))
    print(s_list.find(30))
    print(s_list.find(40))

