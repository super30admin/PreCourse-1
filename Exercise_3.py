#               Time        Space
# append():     O(1)        O(1)
# (time is O(1) since we maintain a tail pointer. If no tail, time=O(N))
# find():       O(N)        O(1)
# remove():     O(N)        O(1)


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
        self.tail = None
        self.length = 0

    def __str__(self):
        node = self.head
        result = "list: "
        while node != self.tail:
            result += f"{node.data} -> "
            node = node.next
        if self.tail:
            result += f"{node.data}"
            result += f"| head = {self.head.data}, tail = {self.tail.data}, len = {self.length}"
        else:
            result = "empty list| head = None, tail = None"
        return result

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new = ListNode(data)
        if not self.head:
            self.head = new
            self.tail = new
        else:
            node = self.tail
            node.next = new
            self.tail = new
        self.length += 1

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        node = self.head
        while node:
            if node.data == key:
                print(f"Found node with data = {key}")
                return node
            node = node.next
        print(f"Cannot find node with data = {key}")
        return None


    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        node_to_delete = self.find(key)
        if node_to_delete:
            if self.head == node_to_delete: # remove head
                self.head = self.head.next
            else: # remove an in-between or tail node
                prev_node = None
                curr_node = self.head
                while curr_node != node_to_delete:
                    prev_node = curr_node
                    curr_node = curr_node.next
                if node_to_delete == self.tail: # remove tail node
                    self.tail = prev_node
                    self.tail.next = None
                else: # remove an in-between node
                    prev_node.next = node_to_delete.next
            node_to_delete = None
            self.length -=1
        else:
            print(f"Cannot find node with {key} to delete")

def run_basic_ops():
    print(f"\n\nStart a new list")
    linked_list = SinglyLinkedList() # head = None, tail = None
    print(linked_list)

    print(f"--- Test append() ----")
    for n in [10, 20, 30, 40, 50, 60]:
        print(f"append data = {n}")
        linked_list.append(n)
    print(linked_list)

    print(f"--- Test find() ----")
    for n in [10, 40, 60, 80]:
        linked_list.find(n)

    print(f"--- Test remove() ----")
    for n in [40, 10, 60, 80]:
        print(f"remove data = {n}")
        linked_list.remove(n)
        print(linked_list)


run_basic_ops()
