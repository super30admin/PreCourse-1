"""

     Student : Shahreen Shahjahan Psyche

"""

class ListNode:
    """
    A node in a singly-linked list.

    Memory Complexity : O(N)

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
        if self.head is None:
            self.head = new_node
        else:
            current = self.head
            while(current):
                if current.next is None:
                    current.next = new_node
                    break
                else:
                    current = current.next

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        current = self.head
        while (current):
            if current.data == key:
                return current.data
            else:
                current = current.next
        return None


    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.data == key:
            temp = self.head
            self.head = self.head.next
            del temp
            return
        current = self.head

        while(current.next):
            if current.next.data == key:
                temp = current.next
                current.next = current.next.next
                del temp
                break
            else:
                current = current.next

    # I have added this function to test my code
    def print_list(self):
        temp = self.head
        while (temp):
            print(temp.data)
            temp = temp.next




# Test Example

def print_list(temp):
    while(temp):
        print(temp.data)
        temp = temp.next

root = SinglyLinkedList()
root.append(1)
root.append(2)
root.append(3)
print("List")
root.print_list()
print()
root.remove(2)
print("List")
root.print_list()

