"""
Space complexity is O(n) as I'm using a linked list to add and remove the elements where n is the number of elements
- Time complexity to add the element at the end is O(n) as we have to traverse
 the whole list and then add the element at the end
- Time complexity to find the element is O(n) because in the worst
 case, we go through the whole list
- Time complexity to remove an element is also O(n) because we have to go through the whole list in the
worst case ( ie. the element might be the last one in the list)
"""

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
        if not self.head:
            self.head = ListNode(data)
        else:
            new_node = ListNode(data)
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
        curr = self.head
        if not curr:
            return None
        while curr:
            if curr.data == key:
                return curr.data
            curr = curr.next
        return None


    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr = self.head
        # If the node to be deleted is the head node
        if curr is not None and curr.data == key:
            self.head = curr.next
            return

        # If the node is any other node
        prev = None
        while curr:
            if curr.data == key:
                break
            prev = curr
            curr = curr.next

        # If the element is not found
        if curr is None:
            print('Not found')
            return

        # If it's found
        prev.next = curr.next


    def print_LL(self):
        curr = self.head
        while curr is not None:
            print(curr.data)
            curr = curr.next


l = SinglyLinkedList()
l.append(1)
l.append(2)
l.append(3)
l.append(4)
l.append(5)

l.print_LL()


print(l.find(1))
print(l.find(3))
print(l.find(6))

l.print_LL()
l.remove(3)
l.remove(1)
l.print_LL()
l.remove(5)
l.print_LL()