# implementing a singly linked list
class ListNode:
    """
    A node in a singly-linked list.
    """
    # default values for a node
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None

class SinglyLinkedList:
    # initializing the head to None
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    # Adding a new node at the end of the list
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        # creating a single node
        new_node = ListNode(data)

        # check if the head is none, then the new node is the new list
        if self.head is None:
            self.head = new_node
        else:
            # if head is not empty, then traverse through the list and add the new node at the end of the list
            curr = self.head
            while curr.next is not None:
                curr = curr.next
            curr.next = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        # if head is none, then no node could be found
        if self.head is None:
            return None
        else:

            # traverse through the list and find the data of the node if matching the key, then return the node data
            curr = self.head
            while curr.next is not None:
                if curr.data == key:
                    return curr.data
                else:
                    curr = curr.next


    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        # if the list is empty, then nothing can be removed
        if self.head is None:
            return None

        # check if the node to be removed with matching key is the head node, if so then increment the head node
        if self.head.data == key:
            self.head = self.head.next

        # else travserse the list and match the key to the node, then remove the node by
        # pointing the prev node to the next of the matching node
        else:
            curr = self.head
            while curr.next is not None:
                if curr.data == key:
                    break
                prev = curr
                curr = curr.next
                prev.next = curr.next

        return self.head

    # to print the list to keep track of the code and implementing it
    def printList(self):
        temp = self.head
        while temp:
            print(temp.data, end=" ")
            temp = temp.next
        print()

llist = SinglyLinkedList()
llist.append(7)
llist.append(10)
llist.append(22)
llist.append(18)
llist.remove(7)
llist.append(9)
llist.append(18)
llist.printList()
print(llist.find(22))
print(llist.find(50))
