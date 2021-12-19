
# O(n) solution for adding (always), removing (worst case), finding(worst case)

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
        self.head = ListNode(None)

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        temp_runner = self.head 
        while(temp_runner.next):
            temp_runner = temp_runner.next
        temp_runner.next = new_node

        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp_runner = self.head
        while(temp_runner):
            if temp_runner.data == key:
                return(f"Found {temp_runner.data}")
            temp_runner = temp_runner.next
        return(f"{key} not found")
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp_runner = self.head
        while(temp_runner.next):
            if temp_runner.next.data == key:
                print(f"Removing {temp_runner.next.data}")
                temp_runner.next = temp_runner.next.next
            temp_runner=temp_runner.next
    
    def print_list(self):
        temp_runner = self.head
        while(temp_runner):
            print(temp_runner.data)
            temp_runner = temp_runner.next


if __name__ == "__main__":
    a = [1,2,3,4,5,6]
    linkedlist = SinglyLinkedList()
    for i in a:
        linkedlist.append(i)
    

    linkedlist.print_list()
    print(linkedlist.find(3))
    linkedlist.remove(3)
    print(linkedlist.find(3))
