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
        node=ListNode(data)
        if self.head==None:
            self.head=node
        else:
            #did mistake of not initializing cur, here cur=self.head
            cur=self.head
            while cur.next:
                cur=cur.next
            cur.next=node

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head:
            cur=self.head
            while cur:
                if cur.data==key:
                    return key
                else:
                    cur=cur.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        cur=prev=self.head
        while cur:
            if cur.data==key:
                prev.next=cur.next
                return
            prev=cur
            cur=cur.next
        return None

    #to traverse the list
    def print_list(self):
        cur = self.head
        while cur:
            print(cur.data, end=" -> ")
            cur = cur.next
        print("None")


sll=SinglyLinkedList()
sll.append(1)
sll.append(2)
sll.append(3)
sll.print_list()
sll.remove(3)
sll.print_list()
print("Finding element 3:", sll.find(3))
print("Finding element 3:", sll.find(1))
print("Finding element 3:", sll.find(2))
sll.print_list()

#Output - Executed on Online Compiler
"""
1 -> 2 -> 3 -> None
1 -> 2 -> None
Finding element 3: None
Finding element 3: 1
Finding element 3: 2
1 -> 2 -> None

=== Code Execution Successful ===
"""