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
        self.head = ListNode(None)

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node=ListNode(data)
        if(self.head.next==None):
            self.head.next=new_node
        else:
            temp=self.head
            while(temp.next!=None):
                temp=temp.next
            new_node=ListNode(data)
            temp.next=new_node
                
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp=self.head.next;
        while(temp.next!=None):
            if temp.data==key:
                return key
            temp=temp.next;
        else:
            return None;
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp=self.head.next
        prev=self.head
        while(temp.next!=None):
            if(temp.data==key):
                return key
            else:
                temp=temp.next
                prev=prev.next
        return None
s=SinglyLinkedList();
s.append(3)
s.append(2)
s.append(1)
s.append(5)
print(s.find(6))
print(s.remove(2))