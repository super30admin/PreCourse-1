# append(), find(), remove() - Time Complexity: O(n), Space Complexity - O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

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
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node
        
        else:
            last_item = self.head
            while last_item.next:
                last_item = last_item.next
            last_item.next = new_node
        self.print_current_list("Appending {} ".format(data))
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        #Iterating through the linkedlist and finding the element
        current_node = self.head
        while current_node:
            if current_node.data == key:
                print("Data Found: ", current_node.data)
                return current_node
            current_node = current_node.next

        print("Element not found")
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return
        # If head contains key,removed the element present in the head 
        if self.head.data == key:
            self.head = self.head.next
        #Apart from head, if key is found in the linkedlist and removed it
        else:
            prev_node = self.head
            curr_node = self.head.next
            while curr_node:
                if curr_node.data == key:
                    prev_node.next = curr_node.next
                    break
                prev_node = curr_node
                curr_node = curr_node.next
        self.print_current_list("After Element Removed : ".format(key))
#Printed the List after adding and removing elements in the linkedlist
    def print_current_list(self, label):
        current = self.head
        if current is None:
            print(label + "List is empty")
            return
        
        print(label, end="")
        while current:
            print(current.data, end=" -> ")
            current = current.next
        print("None")
s = SinglyLinkedList()
s.append(100)
s.append(120)
s.append(140)
s.find(120)
s.find(150)
s.remove(120)
s.remove(100)
