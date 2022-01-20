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
        if self.head==None:
            self.head=ListNode(data)
        else:
            while self.head.next:
                self.head=self.head.next
            self.head.next=ListNode(data)
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        space complexity :- O(n)
        """
        if self.head==None:
            return None
        else:
            while self.head:
                if self.head.data==key:
                    return self.head.data
                self.head=self.head.next
            return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        space complexity :- O(n)
        """
        if self.head == None :
            return None
        else:
              ptr = self.head
              if  ptr.data == key:
                self.head = ptr.next
                ptr.next = None
                return True
              else:
                while  self.head.next != None:
                    if  self.head.next.data == key :
                        tempNode =  self.head.next
                        self.head.next =  self.head.next.next
                        tempNode.next = None
                        return True
                    self.head =  self.head.next
                return False
ll = SinglyLinkedList()
ll.append(10)
print(ll.find(10))
print(ll.remove(10))
