# Time Complexity:
# append - O(n) because we might have to go to the end of the list
# find - O(n) because we have to check each element
# remove - O(n) because we have to search first, then remove

# Space Complexity:
# O(n) because each node we add takes space

# Any problem faced?
# Yeah, at first I forgot to handle the case where head is None in append and remove.
# Also forgot to update previous.next in remove... had to debug that.



class ListNode:
    """ A node in a singly-linked list. """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next


class SinglyLinkedList:
    def __init__(self):
        """ Creates a new empty linked list. """
        self.head = None
        print("Linked List created. Head is None.")

    def append(self, data):
        """ Add new element at end. """
        print(f"Trying to append: {data}")
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node
            print(f"List was empty. Head is now: {data}")
        else:
            current = self.head
            while current.next:
                print(f"Visited node with data: {current.data}")
                current = current.next
            current.next = new_node
            print(f"Appended {data} at the end of the list.")

    def find(self, key):
        """ Search for element with given key. """
        print(f"Looking for: {key}")
        current = self.head
        while current:
            print(f"Checking node with data: {current.data}")
            if current.data == key:
                print(f"Found node with data: {key}")
                return current
            current = current.next
        print("Key not found.")
        return None

    def remove(self, key):
        """ Remove first occurrence of key. """
        print(f"Trying to remove: {key}")
        current = self.head
        prev = None

        while current:
            print(f"Visiting node with data: {current.data}")
            if current.data == key:
                if prev is None:
                    # We're at head
                    print(f"Key found at head. Removing it.")
                    self.head = current.next
                else:
                    print(f"Key found after head. Removing it.")
                    prev.next = current.next
                return  # exit after removing
            prev = current
            current = current.next

        print("Key not found. Nothing removed.")

    def show(self):
        """ Show list contents for debugging. """
        current = self.head
        print("Linked List: ", end="")
        while current:
            print(current.data, end=" -> ")
            current = current.next
        print("None")


# Example usage:
linked_list = SinglyLinkedList()
linked_list.append(10)
linked_list.append(20)
linked_list.append(30)

linked_list.show()

found_node = linked_list.find(20)
if found_node:
    print("Found:", found_node.data)
else:
    print("Not found")

linked_list.remove(20)
linked_list.show()

linked_list.remove(10)
linked_list.show()

linked_list.remove(99)  # Try to remove something not in list

