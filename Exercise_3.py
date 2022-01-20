# Time and space complexity is written for each function.
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        space complexity :- O(1)
        """
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        space complexity :- O(n)
        """
        if self.head == None:
            self.head =  ListNode(data)

        else:
            temp = self.head
            while(temp.next) != None:
                temp = temp.next
            temp.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        space complexity :- O(n)
        """
        if self.head == None:
            return None
        else:
            temp = self.head
            while(temp != None):
                if temp.data == key:
                    return True
                temp = temp.next
            return False

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        space complexity :- O(n)
        """
        temp = self.head
        if temp is not None:
            if temp.data == key:
                self.head = temp.next
                temp = None
                return
        while (temp is not None):
            if temp.data == key:
                break
            prev = temp
            temp = temp.next
        if temp == None:
            return None
        prev.next = temp.next

        temp = None

ll = SinglyLinkedList()
ll.append(3);
if ll.find(2):
    print("TRUE")
else:
    print("FALSE")
ll.remove(3)
