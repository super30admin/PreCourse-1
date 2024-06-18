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
        list_node = ListNode(data)
        if self.head == None :

            self.head = list_node
            return

        curr = self.head



        while (curr.next != None) :

            curr = curr.next

        curr.next = list_node




    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        curr = self.head

        while(curr.next != None) :

            if curr.data == key :
                return True

            curr = curr.next

        return False

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        curr = self.head

        while (curr.next.data != key) :

            curr = curr. next


        curr.next = curr.next.next


s = SinglyLinkedList()

s.append(10)
s.append(20)
s.append(30)

s.remove(20)


print(s.find(10))