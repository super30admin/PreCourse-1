class ListNode:
    """
    A node in a singly-linked list.
    """

    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next


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
        new_node = ListNode(data)
        current_pointer = self.head
        if self.head == None:
            self.head = new_node
        else:
            current_pointer = self.head
            while current_pointer.next != None:
                current_pointer = current_pointer.next

            current_pointer.next = new_node

        return new_node.data

    def find(self, key):
        current_node = self.head
        while current_node != None:
            if current_node.data == key:
                return current_node
            elif current_node.next != None and current_node.next.data == key:
                return current_node.next
            else:
                return ListNode(None)

        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        start_node = self.head
        while start_node != None:
            if start_node.data == key:
                start_node = None
            elif start_node.next != None and start_node.next.data == key:
                start_node.next = start_node.next.next
            else:
                print ("None Found")


a = SinglyLinkedList()
print (a.append(20))
print (a.append(30))
print (a.append(40))
found_node = a.find(40)
print (found_node.data)
a.remove(20)

