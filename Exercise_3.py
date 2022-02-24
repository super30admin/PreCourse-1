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
        self.tail=self.head

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        node=ListNode(data)
        if(self.head==None):
            self.head=node
            self.tail=self.head

        else:
            self.tail.next=node
            node.next=None
            self.tail=node

            
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current=self.head

        while current.data!=key:
            if current.next!=None:
                current=current.next
            else:
                return None
        value=current.data
        return value

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head==None:
            print('emply linkedlist')
            return

        current_node=self.head
        if current_node.data==key:
            self.head=self.head.next
            if self.head==None or self.head.next==None:
                self.tail=self.head
            return

        while current_node.next!=None and current_node.next.data!=key:
            current_node=current_node.next

        if current_node.next==None:
            current_node.next=current_node.next.next
            if current_node.next==None:
                self.tail=current_node
            return
        else:
            print('Value not found')

    def print(self):
        print(self.head.data)


ll=SinglyLinkedList()
ll.append(1)
ll.append(2)
ll.append(3)
ll.append(4)
ll.remove(1)
ll.print()
print(ll.find(3))
print(ll.find(4))
print(ll.find(2))




        
