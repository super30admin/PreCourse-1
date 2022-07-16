class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None
    
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
        # creating a node with properties data (as data) and next
        data_node = ListNode(data)
        if self.head is None:
            self.head = data_node
        else:
            temp = self.head
            # traversing the linked-list until the next of the node is None
            # once that node is found we point the next of that node to our data_node
            while temp.next:
                temp = temp.next
            temp.next = data_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        key_node = ListNode(key)
        temp = self.head
        while temp.data != key_node.data:
            temp = temp.next
            if temp is None:
                return None
        return temp
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return
        # creating a node with properties data (as key) and next
        key_node = ListNode(key)
        # base-case
        # if the node that is to be removed is head of the linked-list
        # pointing head pointer to next of head
        if self.head.data == key_node.data:
            self.head = self.head.next
        else:
            temp = self.head
            # traversing through the linked list until we find the key and also storing the node as prev
            # once we find the node with data same as our key, we point the next of prev node to next of temp
            # so there will be no pointer pointing to node with data as key
            while temp.data != key_node.data:
                prev = temp
                temp = temp.next
            prev.next = temp.next

    # function to print linked-list
    def printList(self):
        temp = self.head
        while temp:
            print(temp.data, end=" ")
            temp = temp.next
        print()


llist = SinglyLinkedList()
llist.append(7)
llist.append(10)
llist.append(18)
llist.append(43)
llist.remove(7)
llist.append(18)
llist.append(9)
llist.append(11)
llist.remove(18)
llist.printList()
print(llist.find(43))
print(llist.find(100))