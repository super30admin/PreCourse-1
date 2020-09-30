class ListNode:
    """
    A node in a singly-linked list.
    """

    def __init__(self, data=None):
        self.data = data
        self.next = None


class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        # Initialize List with a sentinel node
        # Nßo need for empty/null checks while insertion/deletion
        self.head = ListNode('dummy')

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        temp = self.head
        while temp.next:
            temp = temp.next
        temp.next = new_node
        return self.head

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.is_empty():
            print("List is Empty")
            return None
        temp = self.head
        while temp:
            if temp.data == key:
                print("Key found")
                return temp
            temp = temp.next
        print("Key not found")
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        deleted = False
        curr = self.head
        while curr:
            if curr.data == key:
                prev.next = curr.next
                curr.next = None
                deleted = True
                break
            prev = curr
            curr = curr.next
        if not deleted:
            print(str(key) + " not found")
        else:
            print(str(key) + " deleted")
        return deleted

    # Supplimentary Methods
    def delete_at_head(self):
        """
        delete element from head of linked list
        """
        if self.is_empty():
            print("List is Empty")
            return
        first_element = self.head
        if first_element is not None:
            self.head = first_element.next
            first_element.next = None
        return

    def insert_at_head(self, data):
        """
        Insert a node at head of LL
        O(1)
        """
        temp = ListNode(data)
        temp.next = self.head
        self.head = temp
        return self.head

    def print_list(self):
        if(self.is_empty()):
            print("List is Empty")
            return False
        temp = self.head
        while temp.next is not None:
            print(temp.data, end=" -> ")
            temp = temp.next
        print(temp.data, "-> None")
        return True

    def is_empty(self):
        """
        Check if list is empty
        """
        if self.head.next is None:
            return True
        return False

# Driver Code
if __name__ == '__main__':
    ll = SinglyLinkedList()
    print(ll.is_empty())
    for i in range(1, 10):
        ll.append(i)
    ll.print_list()
    ll.append(100)
    ll.print_list()
    ll.find(100)
    ll.delete_at_head()
    ll.delete_at_head()
    ll.print_list()
    ll.remove(5)
    ll.print_list()
    ll.remove(99)
