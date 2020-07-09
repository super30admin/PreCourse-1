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
        if self.head == None:
            self.head = ListNode(data)
        else:
            ptr = self.head
            while(ptr.next):
                ptr = ptr.next
            ptr.next = ListNode(data)

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        else:
            ptr = self.head
            while ptr:
                if (ptr.data == key):
                    return True
                else:
                    ptr = ptr.next


            return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        prev_ptr = None
        curr_ptr = self.head

        while curr_ptr:
            if (curr_ptr.data == key):
                if (prev_ptr == None):
                    self.head = self.head.next
                    curr_ptr = curr_ptr.next

                else:
                    prev_ptr.next = curr_ptr.next
                    curr_ptr = prev_ptr
                    prev_ptr = curr_ptr
                    curr_ptr = curr_ptr.next

            else:
                prev_ptr = curr_ptr
                curr_ptr = curr_ptr.next

        return self.head




    def show(self):
        print("Current stack: ")
        ptr = self.head
        while ptr:
            print(ptr.data)
            ptr = ptr.next


a=SinglyLinkedList()
a.append(2)
a.append(4)
a.append(6)
a.append(8)
a.append(10)
a.append(12)
a.append(14)
a.show()
print('find 6',a.find(6))
print('find 7',a.find(7))
a.remove(8)
a.show()