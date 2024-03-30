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
        newLNode = ListNode(data)
        if self.head is None:
            self.head  = newLNode
            return
        
        cur_node = self.head
        while cur_node.next:
            cur_node = cur_node.next
        cur_node.next =  newLNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        cur_node = self.head

        while cur_node:
            if cur_node.data == key :
                return cur_node
            cur_node = cur_node.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        cur_node = self.head
        if cur_node and cur_node.data == key:
            self.head = cur_node.next
            cur_node = None
            return
        
        prev = None

        while cur_node and cur_node.data != key:
            prev = cur_node
            cur_node = cur_node.next

        if cur_node is None:
            return
        prev.next = cur_node.next
        cur_node = None

    def display(self):

        cur_node = self.head
        while cur_node:
            print(cur_node.data)
            cur_node = cur_node.next
        
        



sll = SinglyLinkedList()
sll.append(1)
sll.append(2)
sll.append(3)
sll.display()
print('search')
searchEle = sll.find(2)
print(sll.find(2).data)
searchEle = sll.find(1)
print(searchEle.data)

# sll.display()
print('remove')
sll.remove(2)
sll.display()