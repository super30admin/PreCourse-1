class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    
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
        new_node=ListNode(data)
        if self.head==None:
            self.head=new_node
        else:
            cur=self.head
            while cur is not None:
                cur=cur.next
            cur.next=new_node        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head==None:
            print("The list is empty")
            return
        temp=self.head
        while temp is not None:
            if temp.data==key:
                return temp.data
            temp=temp.next
        return None


        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head==None:
            print("The list is empty")
            return
        if self.head.data==key:
            self.head=self.head.next
        temp=self.head
        while temp is not None:
            if temp.next.data== key:
                break
            temp=temp.next
        if temp.next==None:
            print("The key is not in list")
        else:
            temp.next=temp.next.next
        return