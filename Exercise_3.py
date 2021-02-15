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
        self.head = None
        self.size = 0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node
            self.size += 1
            return
        else:
            curr_node = self.head
            while curr_node.next:
                curr_node = curr_node.next

            curr_node.next = new_node
            self.size += 1

    def prepend(self, data):
        new_node = ListNode(data)
        new_node.next = self.head
        self.head = new_node

    """def insertNode(self,prev_node,data):
        if not prev_node:
            print("Previous Node is not in the list")
            return
        new_node = ListNode(data)
        new_node.next = prev_node.next
        prev_node.next = new_node"""

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        target_node = self.head
        while target_node.next:
            if target_node.data == key:
                return target_node.data
            else:
                target_node = target_node.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr_node = self.head

        if curr_node and curr_node.data == key:
            self.head = curr_node.next
            curr_node = None
            return curr_node.data
        prev = None
        while curr_node and curr_node.data!=key:
            prev = curr_node
            curr_node = curr_node.next

        if curr_node is None:
            return None

        prev.next = curr_node.next
        curr_node = None
        return key




    def show(self):
        temp = self.head
        #print(self.head, end="-->")
        while temp.next:
            print(temp.data, end="\n")
            temp = temp.next
        print(temp.data)
        # Doubt: why do I have to print this extra print statement for printing the last node???
        print()


s = SinglyLinkedList()
s.append("A")
s.append("B")
s.append("C")
s.append("D")
s.prepend("E")
# s.insertNode("B", "X")
tn = s.find("9")
if tn is not None:
    print("Target Node: ",tn)
else:
    print("Target Node not Found!")

rn = s.remove("B")
if rn is not None:
    print("Removed Node: ", rn)
else:
    print("Target Node to be removed, not Found!")
s.show()
