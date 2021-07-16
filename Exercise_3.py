class ListNode:
    """
    A node in a singly-linked list.
    """
    

    def __init__(self, data=None, next=None):
        self.head=None
        self.next=None
        self.data=Data

    
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
        # """
        # # temp=self.head
        # while self.next==None:
        #     # temp=self.next
        #     n=Node(data)
        #     n=self.next
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            return
        last = self.head
        while (last.next):
            last = last.next
        last.next =  new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        last=self.head
        if self.head is None:
            return False
        else:
            while(last.next):
                if last.data==key:
                    return True
                else:
                    last=last.next
            return False



        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        l1=self.head
        l2=l1.next
        if self.head is None:
            return False
        else:
            if self.head.data==key:
                self.head=self.head.next
            else:

                while(l2.next):
                    if l2.data==key:
                        l1.next=l2.next
                    else:
                        l2=l2.next
                        l1=l1.next
            return False
