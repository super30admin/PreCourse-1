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
        newNode = ListNode(data)
        if self.head == None:
            self.head = newNode
        else:
            temp = self.head
            while temp.next:
                temp = temp.next
            temp.next = newNode

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        temp=self.head;
        if temp.data == key:
            return temp.data
        while temp.next:
            if temp.data==key:
                return temp.data
            temp=temp.next
        if temp.data==key:
            return temp.data

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp=self.head.next
        prev=self.head
        if prev.data==key:
            self.head=prev.next
            return
        if temp.data==key:
            self.head=temp.next
            return
        while temp.next:
            if temp.data==key:
                prev.next=temp.next
                return
sl=SinglyLinkedList()
while True:
    print('append <value>')
    print('find')
    print('remove')
    command=input("Enter the command with Value").split()
    if command[0].lower()=="append":
        sl.append(command[1])
    elif command[0].lower()=="find":
        value=sl.find(command[1])
        if value==None:
            print("Element Not Found")
        else:
            print(value)

    elif command[0].lower()=="remove":
        sl.remove(command[1])
    elif command[0].lower()=="break":
        break
