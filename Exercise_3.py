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
        if self.head is None:
            self.head=new_node
        else:
            curr=self.head
            while curr.next:
                curr=curr.next
            curr.next=new_node


        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr=self.head
        while curr:
            if curr.data==key:
                return curr.data
            curr=curr.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None: return

        if self.head.next==key:
            self.head=self.head.next
        
        curr=self.head
        prev=ListNode(None)
        while curr:
            if curr.data==key:
                prev.next=curr.next
                return 
            prev=curr
            curr=curr.next

    def show(self):
        """
        Build a function to print elements.
        Takes O(n) time. 
        """
        curr=self.head
        while curr:
            print(curr.data)
            curr=curr.next


mylist=SinglyLinkedList()
mylist.append('A')
mylist.append('B')
mylist.append('C')
mylist.append('D')
print(f'List after appending:')
mylist.show()

print('Result of searching for B is : ')
print(mylist.find('B'))

print('Result of searching for X is : ')
print(mylist.find('X'))

print('Result of removing B is:')
mylist.remove('B')
mylist.show()

        
