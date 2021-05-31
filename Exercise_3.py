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
        node_new = ListNode(data)
        curr_point = self.head
        if self.head == None:
            self.head = node_new
        else:
            curr_point = self.head
            while curr_point.next != None:
                curr_point = curr_point.next

            curr_point.next = node_new

        return node_new.data
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.

        """
        curr_node = self.head
        while(curr_node != None):
            if(curr_node.data == key):
                return curr_node
            elif curr_node.next != None and curr_node.next.data == key:
                return curr_node.next
            else:
                return ListNode(None)

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        first_node = self.head
        while first_node != None:
            if first_node.data == key:
                first_node = None
                break
            elif first_node.next != None and first_node.next.data == key:
                first_node.next = first_node.next.next
                break
            else:
                print("Not Found")


s = SinglyLinkedList()
print (s.append(10))
print (s.append(20))
print (s.append(30))
find_node = s.find(20)
print (find_node.data)
print (find_node.data)
s.remove(20)


