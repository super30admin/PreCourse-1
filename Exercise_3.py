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
        self.curr=None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode=ListNode(data=data)

        if self.head is None:
            self.head=newNode
            self.curr=self.head
        else:
            self.curr.next=newNode
            self.curr=self.curr.next

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        temp=self.head

        while temp is not None:

            if temp.data==key:
                print('Found!')
                return temp.data

            temp=temp.next

        print('Not found!')
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr=self.head
        prev=None

        if self.head and self.head.data==key:
            self.head=self.head.next
            self.curr=self.head
        else:
            while curr is not None:
                if curr.data==key:
                    prev.next=curr.next
                    break
                prev=curr
                curr=curr.next


linkedlist=SinglyLinkedList()

linkedlist.append(1)
linkedlist.append(2)
linkedlist.append(3)
linkedlist.append(4)
linkedlist.find(2)
linkedlist.remove(2)
linkedlist.remove(4)
linkedlist.remove(1)
linkedlist.remove(3)
linkedlist.remove(3)
linkedlist.find(6)
linkedlist.append(5)
linkedlist.find(6)
linkedlist.append(6)
linkedlist.append(7)
linkedlist.find(6)
