# time Complexity = O(n), Space compexity = O(1)


class ListNode:
    """
    A node in a singly-linked list.
    """

    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next


class SinglyLinkedList:
    def __init__(self):

        self.head = ListNode(0)  # initialize the linkedList with dummy node value 0

    def append(self, data):
        new_node = ListNode(data)  # new node created with input data
        temp = self.head
        while temp.next:  # traverse till last element of the stack
            temp = temp.next
        temp.next = new_node  # add new_node to Linkedlist
        print(temp.next.data, "has been pushed to stack")

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while temp:
            if temp.data == key:  # Check if current node is equals to key
                print(key, " key found in linkedlist")
                return temp.data  # return key found
            temp = temp.next
        return None  # Return None, if key is not found in linkedList

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:  # Check if LinkedList is empty
            pass
        elif self.head.data == key:  # Check if head is equals to key
            self.head = self.head.next  # Remove key found
            print(key, " key has been removed from the linkedList")
        else:
            temp = self.head
            while temp.next:
                if temp.next.data == key:  # Check if current node is equals to key
                    temp.next = temp.next.next  # Remove key found
                temp = temp.next
            print(key, " key has been removed from the linkedList")


def main():
    singlyLinkedList = SinglyLinkedList()  # Initialize SinglyLinkedList
    singlyLinkedList.append(10)  # Append 10 to linkedList
    singlyLinkedList.append(12)  # Append 12 to linkedList
    singlyLinkedList.find(12)  # Find 12 to linkedList
    singlyLinkedList.remove(10)  # remove 10 from LinkedList
    temp = singlyLinkedList.head
    while temp:
        print(temp.data)
        temp = temp.next


if __name__ == "__main__":
    main()
