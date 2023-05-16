class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=None
    
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
        headval=self.head
        newnode=ListNode(data)

        if headval is None:
            self.head=newnode
        else:
            while headval.next:
                headval=headval.next
            headval.next=newnode

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        headval=self.head

        while headval:
            if key==headval.data:
                return key
            else:
                headval=headval.next
        return None


        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """



        cur=self.head
        nxt=self.head.next
        if key==cur.data:
          if cur.next:
            self.head=cur.next
          else:
            self.head=None
          return key
        else:
          while nxt:
            if nxt.data==key:
              cur.next=nxt.next
              return key
            cur=cur.next
            nxt=nxt.next
          return None

