class ListNode:
    """
    A node in a singly-linked list.
    """

    def __init__(self, data=None,next=None):
        self.data = data
        self.next = next


class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def insert(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newnode = ListNode(data)
        if(self.head):
            current = self.head
            while(current.next):
                current = current.next
            current.next = newnode
        else:
            self.head = newnode

    def printLL(self):
        current = self.head
        while (current):
            print(current.data)
            current = current.next


    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data is key:
                print("Found")
                return
            else:
                current = current.next
        print("Not Found")
        return

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            raise Exception("List is empty")

        if self.head.data == key:
            self.head = self.head.next
            return

        current_node = self.head
        while current_node:

            if current_node.data is key:
                prev_node.next = current_node.next
                return
            else:
                prev_node = current_node
                current_node = current_node.next
        print("Not Found")
        return

LL = SinglyLinkedList()
LL.insert(3)
LL.insert(4)
LL.insert(5)
LL.printLL()
LL.find(4)
LL.remove(3)
LL.printLL()