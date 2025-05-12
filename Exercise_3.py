# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode :
# // Any problem you faced while coding this : No

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
        Takes O(n) time because we may have to traverse the whole list.
        """
        new_node = ListNode(data)
        if not self.head:
            self.head = new_node
            print(f"Appended {data} to list")

            return
        current = self.head
        while current.next:
            current = current.next
        current.next = new_node
        print(f"Appended {data} to list")


    def find(self, key):
        """
        Search for the first element with `data` matching `key`.
        Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data == key:
                print("Found in list")
                return current
            current = current.next
        print("Value not found in list")
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        prev = None

        while current:
            if current.data == key:
                if prev:
                    prev.next = current.next
                else:
                    self.head = current.next 
                print(f"Removed {key} from list")

                return True
            prev = current
            current = current.next
        print("Value not found. Nothing was removed.")
        return False
    
ll = SinglyLinkedList()
ll.append(1)
ll.append(2)
ll.append('a')
ll.find(2)
ll.find(4)
ll.find('a')
ll.remove(2)
ll.remove(5)
ll.remove('A')
ll.remove('a')
ll.find('a')