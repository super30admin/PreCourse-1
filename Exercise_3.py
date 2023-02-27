class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data= data
        self.next= next


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
        if self.head is None:
            self.head= ListNode(data= data, next= None)
        else:
            self.new_node= ListNode(data= data, next= None)
            node_loc = self.head
            while node_loc.next != None:
                node_loc = node_loc.next
            node_loc.next = self.new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        #self.flag= self.head
        node_loc= self.head
        while node_loc is not None:
            if node_loc.data== key:
                return print(node_loc.data)
            self.head= self.head.next
        return print('Not found')

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        
        if self.head.data == key:
                self.head= self.head.next
                return 
        else:
            prev= None
            node_loc= self.head
            # node_loc= node_loc.next
            while node_loc is not None:
                if node_loc.data==key:
                    prev.next= node_loc.next
                    break
                prev= node_loc
                node_loc= node_loc.next

            
            
ll= SinglyLinkedList()
ll.append(5)
ll.append(10)
ll.append(15)
ll.find(5)
ll.remove(15)